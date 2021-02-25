/**
 *  Copyright (c) 2021 CentraleSupélec.
 *  This program and the accompanying materials are made
 *  available under the terms of the Apache License version 2.0
 *  which accompanies this distribution, and is available at
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *  Web site:
 *      https://github.com/marcadetd/javaparser.ecore
 * 
 */
package fr.centralesupelec.csd.java.util;

import java.io.File;
import java.io.FileNotFoundException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration.LanguageLevel;
import com.github.javaparser.ast.visitor.GenericVisitorAdapter;

import fr.centralesupelec.csd.java.*;

public class CreateJavaModel {
    
    public CreateJavaModel() {

    }

    public Resource createJavaModel( File file ) {
        // Create a resource set to hold the resources.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file extensions.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl()
        );

        // Register the package to ensure it is available during loading.
        resourceSet.getPackageRegistry().put( JavaPackage.eNS_URI, JavaPackage.eINSTANCE );

        try {
            JavaParser javaParser = new JavaParser();
            javaParser.getParserConfiguration().setLanguageLevel( LanguageLevel.JAVA_15 );
            ParseResult< com.github.javaparser.ast.CompilationUnit > result = javaParser.parse( file );
            
            Resource resource = resourceSet.createResource ( URI.createURI( "http://csd.centralesupelec.fr/java/resource.java" ));

            result.ifSuccessful(
                    cu -> {
                        CompilationUnitVisitor cuv = new CompilationUnitVisitor();
                        CompilationUnit compilationUnit = cuv.visit( cu, JavaFactory.eINSTANCE );

                        resource.getContents().add( compilationUnit );
                    }
            );
            
            return resource;
        }
        catch( FileNotFoundException e ) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    private static class JavaNodeVisitor extends GenericVisitorAdapter< JavaNode, JavaFactory > {
        
        public JavaNode visit( com.github.javaparser.ast.Node javaParserObject, JavaFactory factory, JavaNode ecoreObject ) {
            
            javaParserObject.getComment().ifPresent(
                    co -> ecoreObject.setComment( new CommentVisitor().visit( co, factory ))
            );
            
            javaParserObject.getOrphanComments().forEach(
                    co -> ecoreObject.getOrphanComments().add( new CommentVisitor().visit( co, factory ))
            );
            
            return ecoreObject;
        }
    }

    private static class ArrayCreationLevelVisitor extends GenericVisitorAdapter< ArrayCreationLevel, JavaFactory > {

        @Override
        public ArrayCreationLevel visit( com.github.javaparser.ast.ArrayCreationLevel javaParserObject, JavaFactory factory ) {

            ArrayCreationLevel ecoreObject = factory.createArrayCreationLevel();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression dimension;
            javaParserObject.getDimension().ifPresent(
                    dim -> ecoreObject.setDimension( new ExpressionVisitor().visit( dim , factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class CompilationUnitVisitor extends GenericVisitorAdapter< CompilationUnit, JavaFactory > {

        @Override
        public CompilationUnit visit( com.github.javaparser.ast.CompilationUnit javaParserObject, JavaFactory factory ) {

            CompilationUnit ecoreObject = factory.createCompilationUnit();

            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // PackageDeclaration packageDeclaration;
            javaParserObject.getPackageDeclaration().ifPresent(
                    pd -> ecoreObject.setPackageDeclaration( new PackageDeclarationVisitor().visit( pd, factory ))
            );

            // NodeList<ImportDeclaration> imports;
            ImportDeclarationVisitor idv = new ImportDeclarationVisitor();
            javaParserObject.getImports().forEach(
                    im -> ecoreObject.getImports().add( idv.visit( im, factory ))
            );

             // NodeList<TypeDeclaration<?>> types;
             TypeDeclarationVisitor tdv = new TypeDeclarationVisitor();
             javaParserObject.getTypes().forEach(
                     ty -> ecoreObject.getTypes().add( tdv.visit( ty, factory ))
             );

             // ModuleDeclaration module;
             javaParserObject.getModule().ifPresent(
                     mo -> ecoreObject.setModule( new ModuleDeclarationVisitor().visit( mo, factory ))
             );

            return ecoreObject;
        }

    }

    private static class ImportDeclarationVisitor extends GenericVisitorAdapter< ImportDeclaration, JavaFactory > {

        @Override
        public ImportDeclaration visit( com.github.javaparser.ast.ImportDeclaration javaParserObject, JavaFactory factory ) {

            ImportDeclaration ecoreObject = factory.createImportDeclaration();

            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );

            ecoreObject.setStatic( javaParserObject.isStatic() );
            ecoreObject.setAsterisk( javaParserObject.isAsterisk() );

            return ecoreObject;
        }

    }

//    private static class ModifierVisitor extends GenericVisitorAdapter< Modifier, JavaFactory > {
//
//        @Override
//        public Modifier visit( com.github.javaparser.ast.Modifier javaParserObject, JavaFactory factory ) {
//
//            Modifier ecoreObject = factory.createModifier();
//
//            ecoreObject.setKeyword(
//                    switch( javaParserObject.getKeyword() ) {
//                    case ABSTRACT     -> ModifierKeyword.ABSTRACT;
//                    case DEFAULT      -> ModifierKeyword.DEFAULT;
//                    case FINAL        -> ModifierKeyword.FINAL;
//                    case NATIVE       -> ModifierKeyword.NATIVE;
//                    case PRIVATE      -> ModifierKeyword.PRIVATE;
//                    case PROTECTED    -> ModifierKeyword.PROTECTED;
//                    case PUBLIC       -> ModifierKeyword.PUBLIC;
//                    case STATIC       -> ModifierKeyword.STATIC;
//                    case STRICTFP     -> ModifierKeyword.STRICTFP;
//                    case SYNCHRONIZED -> ModifierKeyword.SYNCHRONIZED;
//                    case TRANSIENT    -> ModifierKeyword.TRANSIENT;
//                    case TRANSITIVE   -> ModifierKeyword.TRANSITIVE;
//                    case VOLATILE     -> ModifierKeyword.VOLATILE;
//                    } );
//                    
//            return ecoreObject;
//        }
//
//    }

    private static class PackageDeclarationVisitor extends GenericVisitorAdapter< PackageDeclaration, JavaFactory > {

        @Override
        public PackageDeclaration visit( com.github.javaparser.ast.PackageDeclaration javaParserObject, JavaFactory factory ) {

            PackageDeclaration ecoreObject = factory.createPackageDeclaration();

            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class AnnotationDeclarationVisitor extends GenericVisitorAdapter< AnnotationDeclaration, JavaFactory > {

        @Override
        public AnnotationDeclaration visit( com.github.javaparser.ast.body.AnnotationDeclaration javaParserObject, JavaFactory factory ) {

            AnnotationDeclaration ecoreObject = factory.createAnnotationDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class AnnotationMemberDeclarationVisitor extends GenericVisitorAdapter< AnnotationMemberDeclaration, JavaFactory > {

        @Override
        public AnnotationMemberDeclaration visit( com.github.javaparser.ast.body.AnnotationMemberDeclaration javaParserObject, JavaFactory factory ) {

            AnnotationMemberDeclaration ecoreObject = factory.createAnnotationMemberDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType< Type >
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithPublicModifier
            new NodeWithPublicModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().visit( javaParserObject, factory, ecoreObject );

            // Expression defaultValue;
            javaParserObject.getDefaultValue().ifPresent(
                    val -> ecoreObject.setDefaultValue( new ExpressionVisitor().visit( val, factory )) 
            );

            return ecoreObject;
        }

    }

    private static class BodyDeclarationVisitor extends GenericVisitorAdapter< BodyDeclaration, JavaFactory > {

        public BodyDeclaration visit( com.github.javaparser.ast.body.BodyDeclaration< ? > javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.body.AnnotationMemberDeclaration ) {
                return new AnnotationMemberDeclarationVisitor().visit(( com.github.javaparser.ast.body.AnnotationMemberDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.CallableDeclaration ) {
                return new CallableDeclarationVisitor().visit(( com.github.javaparser.ast.body.CallableDeclaration< ? > ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.EnumConstantDeclaration ) {
                return new EnumConstantDeclarationVisitor().visit(( com.github.javaparser.ast.body.EnumConstantDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.FieldDeclaration ) {
                return new FieldDeclarationVisitor().visit(( com.github.javaparser.ast.body.FieldDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.InitializerDeclaration ) {
                return new InitializerDeclarationVisitor().visit(( com.github.javaparser.ast.body.InitializerDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.TypeDeclaration ) {
                return new TypeDeclarationVisitor().visit(( com.github.javaparser.ast.body.TypeDeclaration< ? > ) javaParserObject, factory );
            }
            
            return null;
        }
        
        public BodyDeclaration visit( com.github.javaparser.ast.body.BodyDeclaration< ? > javaParserObject, JavaFactory factory, BodyDeclaration ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class CallableDeclarationVisitor extends GenericVisitorAdapter< CallableDeclaration, JavaFactory > {

        public CallableDeclaration visit( com.github.javaparser.ast.body.CallableDeclaration< ? > javaParserObject, JavaFactory factory ) {

            CallableDeclaration ecoreObject = null;
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.ConstructorDeclaration ) {
                ecoreObject = new ConstructorDeclarationVisitor().visit(( com.github.javaparser.ast.body.ConstructorDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.MethodDeclaration ) {
                ecoreObject = new MethodDeclarationVisitor().visit(( com.github.javaparser.ast.body.MethodDeclaration ) javaParserObject, factory );
            }

            return ecoreObject;
        }
        
        public CallableDeclaration visit( com.github.javaparser.ast.body.CallableDeclaration< ? > javaParserObject, JavaFactory factory, CallableDeclaration ecoreObject ) {
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithDeclaration: not sure it is useful
            //new NodeWithDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // ReceiverParameter receiverParameter
            javaParserObject.getReceiverParameter().ifPresent(
                    rp -> ecoreObject.setReceiverParameter( new ReceiverParameterVisitor().visit( rp, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ClassOrInterfaceDeclarationVisitor extends GenericVisitorAdapter< ClassOrInterfaceDeclaration, JavaFactory > {

        @Override
        public ClassOrInterfaceDeclaration visit( com.github.javaparser.ast.body.ClassOrInterfaceDeclaration javaParserObject, JavaFactory factory ) {

            ClassOrInterfaceDeclaration ecoreObject = factory.createClassOrInterfaceDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithImplements
            new NodeWithImplementsVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithExtends
            new NodeWithExtendsVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );

            // boolean isInterface;
            ecoreObject.setInterface( javaParserObject.isInterface() );

            return ecoreObject;
        }

    }

    private static class ConstructorDeclarationVisitor extends GenericVisitorAdapter< ConstructorDeclaration, JavaFactory > {

        @Override
        public ConstructorDeclaration visit( com.github.javaparser.ast.body.ConstructorDeclaration javaParserObject, JavaFactory factory ) {

            ConstructorDeclaration ecoreObject = factory.createConstructorDeclaration();
            
            // extends CallableDeclaration
            new CallableDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithParameters
            new NodeWithParametersVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().visit( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class EnumConstantDeclarationVisitor extends GenericVisitorAdapter< EnumConstantDeclaration, JavaFactory > {

        @Override
        public EnumConstantDeclaration visit( com.github.javaparser.ast.body.EnumConstantDeclaration javaParserObject, JavaFactory factory ) {

            EnumConstantDeclaration ecoreObject = factory.createEnumConstantDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<BodyDeclaration<?>> classBody;
            javaParserObject.getClassBody().forEach(
                    cb -> ecoreObject.getClassBody().add( new BodyDeclarationVisitor().visit( cb, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class EnumDeclarationVisitor extends GenericVisitorAdapter< EnumDeclaration, JavaFactory > {

        @Override
        public EnumDeclaration visit( com.github.javaparser.ast.body.EnumDeclaration javaParserObject, JavaFactory factory ) {

            EnumDeclaration ecoreObject = factory.createEnumDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithImplements
            new NodeWithImplementsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<EnumConstantDeclaration> entries;
            javaParserObject.getEntries().forEach(
                    en -> ecoreObject.getEntries().add(  new EnumConstantDeclarationVisitor().visit( en, factory ))
            );

            return ecoreObject;
        }

    }

    private static class FieldDeclarationVisitor extends GenericVisitorAdapter< FieldDeclaration, JavaFactory > {

        @Override
        public FieldDeclaration visit( com.github.javaparser.ast.body.FieldDeclaration javaParserObject, JavaFactory factory ) {

            FieldDeclaration ecoreObject = factory.createFieldDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithVariables
            new NodeWithVariablesVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithTransientModifier
            new NodeWithTransientModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithVolatileModifier
            new NodeWithVolatileModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class InitializerDeclarationVisitor extends GenericVisitorAdapter< InitializerDeclaration, JavaFactory > {

        @Override
        public InitializerDeclaration visit( com.github.javaparser.ast.body.InitializerDeclaration javaParserObject, JavaFactory factory ) {

            InitializerDeclaration ecoreObject = factory.createInitializerDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // boolean isStatic;
            ecoreObject.setStatic( javaParserObject.isStatic() );
            
            return ecoreObject;
        }

    }

    private static class MethodDeclarationVisitor extends GenericVisitorAdapter< MethodDeclaration, JavaFactory > {

        @Override
        public MethodDeclaration visit( com.github.javaparser.ast.body.MethodDeclaration javaParserObject, JavaFactory factory ) {

            MethodDeclaration ecoreObject = factory.createMethodDeclaration();
            
            // extends CallableDeclaration
            new CallableDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithOptionalBlockStmt
            new NodeWithBlockStmtVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithDeclaration: not sure it is useful
            //new NodeWithDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithSynchronizedModifier
            new NodeWithSynchronizedModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithNativeModifier
            new NodeWithNativeModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithDefaultModifier
            new NodeWithDefaultModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ParameterVisitor extends GenericVisitorAdapter< Parameter, JavaFactory > {

        @Override
        public Parameter visit( com.github.javaparser.ast.body.Parameter javaParserObject, JavaFactory factory ) {

            Parameter ecoreObject = factory.createParameter();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // boolean isVarArgs
            ecoreObject.setVarArgs( javaParserObject.isVarArgs() );
            
            return ecoreObject;
        }

    }

    private static class ReceiverParameterVisitor extends GenericVisitorAdapter< ReceiverParameter, JavaFactory > {

        @Override
        public ReceiverParameter visit( com.github.javaparser.ast.body.ReceiverParameter javaParserObject, JavaFactory factory ) {

            ReceiverParameter ecoreObject = factory.createReceiverParameter();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeDeclarationVisitor extends GenericVisitorAdapter< TypeDeclaration, JavaFactory > {

        public TypeDeclaration visit( com.github.javaparser.ast.body.TypeDeclaration< ? > javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.body.AnnotationDeclaration ) {
                return new AnnotationDeclarationVisitor().visit( ( com.github.javaparser.ast.body.AnnotationDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.ClassOrInterfaceDeclaration ) {
                return new ClassOrInterfaceDeclarationVisitor().visit( ( com.github.javaparser.ast.body.ClassOrInterfaceDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.EnumDeclaration ) {
                return new EnumDeclarationVisitor().visit( ( com.github.javaparser.ast.body.EnumDeclaration ) javaParserObject, factory );
            }
            
            return null;
        }

        public TypeDeclaration visit( com.github.javaparser.ast.body.TypeDeclaration< ? > javaParserObject, JavaFactory factory, TypeDeclaration ecoreObject ) {
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithMembers
            new NodeWithMembersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().visit( javaParserObject, factory, ecoreObject );
                        
            return ecoreObject;
        }

    }

    private static class VariableDeclaratorVisitor extends GenericVisitorAdapter< VariableDeclarator, JavaFactory > {

        @Override
        public VariableDeclarator visit( com.github.javaparser.ast.body.VariableDeclarator javaParserObject, JavaFactory factory ) {

            VariableDeclarator ecoreObject = factory.createVariableDeclarator();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression initializer;
            javaParserObject.getInitializer().ifPresent(
                    in -> ecoreObject.setInitializer( new ExpressionVisitor().visit( in, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class BlockCommentVisitor extends GenericVisitorAdapter< BlockComment, JavaFactory > {

        @Override
        public BlockComment visit( com.github.javaparser.ast.comments.BlockComment javaParserObject, JavaFactory factory ) {

            BlockComment ecoreObject = factory.createBlockComment();
            
            // extends Comment
            new CommentVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class CommentVisitor extends GenericVisitorAdapter< Comment, JavaFactory > {

        public Comment visit( com.github.javaparser.ast.comments.Comment javaParserObject, JavaFactory factory ) {
            
            if( javaParserObject instanceof com.github.javaparser.ast.comments.BlockComment ) {
                return new BlockCommentVisitor().visit( ( com.github.javaparser.ast.comments.BlockComment ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.comments.JavadocComment ) {
                return new JavadocCommentVisitor().visit( ( com.github.javaparser.ast.comments.JavadocComment ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.comments.LineComment ) {
                return new LineCommentVisitor().visit( ( com.github.javaparser.ast.comments.LineComment ) javaParserObject, factory );
            }
            
            return null;
        }


        public Comment visit( com.github.javaparser.ast.comments.Comment javaParserObject, JavaFactory factory, Comment ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // String content;
            ecoreObject.setContent( javaParserObject.getContent() );
            
            return ecoreObject;
        }
    }

    private static class JavadocCommentVisitor extends GenericVisitorAdapter< JavadocComment, JavaFactory > {

        @Override
        public JavadocComment visit( com.github.javaparser.ast.comments.JavadocComment javaParserObject, JavaFactory factory ) {

            JavadocComment ecoreObject = factory.createJavadocComment();
            
            // extends Comment
            new CommentVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class LineCommentVisitor extends GenericVisitorAdapter< LineComment, JavaFactory > {

        @Override
        public LineComment visit( com.github.javaparser.ast.comments.LineComment javaParserObject, JavaFactory factory ) {

            LineComment ecoreObject = factory.createLineComment();
            
            // extends Comment
            new CommentVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class AnnotationExprVisitor extends GenericVisitorAdapter< AnnotationExpr, JavaFactory > {

        public AnnotationExpr visit( com.github.javaparser.ast.expr.AnnotationExpr javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.expr.MarkerAnnotationExpr ) {
                return new MarkerAnnotationExprVisitor().visit(( com.github.javaparser.ast.expr.MarkerAnnotationExpr ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.expr.NormalAnnotationExpr ) {
                return new NormalAnnotationExprVisitor().visit(( com.github.javaparser.ast.expr.NormalAnnotationExpr ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.expr.SingleMemberAnnotationExpr ) {
                return new SingleMemberAnnotationExprVisitor().visit(( com.github.javaparser.ast.expr.SingleMemberAnnotationExpr ) javaParserObject, factory );
            }

            return null;
        }

        public AnnotationExpr visit( com.github.javaparser.ast.expr.AnnotationExpr javaParserObject, JavaFactory factory, AnnotationExpr ecoreObject ) {
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ArrayAccessExprVisitor extends GenericVisitorAdapter< ArrayAccessExpr, JavaFactory > {

        @Override
        public ArrayAccessExpr visit( com.github.javaparser.ast.expr.ArrayAccessExpr javaParserObject, JavaFactory factory ) {

            ArrayAccessExpr ecoreObject = factory.createArrayAccessExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression name
            ecoreObject.setName( new ExpressionVisitor().visit( javaParserObject.getName(), factory, ecoreObject ));
            
            // Expression index
            ecoreObject.setIndex( new ExpressionVisitor().visit( javaParserObject.getIndex(), factory, ecoreObject ));
            
            return ecoreObject;
        }

    }

    private static class ArrayCreationExprVisitor extends GenericVisitorAdapter< ArrayCreationExpr, JavaFactory > {

        @Override
        public ArrayCreationExpr visit( com.github.javaparser.ast.expr.ArrayCreationExpr javaParserObject, JavaFactory factory ) {

            ArrayCreationExpr ecoreObject = factory.createArrayCreationExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<ArrayCreationLevel> levels;
            javaParserObject.getLevels().forEach(
                    le -> ecoreObject.getLevels().add( new ArrayCreationLevelVisitor().visit( le, factory ))
            );
            
            // Type elementType;
            ecoreObject.setElementType( new TypeVisitor().visit( javaParserObject.getElementType(), factory ));
            
            // ArrayInitializerExpr initializer;
            javaParserObject.getInitializer().ifPresent(
                    in -> ecoreObject.setInitializer( new ArrayInitializerExprVisitor().visit( in, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class ArrayInitializerExprVisitor extends GenericVisitorAdapter< ArrayInitializerExpr, JavaFactory > {

        @Override
        public ArrayInitializerExpr visit( com.github.javaparser.ast.expr.ArrayInitializerExpr javaParserObject, JavaFactory factory ) {

            ArrayInitializerExpr ecoreObject = factory.createArrayInitializerExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<Expression> values;
            javaParserObject.getValues().forEach(
                    val -> ecoreObject.getValues().add(  new ExpressionVisitor().visit( val, factory, ecoreObject ))
            );
            
            return ecoreObject;
        }

    }

    private static class AssignExprVisitor extends GenericVisitorAdapter< AssignExpr, JavaFactory > {

        @Override
        public AssignExpr visit( com.github.javaparser.ast.expr.AssignExpr javaParserObject, JavaFactory factory ) {

            AssignExpr ecoreObject = factory.createAssignExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression target;
            ecoreObject.setTarget( new ExpressionVisitor().visit( javaParserObject.getTarget(), factory, ecoreObject ));
            
            // Expression value;
            ecoreObject.setValue( new ExpressionVisitor().visit( javaParserObject.getValue(), factory, ecoreObject ));
            
            // Operator operator;
            ecoreObject.setOperator(
                    switch( javaParserObject.getOperator() ) {
                    case ASSIGN               -> AssignOperator.ASSIGN;
                    case BINARY_AND           -> AssignOperator.BINARY_AND;
                    case BINARY_OR            -> AssignOperator.BINARY_OR;
                    case DIVIDE               -> AssignOperator.DIVIDE;
                    case LEFT_SHIFT           -> AssignOperator.LEFT_SHIFT;
                    case MINUS                -> AssignOperator.MINUS;
                    case MULTIPLY             -> AssignOperator.MULTIPLY;
                    case PLUS                 -> AssignOperator.PLUS;
                    case REMAINDER            -> AssignOperator.REMAINDER;
                    case SIGNED_RIGHT_SHIFT   -> AssignOperator.SIGNED_RIGHT_SHIFT;
                    case UNSIGNED_RIGHT_SHIFT -> AssignOperator.UNSIGNED_RIGHT_SHIFT;
                    case XOR                  -> AssignOperator.XOR;
                    }
            );
            
            return ecoreObject;
        }

    }

    private static class BinaryExprVisitor extends GenericVisitorAdapter< BinaryExpr, JavaFactory > {

        @Override
        public BinaryExpr visit( com.github.javaparser.ast.expr.BinaryExpr javaParserObject, JavaFactory factory ) {

            BinaryExpr ecoreObject = factory.createBinaryExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression left;
            ecoreObject.setLeft( new ExpressionVisitor().visit( javaParserObject.getLeft(), factory, ecoreObject ));
            
            // Expression right;
            ecoreObject.setRight( new ExpressionVisitor().visit( javaParserObject.getRight(), factory, ecoreObject ));
            
            // Operator operator;
            ecoreObject.setOperator(
                    switch( javaParserObject.getOperator() ) {
                    case AND                  -> BinaryOperator.AND;
                    case BINARY_AND           -> BinaryOperator.BINARY_AND;
                    case BINARY_OR            -> BinaryOperator.BINARY_OR;
                    case DIVIDE               -> BinaryOperator.DIVIDE;
                    case EQUALS               -> BinaryOperator.EQUALS;
                    case GREATER              -> BinaryOperator.GREATER;
                    case GREATER_EQUALS       -> BinaryOperator.GREATER_EQUALS;
                    case LEFT_SHIFT           -> BinaryOperator.LEFT_SHIFT;
                    case LESS                 -> BinaryOperator.LESS;
                    case LESS_EQUALS          -> BinaryOperator.LESS_EQUALS;
                    case MINUS                -> BinaryOperator.MINUS;
                    case MULTIPLY             -> BinaryOperator.MULTIPLY;
                    case NOT_EQUALS           -> BinaryOperator.NOT_EQUALS;
                    case OR                   -> BinaryOperator.OR;
                    case PLUS                 -> BinaryOperator.PLUS;
                    case REMAINDER            -> BinaryOperator.REMAINDER;
                    case SIGNED_RIGHT_SHIFT   -> BinaryOperator.SIGNED_RIGHT_SHIFT;
                    case UNSIGNED_RIGHT_SHIFT -> BinaryOperator.UNSIGNED_RIGHT_SHIFT;
                    case XOR                  -> BinaryOperator.XOR;
                    }
            );
            
            return ecoreObject;
        }

    }

    private static class BooleanLiteralExprVisitor extends GenericVisitorAdapter< BooleanLiteralExpr, JavaFactory > {

        @Override
        public BooleanLiteralExpr visit( com.github.javaparser.ast.expr.BooleanLiteralExpr javaParserObject, JavaFactory factory ) {

            BooleanLiteralExpr ecoreObject = factory.createBooleanLiteralExpr();
            
            // extends LiteralExpr
            new LiteralExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // boolean value;
            ecoreObject.setValue( javaParserObject.getValue() );
            
            return ecoreObject;
        }

    }

    private static class CastExprVisitor extends GenericVisitorAdapter< CastExpr, JavaFactory > {

        @Override
        public CastExpr visit( com.github.javaparser.ast.expr.CastExpr javaParserObject, JavaFactory factory ) {

            CastExpr ecoreObject = factory.createCastExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class CharLiteralExprVisitor extends GenericVisitorAdapter< CharLiteralExpr, JavaFactory > {

        @Override
        public CharLiteralExpr visit( com.github.javaparser.ast.expr.CharLiteralExpr javaParserObject, JavaFactory factory ) {

            CharLiteralExpr ecoreObject = factory.createCharLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ClassExprVisitor extends GenericVisitorAdapter< ClassExpr, JavaFactory > {

        @Override
        public ClassExpr visit( com.github.javaparser.ast.expr.ClassExpr javaParserObject, JavaFactory factory ) {

            ClassExpr ecoreObject = factory.createClassExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ConditionalExprVisitor extends GenericVisitorAdapter< ConditionalExpr, JavaFactory > {

        @Override
        public ConditionalExpr visit( com.github.javaparser.ast.expr.ConditionalExpr javaParserObject, JavaFactory factory ) {

            ConditionalExpr ecoreObject = factory.createConditionalExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression condition;
            ecoreObject.setCondition( new ExpressionVisitor().visit( javaParserObject.getCondition(), factory ));
            
            // Expression thenExpr;
            ecoreObject.setThenExpr( new ExpressionVisitor().visit( javaParserObject.getThenExpr(), factory ));
            
            // Expression elseExpr;
            ecoreObject.setElseExpr( new ExpressionVisitor().visit( javaParserObject.getElseExpr(), factory ));
            
            return ecoreObject;
        }

    }

    private static class DoubleLiteralExprVisitor extends GenericVisitorAdapter< DoubleLiteralExpr, JavaFactory > {

        @Override
        public DoubleLiteralExpr visit( com.github.javaparser.ast.expr.DoubleLiteralExpr javaParserObject, JavaFactory factory ) {

            DoubleLiteralExpr ecoreObject = factory.createDoubleLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class EnclosedExprVisitor extends GenericVisitorAdapter< EnclosedExpr, JavaFactory > {

        @Override
        public EnclosedExpr visit( com.github.javaparser.ast.expr.EnclosedExpr javaParserObject, JavaFactory factory ) {

            EnclosedExpr ecoreObject = factory.createEnclosedExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression inner;
            ecoreObject.setInner( new ExpressionVisitor().visit( javaParserObject.getInner(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ExpressionVisitor extends GenericVisitorAdapter< Expression, JavaFactory > {

        public Expression visit( com.github.javaparser.ast.expr.Expression javaParserObject, JavaFactory factory ) {
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.AnnotationExpr ) {
                return new AnnotationExprVisitor().visit( ( com.github.javaparser.ast.expr.AnnotationExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ArrayAccessExpr ) {
                return new ArrayAccessExprVisitor().visit( ( com.github.javaparser.ast.expr.ArrayAccessExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ArrayCreationExpr ) {
                return new ArrayCreationExprVisitor().visit( ( com.github.javaparser.ast.expr.ArrayCreationExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ArrayInitializerExpr ) {
                return new ArrayInitializerExprVisitor().visit( ( com.github.javaparser.ast.expr.ArrayInitializerExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.AssignExpr ) {
                return new AssignExprVisitor().visit( ( com.github.javaparser.ast.expr.AssignExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.BinaryExpr ) {
                return new BinaryExprVisitor().visit( ( com.github.javaparser.ast.expr.BinaryExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.BooleanLiteralExpr ) {
                return new BooleanLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.BooleanLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.CastExpr ) {
                return new CastExprVisitor().visit( ( com.github.javaparser.ast.expr.CastExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.CharLiteralExpr ) {
                return new CharLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.CharLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ClassExpr ) {
                return new ClassExprVisitor().visit( ( com.github.javaparser.ast.expr.ClassExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ConditionalExpr ) {
                return new ConditionalExprVisitor().visit( ( com.github.javaparser.ast.expr.ConditionalExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.DoubleLiteralExpr ) {
                return new DoubleLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.DoubleLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.EnclosedExpr ) {
                return new EnclosedExprVisitor().visit( ( com.github.javaparser.ast.expr.EnclosedExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.FieldAccessExpr ) {
                return new FieldAccessExprVisitor().visit( ( com.github.javaparser.ast.expr.FieldAccessExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.InstanceOfExpr ) {
                return new InstanceOfExprVisitor().visit( ( com.github.javaparser.ast.expr.InstanceOfExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.LambdaExpr ) {
                return new LambdaExprVisitor().visit( ( com.github.javaparser.ast.expr.LambdaExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.LiteralExpr ) {
                return new LiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.LiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.MethodCallExpr ) {
                return new MethodCallExprVisitor().visit( ( com.github.javaparser.ast.expr.MethodCallExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.MethodReferenceExpr ) {
                return new MethodReferenceExprVisitor().visit( ( com.github.javaparser.ast.expr.MethodReferenceExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.NameExpr ) {
                return new NameExprVisitor().visit( ( com.github.javaparser.ast.expr.NameExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ObjectCreationExpr ) {
                return new ObjectCreationExprVisitor().visit( ( com.github.javaparser.ast.expr.ObjectCreationExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.PatternExpr ) {
                return new PatternExprVisitor().visit( ( com.github.javaparser.ast.expr.PatternExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.SuperExpr ) {
                return new SuperExprVisitor().visit( ( com.github.javaparser.ast.expr.SuperExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.SwitchExpr ) {
                return new SwitchExprVisitor().visit( ( com.github.javaparser.ast.expr.SwitchExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.ThisExpr ) {
                return new ThisExprVisitor().visit( ( com.github.javaparser.ast.expr.ThisExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.TypeExpr ) {
                return new TypeExprVisitor().visit( ( com.github.javaparser.ast.expr.TypeExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.UnaryExpr ) {
                return new UnaryExprVisitor().visit( ( com.github.javaparser.ast.expr.UnaryExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.VariableDeclarationExpr ) {
                return new VariableDeclarationExprVisitor().visit( ( com.github.javaparser.ast.expr.VariableDeclarationExpr ) javaParserObject, factory );
            }

            return null;
        }

        public Expression visit( com.github.javaparser.ast.expr.Expression javaParserObject, JavaFactory factory, Expression ecoreObject ) {

            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
                      
            return ecoreObject;
        }

    }

    private static class FieldAccessExprVisitor extends GenericVisitorAdapter< FieldAccessExpr, JavaFactory > {

        @Override
        public FieldAccessExpr visit( com.github.javaparser.ast.expr.FieldAccessExpr javaParserObject, JavaFactory factory ) {

            FieldAccessExpr ecoreObject = factory.createFieldAccessExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithScope
            new NodeWithScopeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class InstanceOfExprVisitor extends GenericVisitorAdapter< InstanceOfExpr, JavaFactory > {

        @Override
        public InstanceOfExpr visit( com.github.javaparser.ast.expr.InstanceOfExpr javaParserObject, JavaFactory factory ) {

            InstanceOfExpr ecoreObject = factory.createInstanceOfExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< ReferenceType >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // PatternExpr pattern;
            javaParserObject.getPattern().ifPresent(
                    pa -> ecoreObject.setPattern( new PatternExprVisitor().visit( pa, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class IntegerLiteralExprVisitor extends GenericVisitorAdapter< IntegerLiteralExpr, JavaFactory > {

        @Override
        public IntegerLiteralExpr visit( com.github.javaparser.ast.expr.IntegerLiteralExpr javaParserObject, JavaFactory factory ) {

            IntegerLiteralExpr ecoreObject = factory.createIntegerLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class LambdaExprVisitor extends GenericVisitorAdapter< LambdaExpr, JavaFactory > {

        @Override
        public LambdaExpr visit( com.github.javaparser.ast.expr.LambdaExpr javaParserObject, JavaFactory factory ) {

            LambdaExpr ecoreObject = factory.createLambdaExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // boolean isEnclosingParameters;
            ecoreObject.setEnclosingParameters( javaParserObject.isEnclosingParameters() );
            
            // Statement body;
            ecoreObject.setBody( new StatementVisitor().visit( javaParserObject, factory ));
            
            return ecoreObject;
        }

    }

    private static class LiteralExprVisitor extends GenericVisitorAdapter< LiteralExpr, JavaFactory > {

        public LiteralExpr visit( com.github.javaparser.ast.expr.LiteralExpr javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.expr.BooleanLiteralExpr ) {
                return new BooleanLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.BooleanLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.LiteralStringValueExpr ) {
                return new LiteralStringValueExprVisitor().visit( ( com.github.javaparser.ast.expr.LiteralStringValueExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.NullLiteralExpr ) {
                return new NullLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.NullLiteralExpr ) javaParserObject, factory );
            }
            
            return null;
        }


        public LiteralExpr visit( com.github.javaparser.ast.expr.LiteralExpr javaParserObject, JavaFactory factory, LiteralExpr ecoreObject ) {
            
            // Nothing
            
            return ecoreObject;
        }

    }

    private static class LiteralStringValueExprVisitor extends GenericVisitorAdapter< LiteralStringValueExpr, JavaFactory > {

        public LiteralStringValueExpr visit( com.github.javaparser.ast.expr.LiteralStringValueExpr javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.expr.CharLiteralExpr ) {
                return new CharLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.CharLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.DoubleLiteralExpr ) {
                return new DoubleLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.DoubleLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.IntegerLiteralExpr ) {
                return new IntegerLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.IntegerLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.LongLiteralExpr ) {
                return new LongLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.LongLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.StringLiteralExpr ) {
                return new StringLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.StringLiteralExpr ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.expr.TextBlockLiteralExpr ) {
                return new TextBlockLiteralExprVisitor().visit( ( com.github.javaparser.ast.expr.TextBlockLiteralExpr ) javaParserObject, factory );
            }
            
            return null;
        }


        public LiteralStringValueExpr visit( com.github.javaparser.ast.expr.LiteralStringValueExpr javaParserObject, JavaFactory factory, LiteralStringValueExpr ecoreObject ) {
            
            // String value;
            ecoreObject.setValue( javaParserObject.getValue() );
            
            return ecoreObject;
        }

    }

    private static class LongLiteralExprVisitor extends GenericVisitorAdapter< LongLiteralExpr, JavaFactory > {

        @Override
        public LongLiteralExpr visit( com.github.javaparser.ast.expr.LongLiteralExpr javaParserObject, JavaFactory factory ) {

            LongLiteralExpr ecoreObject = factory.createLongLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class MarkerAnnotationExprVisitor extends GenericVisitorAdapter< MarkerAnnotationExpr, JavaFactory > {

        @Override
        public MarkerAnnotationExpr visit( com.github.javaparser.ast.expr.MarkerAnnotationExpr javaParserObject, JavaFactory factory ) {

            MarkerAnnotationExpr ecoreObject = factory.createMarkerAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class MemberValuePairVisitor extends GenericVisitorAdapter< MemberValuePair, JavaFactory > {

        @Override
        public MemberValuePair visit( com.github.javaparser.ast.expr.MemberValuePair javaParserObject, JavaFactory factory ) {

            MemberValuePair ecoreObject = factory.createMemberValuePair();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression value;
            ecoreObject.setValue( new ExpressionVisitor().visit( javaParserObject.getValue(), factory ));

            return ecoreObject;
        }

    }

    private static class MethodCallExprVisitor extends GenericVisitorAdapter< MethodCallExpr, JavaFactory > {

        @Override
        public MethodCallExpr visit( com.github.javaparser.ast.expr.MethodCallExpr javaParserObject, JavaFactory factory ) {

            MethodCallExpr ecoreObject = factory.createMethodCallExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalScope
            new NodeWithScopeVisitor().visit( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class MethodReferenceExprVisitor extends GenericVisitorAdapter< MethodReferenceExpr, JavaFactory > {

        @Override
        public MethodReferenceExpr visit( com.github.javaparser.ast.expr.MethodReferenceExpr javaParserObject, JavaFactory factory ) {

            MethodReferenceExpr ecoreObject = factory.createMethodReferenceExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NameVisitor extends GenericVisitorAdapter< Name, JavaFactory > {

        @Override
        public Name visit( com.github.javaparser.ast.expr.Name javaParserObject, JavaFactory factory ) {

            Name ecoreObject = factory.createName();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Name qualifier;
            javaParserObject.getQualifier().ifPresent(
                    qual -> ecoreObject.setQualifier( this.visit( qual, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NameExprVisitor extends GenericVisitorAdapter< NameExpr, JavaFactory > {

        @Override
        public NameExpr visit( com.github.javaparser.ast.expr.NameExpr javaParserObject, JavaFactory factory ) {

            NameExpr ecoreObject = factory.createNameExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NormalAnnotationExprVisitor extends GenericVisitorAdapter< NormalAnnotationExpr, JavaFactory > {

        @Override
        public NormalAnnotationExpr visit( com.github.javaparser.ast.expr.NormalAnnotationExpr javaParserObject, JavaFactory factory ) {

            NormalAnnotationExpr ecoreObject = factory.createNormalAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<MemberValuePair> pairs;
            MemberValuePairVisitor mvpv = new MemberValuePairVisitor();
            javaParserObject.getPairs().forEach(
                    pa -> ecoreObject.getPairs().add( mvpv.visit( pa, factory ))
            );

            return ecoreObject;
        }

    }

    private static class NullLiteralExprVisitor extends GenericVisitorAdapter< NullLiteralExpr, JavaFactory > {

        @Override
        public NullLiteralExpr visit( com.github.javaparser.ast.expr.NullLiteralExpr javaParserObject, JavaFactory factory ) {

            NullLiteralExpr ecoreObject = factory.createNullLiteralExpr();
            
            // extends LiteralExpr
            new LiteralExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ObjectCreationExprVisitor extends GenericVisitorAdapter< ObjectCreationExpr, JavaFactory > {

        @Override
        public ObjectCreationExpr visit( com.github.javaparser.ast.expr.ObjectCreationExpr javaParserObject, JavaFactory factory ) {

            ObjectCreationExpr ecoreObject = factory.createObjectCreationExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType<ClassOrInterfaceType>
            new NodeWithTypeVisitor< ClassOrInterfaceType >().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalScope
            new NodeWithScopeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<BodyDeclaration<?>> anonymousClassBody;
            javaParserObject.getAnonymousClassBody().ifPresent(
                    acbl -> acbl.forEach(
                            acb -> ecoreObject.getAnonymousClassBody().add( new BodyDeclarationVisitor().visit( acb, factory ))
                    )
            );
            
            return ecoreObject;
        }

    }

    private static class PatternExprVisitor extends GenericVisitorAdapter< PatternExpr, JavaFactory > {

        @Override
        public PatternExpr visit( com.github.javaparser.ast.expr.PatternExpr javaParserObject, JavaFactory factory ) {

            PatternExpr ecoreObject = factory.createPatternExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< ReferenceType >().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SimpleNameVisitor extends GenericVisitorAdapter< SimpleName, JavaFactory > {

        @Override
        public SimpleName visit( com.github.javaparser.ast.expr.SimpleName javaParserObject, JavaFactory factory ) {

            SimpleName ecoreObject = factory.createSimpleName();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SingleMemberAnnotationExprVisitor extends GenericVisitorAdapter< SingleMemberAnnotationExpr, JavaFactory > {

        @Override
        public SingleMemberAnnotationExpr visit( com.github.javaparser.ast.expr.SingleMemberAnnotationExpr javaParserObject, JavaFactory factory ) {

            SingleMemberAnnotationExpr ecoreObject = factory.createSingleMemberAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression memberValue;
            ecoreObject.setMemberValue( new ExpressionVisitor().visit( javaParserObject.getMemberValue(), factory ));

            return ecoreObject;
        }

    }

    private static class StringLiteralExprVisitor extends GenericVisitorAdapter< StringLiteralExpr, JavaFactory > {

        @Override
        public StringLiteralExpr visit( com.github.javaparser.ast.expr.StringLiteralExpr javaParserObject, JavaFactory factory ) {

            StringLiteralExpr ecoreObject = factory.createStringLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SuperExprVisitor extends GenericVisitorAdapter< SuperExpr, JavaFactory > {

        @Override
        public SuperExpr visit( com.github.javaparser.ast.expr.SuperExpr javaParserObject, JavaFactory factory ) {

            SuperExpr ecoreObject = factory.createSuperExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Name typeName;
            javaParserObject.getTypeName().ifPresent(
                    tn -> ecoreObject.setTypeName( new NameVisitor().visit( tn, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class SwitchExprVisitor extends GenericVisitorAdapter< SwitchExpr, JavaFactory > {

        @Override
        public SwitchExpr visit( com.github.javaparser.ast.expr.SwitchExpr javaParserObject, JavaFactory factory ) {

            SwitchExpr ecoreObject = factory.createSwitchExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements SwitchNode
            new SwitchNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TextBlockLiteralExprVisitor extends GenericVisitorAdapter< TextBlockLiteralExpr, JavaFactory > {

        @Override
        public TextBlockLiteralExpr visit( com.github.javaparser.ast.expr.TextBlockLiteralExpr javaParserObject, JavaFactory factory ) {

            TextBlockLiteralExpr ecoreObject = factory.createTextBlockLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ThisExprVisitor extends GenericVisitorAdapter< ThisExpr, JavaFactory > {

        @Override
        public ThisExpr visit( com.github.javaparser.ast.expr.ThisExpr javaParserObject, JavaFactory factory ) {

            ThisExpr ecoreObject = factory.createThisExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Name typeName;
            javaParserObject.getTypeName().ifPresent(
                    tn -> ecoreObject.setTypeName( new NameVisitor().visit( tn, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class TypeExprVisitor extends GenericVisitorAdapter< TypeExpr, JavaFactory > {

        @Override
        public TypeExpr visit( com.github.javaparser.ast.expr.TypeExpr javaParserObject, JavaFactory factory ) {

            TypeExpr ecoreObject = factory.createTypeExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class UnaryExprVisitor extends GenericVisitorAdapter< UnaryExpr, JavaFactory > {

        @Override
        public UnaryExpr visit( com.github.javaparser.ast.expr.UnaryExpr javaParserObject, JavaFactory factory ) {

            UnaryExpr ecoreObject = factory.createUnaryExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Operator operator;
            ecoreObject.setOperator(
                    switch( javaParserObject.getOperator() ) {
                    case MINUS              -> UnaryOperator.MINUS;
                    case PLUS               -> UnaryOperator.PLUS;
                    case BITWISE_COMPLEMENT -> UnaryOperator.BITWISE_COMPLEMENT;
                    case LOGICAL_COMPLEMENT -> UnaryOperator.LOGICAL_COMPLEMENT;
                    case POSTFIX_DECREMENT  -> UnaryOperator.POSTFIX_DECREMENT;
                    case POSTFIX_INCREMENT  -> UnaryOperator.POSTFIX_INCREMENT;
                    case PREFIX_DECREMENT   -> UnaryOperator.PREFIX_DECREMENT;
                    case PREFIX_INCREMENT   -> UnaryOperator.PREFIX_INCREMENT;
                    }
            );
            
            return ecoreObject;
        }

    }

    private static class VariableDeclarationExprVisitor extends GenericVisitorAdapter< VariableDeclarationExpr, JavaFactory > {

        @Override
        public VariableDeclarationExpr visit( com.github.javaparser.ast.expr.VariableDeclarationExpr javaParserObject, JavaFactory factory ) {

            VariableDeclarationExpr ecoreObject = factory.createVariableDeclarationExpr();
            
            // extends Expression
            new ExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithVariables
            new NodeWithVariablesVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleDeclarationVisitor extends GenericVisitorAdapter< ModuleDeclaration, JavaFactory > {

        @Override
        public ModuleDeclaration visit( com.github.javaparser.ast.modules.ModuleDeclaration javaParserObject, JavaFactory factory ) {

            ModuleDeclaration ecoreObject = factory.createModuleDeclaration();

            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );

            // private boolean isOpen;
            ecoreObject.setOpen( javaParserObject.isOpen() );

            // private NodeList<ModuleDirective> directives;
            javaParserObject.getDirectives().forEach(
                    d -> ecoreObject.getDirectives().add( new ModuleDirectiveVisitor().visit( d, factory ) ) );

            return ecoreObject;
        }

    }

    private static class ModuleDirectiveVisitor extends GenericVisitorAdapter< ModuleDirective, JavaFactory > {

        public ModuleDirective visit( com.github.javaparser.ast.modules.ModuleDirective javaParserObject, JavaFactory factory ) {
            
            if( javaParserObject instanceof com.github.javaparser.ast.modules.ModuleExportsDirective ) {
                return new ModuleExportsDirectiveVisitor().visit(( com.github.javaparser.ast.modules.ModuleExportsDirective ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.modules.ModuleOpensDirective ) {
                return new ModuleOpensDirectiveVisitor().visit( ( com.github.javaparser.ast.modules.ModuleOpensDirective ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.modules.ModuleProvidesDirective ) {
                return new ModuleProvidesDirectiveVisitor().visit( ( com.github.javaparser.ast.modules.ModuleProvidesDirective ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.modules.ModuleRequiresDirective ) {
                return new ModuleRequiresDirectiveVisitor().visit( ( com.github.javaparser.ast.modules.ModuleRequiresDirective ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.modules.ModuleUsesDirective ) {
                return new ModuleUsesDirectiveVisitor().visit( ( com.github.javaparser.ast.modules.ModuleUsesDirective ) javaParserObject, factory );
            }
            
            return null;
        }

        public ModuleDirective visit( com.github.javaparser.ast.modules.ModuleDirective javaParserObject, JavaFactory factory, ModuleDirective ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleExportsDirectiveVisitor extends GenericVisitorAdapter< ModuleExportsDirective, JavaFactory > {

        @Override
        public ModuleExportsDirective visit( com.github.javaparser.ast.modules.ModuleExportsDirective javaParserObject, JavaFactory factory ) {

            ModuleExportsDirective ecoreObject = factory.createModuleExportsDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getModuleNames().forEach(
                    name -> ecoreObject.getModuleNames().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleOpensDirectiveVisitor extends GenericVisitorAdapter< ModuleOpensDirective, JavaFactory > {

        @Override
        public ModuleOpensDirective visit( com.github.javaparser.ast.modules.ModuleOpensDirective javaParserObject, JavaFactory factory ) {

            ModuleOpensDirective ecoreObject = factory.createModuleOpensDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getModuleNames().forEach(
                    name -> ecoreObject.getModuleNames().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleProvidesDirectiveVisitor extends GenericVisitorAdapter< ModuleProvidesDirective, JavaFactory > {

        @Override
        public ModuleProvidesDirective visit( com.github.javaparser.ast.modules.ModuleProvidesDirective javaParserObject, JavaFactory factory ) {

            ModuleProvidesDirective ecoreObject = factory.createModuleProvidesDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getWith().forEach(
                    name -> ecoreObject.getWith().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleRequiresDirectiveVisitor extends GenericVisitorAdapter< ModuleRequiresDirective, JavaFactory > {

        @Override
        public ModuleRequiresDirective visit( com.github.javaparser.ast.modules.ModuleRequiresDirective javaParserObject, JavaFactory factory ) {

            ModuleRequiresDirective ecoreObject = factory.createModuleRequiresDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().visit( javaParserObject, factory, ecoreObject );

            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithTransitiveModifier
            new NodeWithTransitiveModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleUsesDirectiveVisitor extends GenericVisitorAdapter< ModuleUsesDirective, JavaFactory > {

        @Override
        public ModuleUsesDirective visit( com.github.javaparser.ast.modules.ModuleUsesDirective javaParserObject, JavaFactory factory ) {

            ModuleUsesDirective ecoreObject = factory.createModuleUsesDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NodeWithAnnotationsVisitor extends GenericVisitorAdapter< NodeWithAnnotations, JavaFactory > {

        public NodeWithAnnotations visit( com.github.javaparser.ast.nodeTypes.NodeWithAnnotations< ? > javaParserObject, JavaFactory factory, NodeWithAnnotations ecoreObject ) {

            AnnotationExprVisitor visitor = new AnnotationExprVisitor();
            javaParserObject.getAnnotations().forEach(
                    a -> ecoreObject.getAnnotations().add( visitor.visit( a, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithArgumentsVisitor extends GenericVisitorAdapter< NodeWithArguments, JavaFactory > {

        public NodeWithArguments visit( com.github.javaparser.ast.nodeTypes.NodeWithArguments< ? > javaParserObject, JavaFactory factory, NodeWithArguments ecoreObject ) {

            javaParserObject.getArguments().forEach(
                    arg -> ecoreObject.getArguments().add( new ExpressionVisitor().visit( arg, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithBlockStmtVisitor extends GenericVisitorAdapter< NodeWithBlockStmt, JavaFactory > {

        public NodeWithBlockStmt visit( com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt< ? > javaParserObject, JavaFactory factory, NodeWithBlockStmt ecoreObject ) {

            ecoreObject.setBody( new BlockStmtVisitor().visit( javaParserObject.getBody(), factory ));
            
            return ecoreObject;
        }

        public NodeWithBlockStmt visit( com.github.javaparser.ast.nodeTypes.NodeWithOptionalBlockStmt< ? > javaParserObject, JavaFactory factory, NodeWithBlockStmt ecoreObject ) {
            
            javaParserObject.getBody().ifPresent(
                    bo -> ecoreObject.setBody( new BlockStmtVisitor().visit( bo, factory ))
            );
            return ecoreObject;
        }

    }

    private static class NodeWithBodyVisitor extends GenericVisitorAdapter< NodeWithBody, JavaFactory > {

        public NodeWithBody visit( com.github.javaparser.ast.nodeTypes.NodeWithBody< ? > javaParserObject, JavaFactory factory, NodeWithBody ecoreObject ) {

            ecoreObject.setBody( new StatementVisitor().visit( javaParserObject.getBody(), factory ) );
            
            return ecoreObject;
        }

    }

    private static class NodeWithConditionVisitor extends GenericVisitorAdapter< NodeWithCondition, JavaFactory > {

        public NodeWithCondition visit( com.github.javaparser.ast.nodeTypes.NodeWithCondition< ? > javaParserObject, JavaFactory factory, NodeWithCondition ecoreObject ) {

            ecoreObject.setCondition( new ExpressionVisitor().visit( javaParserObject.getCondition(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithExpressionVisitor extends GenericVisitorAdapter< NodeWithExpression, JavaFactory > {

        public NodeWithExpression visit( com.github.javaparser.ast.nodeTypes.NodeWithExpression< ? > javaParserObject, JavaFactory factory, NodeWithExpression ecoreObject ) {

            ecoreObject.setExpression(  new ExpressionVisitor().visit( javaParserObject.getExpression(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithExtendsVisitor extends GenericVisitorAdapter< NodeWithExtends, JavaFactory > {

        public NodeWithExtends visit( com.github.javaparser.ast.nodeTypes.NodeWithExtends< ? > javaParserObject, JavaFactory factory, NodeWithExtends ecoreObject ) {

            javaParserObject.getExtendedTypes().forEach(
                    et -> ecoreObject.getExtendedTypes().add( new ClassOrInterfaceTypeVisitor().visit( et, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithIdentifierVisitor extends GenericVisitorAdapter< NodeWithIdentifier, JavaFactory > {

        public NodeWithIdentifier visit( com.github.javaparser.ast.nodeTypes.NodeWithIdentifier< ? > javaParserObject, JavaFactory factory, NodeWithIdentifier ecoreObject ) {

            ecoreObject.setIdentifier( javaParserObject.getIdentifier() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithImplementsVisitor extends GenericVisitorAdapter< NodeWithImplements, JavaFactory > {

        public NodeWithImplements visit( com.github.javaparser.ast.nodeTypes.NodeWithImplements< ? > javaParserObject, JavaFactory factory, NodeWithImplements ecoreObject ) {

            javaParserObject.getImplementedTypes().forEach(
                    et -> ecoreObject.getImplementedTypes().add( new ClassOrInterfaceTypeVisitor().visit( et, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithJavadocVisitor extends GenericVisitorAdapter< NodeWithJavadoc, JavaFactory > {

        public NodeWithJavadoc visit( com.github.javaparser.ast.nodeTypes.NodeWithJavadoc< ? > javaParserObject, JavaFactory factory, NodeWithJavadoc ecoreObject ) {

            // Not sure about its usefulness
            // And we don't have to check that Javadoc comments are used only when it is allowed, JavaParser has already done this
//            javaParserObject.getJavadocComment().ifPresent( 
//                    cm -> ecoreObject.setComment( new JavadocCommentVisitor().visit( cm, factory ))
//            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithLabelVisitor extends GenericVisitorAdapter< NodeWithLabelVisitor, JavaFactory > {

        public NodeWithLabel visit( com.github.javaparser.ast.nodeTypes.NodeWithOptionalLabel< ? > javaParserObject, JavaFactory factory, NodeWithLabel ecoreObject ) {

            javaParserObject.getLabel().ifPresent( 
                    la -> ecoreObject.setLabel( new SimpleNameVisitor().visit( la, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithMembersVisitor extends GenericVisitorAdapter< NodeWithMembers, JavaFactory > {

        public NodeWithMembers visit( com.github.javaparser.ast.nodeTypes.NodeWithMembers< ? > javaParserObject, JavaFactory factory, NodeWithMembers ecoreObject ) {

            javaParserObject.getMembers().forEach(
                    mb -> ecoreObject.getMembers().add( new BodyDeclarationVisitor().visit( mb, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithModifiersVisitor extends GenericVisitorAdapter< NodeWithModifiers, JavaFactory > {
//
//        public NodeWithModifiers visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithModifiers ecoreObject ) {
//
//            javaParserObject.getModifiers().forEach(
//                    mo -> ecoreObject.getModifiers().add( new ModifierVisitor().visit( mo, factory ).getKeyword())
//            );
//            
//            return null;
//        }
//
//    }

    private static class NodeWithNameVisitor extends GenericVisitorAdapter< NodeWithName, JavaFactory > {

        public NodeWithName visit( com.github.javaparser.ast.nodeTypes.NodeWithName< ? > javaParserObject, JavaFactory factory, NodeWithName ecoreObject ) {

            ecoreObject.setName( new NameVisitor().visit( javaParserObject.getName(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithParametersVisitor extends GenericVisitorAdapter< NodeWithParameters, JavaFactory > {

        public NodeWithParameters visit( com.github.javaparser.ast.nodeTypes.NodeWithParameters< ? > javaParserObject, JavaFactory factory, NodeWithParameters ecoreObject ) {

            javaParserObject.getParameters().forEach(
                    pa -> ecoreObject.getParameters().add( new ParameterVisitor().visit( pa, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithRangeVisitor extends GenericVisitorAdapter< NodeWithRange, JavaFactory > {
//
//        public NodeWithRange visit( com.github.javaparser.ast.nodeTypes.NodeWithRange javaParserObject, JavaFactory factory ) {
//
//            return null;
//        }
//
//    }

    private static class NodeWithScopeVisitor extends GenericVisitorAdapter< NodeWithScope< ? >, JavaFactory > {

        public NodeWithScope< ? > visit( com.github.javaparser.ast.nodeTypes.NodeWithScope< ? > javaParserObject, JavaFactory factory, NodeWithScope< Expression > ecoreObject ) {
            
            ecoreObject.setScope( new ExpressionVisitor().visit( javaParserObject.getScope(), factory ));
            
            return ecoreObject;
        }

        public NodeWithScope< ? > visit( com.github.javaparser.ast.nodeTypes.NodeWithOptionalScope< ? > javaParserObject, JavaFactory factory, NodeWithScope< Expression > ecoreObject ) {
            
            javaParserObject.getScope().ifPresent(
                    sc -> ecoreObject.setScope( new ExpressionVisitor().visit( sc, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithSimpleNameVisitor extends GenericVisitorAdapter< NodeWithSimpleName, JavaFactory > {

        public NodeWithSimpleName visit( com.github.javaparser.ast.nodeTypes.NodeWithSimpleName< ? > javaParserObject, JavaFactory factory, NodeWithSimpleName ecoreObject ) {

            ecoreObject.setName( new SimpleNameVisitor().visit( javaParserObject.getName(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithStatementsVisitor extends GenericVisitorAdapter< NodeWithStatements, JavaFactory > {

        public NodeWithStatements visit( com.github.javaparser.ast.nodeTypes.NodeWithStatements< ? > javaParserObject, JavaFactory factory, NodeWithStatements ecoreObject ) {

            javaParserObject.getStatements().forEach(
                    st -> ecoreObject.getStatements().add( new StatementVisitor().visit( st, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithThrownExceptionsVisitor extends GenericVisitorAdapter< NodeWithThrownExceptions, JavaFactory > {

        public NodeWithThrownExceptions visit( com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions< ? > javaParserObject, JavaFactory factory, NodeWithThrownExceptions ecoreObject ) {

            javaParserObject.getThrownExceptions().forEach(
                    ex -> ecoreObject.getThrownExceptions().add( new ReferenceTypeVisitor().visit( ex, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithTokenRangeVisitor extends GenericVisitorAdapter< NodeWithTokenRange, JavaFactory > {
//
//        public NodeWithTokenRange visit( com.github.javaparser.ast.nodeTypes.NodeWithTokenRange javaParserObject, JavaFactory factory ) {
//            
//            return null;
//        }
//
//    }

    private static class NodeWithTypeVisitor< T > extends GenericVisitorAdapter< NodeWithType< T >, JavaFactory > {

        @SuppressWarnings( "unchecked" )
        public NodeWithType< T > visit( com.github.javaparser.ast.nodeTypes.NodeWithType< ?, ? > javaParserObject, JavaFactory factory, NodeWithType< T > ecoreObject ) {
            
            ecoreObject.setType( ( T ) new TypeVisitor().visit( javaParserObject.getType(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithTypeArgumentsVisitor extends GenericVisitorAdapter< NodeWithTypeArguments, JavaFactory > {

        public NodeWithTypeArguments visit( com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments< ? > javaParserObject, JavaFactory factory, NodeWithTypeArguments ecoreObject ) {

            javaParserObject.getTypeArguments().ifPresent(
                    tal -> tal.forEach( ta -> ecoreObject.getTypeArguments().add( new TypeVisitor().visit( ta, factory )))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithTypeParametersVisitor extends GenericVisitorAdapter< NodeWithTypeParameters, JavaFactory > {

        public NodeWithTypeParameters visit( com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters< ? > javaParserObject, JavaFactory factory, NodeWithTypeParameters ecoreObject ) {

            javaParserObject.getTypeParameters().forEach(
                    tp -> ecoreObject.getTypeParameters().add( new TypeParameterVisitor().visit( tp, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithVariablesVisitor extends GenericVisitorAdapter< NodeWithVariables, JavaFactory > {

        public NodeWithVariables visit( com.github.javaparser.ast.nodeTypes.NodeWithVariables< ? > javaParserObject, JavaFactory factory, NodeWithVariables ecoreObject ) {

            javaParserObject.getVariables().forEach(
                    vd -> ecoreObject.getVariables().add( new VariableDeclaratorVisitor().visit( vd, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class SwitchNodeVisitor extends GenericVisitorAdapter< SwitchNode, JavaFactory > {

        public SwitchNode visit( com.github.javaparser.ast.nodeTypes.SwitchNode javaParserObject, JavaFactory factory, SwitchNode ecoreObject ) {
            
            javaParserObject.getEntries().forEach(
                    en -> ecoreObject.getEntries().add( new SwitchEntryVisitor().visit( en, factory ))
            );

            return ecoreObject;
        }

    }

    private static class NodeWithAbstractModifierVisitor extends GenericVisitorAdapter< NodeWithAbstractModifier, JavaFactory > {

        public NodeWithAbstractModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier< ? > javaParserObject, JavaFactory factory, NodeWithAbstractModifier ecoreObject ) {

            ecoreObject.setAbstract( javaParserObject.isAbstract() );
            
            return null;
        }

    }

    private static class NodeWithAccessModifiersVisitor extends GenericVisitorAdapter< NodeWithAccessModifiers, JavaFactory > {

        public NodeWithAccessModifiers visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers< ? > javaParserObject, JavaFactory factory, NodeWithAccessModifiers ecoreObject ) {

            // extends NodeWithPublicModifier
            new NodeWithPublicModifierVisitor().visit( javaParserObject, factory, ecoreObject );

            // extends NodeWithPrivateModifier
            new NodeWithPrivateModifierVisitor().visit( javaParserObject, factory, ecoreObject );

            // extends NodeWithProtectedModifier
            new NodeWithProtectedModifierVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return null;
        }

    }

    private static class NodeWithDefaultModifierVisitor extends GenericVisitorAdapter< NodeWithDefaultModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithDefaultModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithDefaultModifier< ? > javaParserObject, JavaFactory factory ) {
        public NodeWithDefaultModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithDefaultModifier ecoreObject ) {

            ecoreObject.setDefault( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.DEFAULT ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithFinalModifierVisitor extends GenericVisitorAdapter< NodeWithFinalModifier, JavaFactory > {

        public NodeWithFinalModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier< ? > javaParserObject, JavaFactory factory, NodeWithFinalModifier ecoreObject ) {

            ecoreObject.setFinal( javaParserObject.isFinal() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithNativeModifierVisitor extends GenericVisitorAdapter< NodeWithNativeModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithNativeModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithNativeModifier javaParserObject, JavaFactory factory ) {
        public NodeWithNativeModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithNativeModifier ecoreObject ) {

            ecoreObject.setNative( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.NATIVE ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithPrivateModifierVisitor extends GenericVisitorAdapter< NodeWithPrivateModifier, JavaFactory > {

        public NodeWithPrivateModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPrivateModifier< ? > javaParserObject, JavaFactory factory, NodeWithPrivateModifier ecoreObject ) {

            ecoreObject.setPrivate( javaParserObject.isPrivate() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithProtectedModifierVisitor extends GenericVisitorAdapter< NodeWithProtectedModifier, JavaFactory > {

        public NodeWithProtectedModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithProtectedModifier< ? > javaParserObject, JavaFactory factory, NodeWithProtectedModifier ecoreObject ) {

            ecoreObject.setProtected( javaParserObject.isProtected() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithPublicModifierVisitor extends GenericVisitorAdapter< NodeWithPublicModifier, JavaFactory > {

        public NodeWithPublicModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier< ? > javaParserObject, JavaFactory factory, NodeWithPublicModifier ecoreObject ) {

            ecoreObject.setPublic( javaParserObject.isPublic() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithStaticModifierVisitor extends GenericVisitorAdapter< NodeWithStaticModifier, JavaFactory > {

        public NodeWithStaticModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier< ? > javaParserObject, JavaFactory factory, NodeWithStaticModifier ecoreObject ) {

            ecoreObject.setStatic( javaParserObject.isStatic() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithSynchronizedModifierVisitor extends GenericVisitorAdapter< NodeWithSynchronizedModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithSynchronizedModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithSynchronizedModifier javaParserObject, JavaFactory factory ) {
        public NodeWithSynchronizedModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithSynchronizedModifier ecoreObject ) {

            ecoreObject.setSynchronized( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.SYNCHRONIZED ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithStrictfpModifierVisitor extends GenericVisitorAdapter< NodeWithStrictfpModifier, JavaFactory > {

        public NodeWithStrictfpModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier< ? > javaParserObject, JavaFactory factory, NodeWithStrictfpModifier ecoreObject ) {

            ecoreObject.setStrictfp( javaParserObject.isStrictfp() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithTransientModifierVisitor extends GenericVisitorAdapter< NodeWithTransientModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithTransientModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithTransientModifier javaParserObject, JavaFactory factory ) {
        public NodeWithTransientModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithTransientModifier ecoreObject ) {

            ecoreObject.setTransient( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.TRANSIENT ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithTransitiveModifierVisitor extends GenericVisitorAdapter< NodeWithTransitiveModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithTransitiveModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithTransitiveModifier javaParserObject, JavaFactory factory ) {
        public NodeWithTransitiveModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithTransitiveModifier ecoreObject ) {

            ecoreObject.setTransitive( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.TRANSITIVE ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithVolatileModifierVisitor extends GenericVisitorAdapter< NodeWithVolatileModifier, JavaFactory > {

        // Does not exist in JavaParser
        //public NodeWithVolatileModifier visit( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithVolatileModifier javaParserObject, JavaFactory factory ) {
        public NodeWithVolatileModifier visit( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, JavaFactory factory, NodeWithVolatileModifier ecoreObject ) {

            ecoreObject.setVolatile( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.VOLATILE ));
            
            return ecoreObject;
        }

    }

    private static class AssertStmtVisitor extends GenericVisitorAdapter< AssertStmt, JavaFactory > {

        @Override
        public AssertStmt visit( com.github.javaparser.ast.stmt.AssertStmt javaParserObject, JavaFactory factory ) {

            AssertStmt ecoreObject = factory.createAssertStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression check;
            ecoreObject.setCheck( new ExpressionVisitor().visit( javaParserObject.getCheck(), factory ));
            
            // Expression message;
            javaParserObject.getMessage().ifPresent(
                    me -> ecoreObject.setMessage( new ExpressionVisitor().visit( me, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class BlockStmtVisitor extends GenericVisitorAdapter< BlockStmt, JavaFactory > {

        @Override
        public BlockStmt visit( com.github.javaparser.ast.stmt.BlockStmt javaParserObject, JavaFactory factory ) {

            BlockStmt ecoreObject = factory.createBlockStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStatements
            new NodeWithStatementsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class BreakStmtVisitor extends GenericVisitorAdapter< BreakStmt, JavaFactory > {

        @Override
        public BreakStmt visit( com.github.javaparser.ast.stmt.BreakStmt javaParserObject, JavaFactory factory ) {

            BreakStmt ecoreObject = factory.createBreakStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // SimpleName label;
            // BreakStmt does not implement NodeWithOptionalLabel
            //new NodeWithLabelVisitor().visit( javaParserObject, factory, ecoreObject );
            javaParserObject.getLabel().ifPresent(
                    la -> ecoreObject.setLabel( new SimpleNameVisitor().visit( la, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class CatchClauseVisitor extends GenericVisitorAdapter< CatchClause, JavaFactory > {

        @Override
        public CatchClause visit( com.github.javaparser.ast.stmt.CatchClause javaParserObject, JavaFactory factory ) {

            CatchClause ecoreObject = factory.createCatchClause();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Parameter parameter;
            ecoreObject.setParameter( new ParameterVisitor().visit( javaParserObject.getParameter(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ContinueStmtVisitor extends GenericVisitorAdapter< ContinueStmt, JavaFactory > {

        @Override
        public ContinueStmt visit( com.github.javaparser.ast.stmt.ContinueStmt javaParserObject, JavaFactory factory ) {

            ContinueStmt ecoreObject = factory.createContinueStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalLabel
            new NodeWithLabelVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class DoStmtVisitor extends GenericVisitorAdapter< DoStmt, JavaFactory > {

        @Override
        public DoStmt visit( com.github.javaparser.ast.stmt.DoStmt javaParserObject, JavaFactory factory ) {

            DoStmt ecoreObject = factory.createDoStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class EmptyStmtVisitor extends GenericVisitorAdapter< EmptyStmt, JavaFactory > {

        @Override
        public EmptyStmt visit( com.github.javaparser.ast.stmt.EmptyStmt javaParserObject, JavaFactory factory ) {

            EmptyStmt ecoreObject = factory.createEmptyStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ExplicitConstructorInvocationStmtVisitor extends GenericVisitorAdapter< ExplicitConstructorInvocationStmt, JavaFactory > {

        @Override
        public ExplicitConstructorInvocationStmt visit( com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt javaParserObject, JavaFactory factory ) {

            ExplicitConstructorInvocationStmt ecoreObject = factory.createExplicitConstructorInvocationStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // boolean isThis;
            ecoreObject.setIsThis( javaParserObject.isThis() );
            
            // Expression expression;
            // does not implements NodeWithExpression and NodeWithOptionalExpression does not exist
            javaParserObject.getExpression().ifPresent(
                    ex -> ecoreObject.setExpression( new ExpressionVisitor().visit( ex, factory )) 
            );
            
            return ecoreObject;
        }

    }

    private static class ExpressionStmtVisitor extends GenericVisitorAdapter< ExpressionStmt, JavaFactory > {

        @Override
        public ExpressionStmt visit( com.github.javaparser.ast.stmt.ExpressionStmt javaParserObject, JavaFactory factory ) {

            ExpressionStmt ecoreObject = factory.createExpressionStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ForEachStmtVisitor extends GenericVisitorAdapter< ForEachStmt, JavaFactory > {

        @Override
        public ForEachStmt visit( com.github.javaparser.ast.stmt.ForEachStmt javaParserObject, JavaFactory factory ) {

            ForEachStmt ecoreObject = factory.createForEachStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // VariableDeclarationExpr variable;
            ecoreObject.setVariable( new VariableDeclarationExprVisitor().visit( javaParserObject.getVariable(), factory ));
            
            // Expression iterable;
            ecoreObject.setIterable( new ExpressionVisitor().visit( javaParserObject.getIterable(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ForStmtVisitor extends GenericVisitorAdapter< ForStmt, JavaFactory > {

        @Override
        public ForStmt visit( com.github.javaparser.ast.stmt.ForStmt javaParserObject, JavaFactory factory ) {

            ForStmt ecoreObject = factory.createForStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression compare;
            javaParserObject.getCompare().ifPresent(
                    co -> ecoreObject.setCompare( new ExpressionVisitor().visit( co, factory )) 
            );
            
            // NodeList<Expression> update;
            javaParserObject.getUpdate().forEach(
                    up -> ecoreObject.getUpdate().add( new ExpressionVisitor().visit( up, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class IfStmtVisitor extends GenericVisitorAdapter< IfStmt, JavaFactory > {

        @Override
        public IfStmt visit( com.github.javaparser.ast.stmt.IfStmt javaParserObject, JavaFactory factory ) {

            IfStmt ecoreObject = factory.createIfStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Statement thenStmt;
            ecoreObject.setThenStmt( new StatementVisitor().visit( javaParserObject.getThenStmt(), factory ));
            
            // Statement elseStmt;
            javaParserObject.getElseStmt().ifPresent(
                    el -> ecoreObject.setElseStmt( new StatementVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class LabeledStmtVisitor extends GenericVisitorAdapter< LabeledStmt, JavaFactory > {

        @Override
        public LabeledStmt visit( com.github.javaparser.ast.stmt.LabeledStmt javaParserObject, JavaFactory factory ) {

            LabeledStmt ecoreObject = factory.createLabeledStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // SimpleName label;
            // NodeWithLabel does not exist
            //new NodeWithLabelVisitor().visit( javaParserObject, factory, ecoreObject );
            ecoreObject.setLabel( new SimpleNameVisitor().visit( javaParserObject.getLabel(), factory ));
            
            // Statement statement;
            // NodeWithStatement does not exist
            ecoreObject.setStatement( new StatementVisitor().visit( javaParserObject.getLabel(), factory ));

            return ecoreObject;
        }

    }

    private static class LocalClassDeclarationStmtVisitor extends GenericVisitorAdapter< LocalClassDeclarationStmt, JavaFactory > {

        @Override
        public LocalClassDeclarationStmt visit( com.github.javaparser.ast.stmt.LocalClassDeclarationStmt javaParserObject, JavaFactory factory ) {

            LocalClassDeclarationStmt ecoreObject = factory.createLocalClassDeclarationStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // ClassOrInterfaceDeclaration classDeclaration;
            ecoreObject.setClassDeclaration( new ClassOrInterfaceDeclarationVisitor().visit( javaParserObject.getClassDeclaration(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ReturnStmtVisitor extends GenericVisitorAdapter< ReturnStmt, JavaFactory > {

        @Override
        public ReturnStmt visit( com.github.javaparser.ast.stmt.ReturnStmt javaParserObject, JavaFactory factory ) {

            ReturnStmt ecoreObject = factory.createReturnStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Expression expression;
            javaParserObject.getExpression().ifPresent(
                    ex -> ecoreObject.setExpression( new ExpressionVisitor().visit( ex, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class StatementVisitor extends GenericVisitorAdapter< Statement, JavaFactory > {

        public Statement visit( com.github.javaparser.ast.stmt.Statement javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.stmt.AssertStmt ) {
                return new AssertStmtVisitor().visit( ( com.github.javaparser.ast.stmt.AssertStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.BlockStmt ) {
                return new BlockStmtVisitor().visit( ( com.github.javaparser.ast.stmt.BlockStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.BreakStmt ) {
                return new BreakStmtVisitor().visit( ( com.github.javaparser.ast.stmt.BreakStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ContinueStmt ) {
                return new ContinueStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ContinueStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.DoStmt ) {
                return new DoStmtVisitor().visit( ( com.github.javaparser.ast.stmt.DoStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.EmptyStmt ) {
                return new EmptyStmtVisitor().visit( ( com.github.javaparser.ast.stmt.EmptyStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt ) {
                return new ExplicitConstructorInvocationStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ExpressionStmt ) {
                return new ExpressionStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ExpressionStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ForEachStmt ) {
                return new ForEachStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ForEachStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ForStmt ) {
                return new ForStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ForStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.IfStmt ) {
                return new IfStmtVisitor().visit( ( com.github.javaparser.ast.stmt.IfStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.LabeledStmt ) {
                return new LabeledStmtVisitor().visit( ( com.github.javaparser.ast.stmt.LabeledStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.LocalClassDeclarationStmt ) {
                return new LocalClassDeclarationStmtVisitor().visit( ( com.github.javaparser.ast.stmt.LocalClassDeclarationStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ReturnStmt ) {
                return new ReturnStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ReturnStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.SwitchStmt ) {
                return new SwitchStmtVisitor().visit( ( com.github.javaparser.ast.stmt.SwitchStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.SynchronizedStmt ) {
                return new SynchronizedStmtVisitor().visit( ( com.github.javaparser.ast.stmt.SynchronizedStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.ThrowStmt ) {
                return new ThrowStmtVisitor().visit( ( com.github.javaparser.ast.stmt.ThrowStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.TryStmt ) {
                return new TryStmtVisitor().visit( ( com.github.javaparser.ast.stmt.TryStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.WhileStmt ) {
                return new WhileStmtVisitor().visit( ( com.github.javaparser.ast.stmt.WhileStmt ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.stmt.YieldStmt ) {
                return new YieldStmtVisitor().visit( ( com.github.javaparser.ast.stmt.YieldStmt ) javaParserObject, factory );
            }
            
            return null;
        }

        public Statement visit( com.github.javaparser.ast.stmt.Statement javaParserObject, JavaFactory factory,  Statement ecoreObject ) {
    
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SwitchEntryVisitor extends GenericVisitorAdapter< SwitchEntry, JavaFactory > {

        @Override
        public SwitchEntry visit( com.github.javaparser.ast.stmt.SwitchEntry javaParserObject, JavaFactory factory ) {

            SwitchEntry ecoreObject = factory.createSwitchEntry();
            
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStatements
            new NodeWithStatementsVisitor().visit( javaParserObject, factory, ecoreObject );

            // NodeList<Expression> labels;
            javaParserObject.getLabels().forEach(
                    la -> ecoreObject.getLabels().add( new ExpressionVisitor().visit( la, factory ))
            );
            
            // Type type;
            ecoreObject.setType(
                    switch( javaParserObject.getType() ) {
                    case STATEMENT_GROUP  -> SwitchEntryType.STATEMENT_GROUP;
                    case BLOCK            -> SwitchEntryType.BLOCK;
                    case EXPRESSION       -> SwitchEntryType.EXPRESSION;
                    case THROWS_STATEMENT -> SwitchEntryType.THROWS_STATEMENT;
                    }
            );
            
            return ecoreObject;
        }

    }

    private static class SwitchStmtVisitor extends GenericVisitorAdapter< SwitchStmt, JavaFactory > {

        @Override
        public SwitchStmt visit( com.github.javaparser.ast.stmt.SwitchStmt javaParserObject, JavaFactory factory ) {

            SwitchStmt ecoreObject = factory.createSwitchStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements SwitchNode
            new SwitchNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SynchronizedStmtVisitor extends GenericVisitorAdapter< SynchronizedStmt, JavaFactory > {

        @Override
        public SynchronizedStmt visit( com.github.javaparser.ast.stmt.SynchronizedStmt javaParserObject, JavaFactory factory ) {

            SynchronizedStmt ecoreObject = factory.createSynchronizedStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ThrowStmtVisitor extends GenericVisitorAdapter< ThrowStmt, JavaFactory > {

        @Override
        public ThrowStmt visit( com.github.javaparser.ast.stmt.ThrowStmt javaParserObject, JavaFactory factory ) {

            ThrowStmt ecoreObject = factory.createThrowStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TryStmtVisitor extends GenericVisitorAdapter< TryStmt, JavaFactory > {

        @Override
        public TryStmt visit( com.github.javaparser.ast.stmt.TryStmt javaParserObject, JavaFactory factory ) {

            TryStmt ecoreObject = factory.createTryStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<Expression> resources;
            javaParserObject.getResources().forEach(
                    re -> ecoreObject.getResources().add( new ExpressionVisitor().visit( re, factory ))
            );
            
            // NodeList<CatchClause> catchClauses;
            javaParserObject.getCatchClauses().forEach(
                    cc -> ecoreObject.getCatchClauses().add( new CatchClauseVisitor().visit( cc, factory ))
            );
            
            // BlockStmt finallyBlock;
            javaParserObject.getFinallyBlock().ifPresent(
                    fb -> ecoreObject.setFinallyBlock( new BlockStmtVisitor().visit( fb, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class WhileStmtVisitor extends GenericVisitorAdapter< WhileStmt, JavaFactory > {

        @Override
        public WhileStmt visit( com.github.javaparser.ast.stmt.WhileStmt javaParserObject, JavaFactory factory ) {

            WhileStmt ecoreObject = factory.createWhileStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class YieldStmtVisitor extends GenericVisitorAdapter< YieldStmt, JavaFactory > {

        @Override
        public YieldStmt visit( com.github.javaparser.ast.stmt.YieldStmt javaParserObject, JavaFactory factory ) {

            YieldStmt ecoreObject = factory.createYieldStmt();
            
            // extends Statement
            new StatementVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ArrayTypeVisitor extends GenericVisitorAdapter< ArrayType, JavaFactory > {

        @Override
        public ArrayType visit( com.github.javaparser.ast.type.ArrayType javaParserObject, JavaFactory factory ) {

            ArrayType ecoreObject = factory.createArrayType();
            
            // extends ReferenceType
            new ReferenceTypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Type componentType;
            ecoreObject.setComponentType( new TypeVisitor().visit( javaParserObject.getComponentType(), factory ));
            
            // Origin origin;
            ecoreObject.setOrigin( switch( javaParserObject.getOrigin() ) {
                case NAME -> ArrayTypeOrigin.NAME;
                case TYPE -> ArrayTypeOrigin.TYPE;
            });
           
            return ecoreObject;
        }

    }

    private static class ClassOrInterfaceTypeVisitor extends GenericVisitorAdapter< ClassOrInterfaceType, JavaFactory > {

        @Override
        public ClassOrInterfaceType visit( com.github.javaparser.ast.type.ClassOrInterfaceType javaParserObject, JavaFactory factory ) {

            ClassOrInterfaceType ecoreObject = factory.createClassOrInterfaceType();

            // extends ReferenceType
            new ReferenceTypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // ClassOrInterfaceType scope;
            javaParserObject.getScope().ifPresent(
                    sc -> ecoreObject.setScope( new ClassOrInterfaceTypeVisitor().visit( sc, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class IntersectionTypeVisitor extends GenericVisitorAdapter< IntersectionType, JavaFactory > {

        @Override
        public IntersectionType visit( com.github.javaparser.ast.type.IntersectionType javaParserObject, JavaFactory factory ) {

            IntersectionType ecoreObject = factory.createIntersectionType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<ReferenceType> elements;
            javaParserObject.getElements().forEach(
                    el -> ecoreObject.getElements().add( new ReferenceTypeVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class PrimitiveTypeVisitor extends GenericVisitorAdapter< PrimitiveType, JavaFactory > {

        @Override
        public PrimitiveType visit( com.github.javaparser.ast.type.PrimitiveType javaParserObject, JavaFactory factory ) {

            PrimitiveType ecoreObject = factory.createPrimitiveType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // Primitive type;
            ecoreObject.setType( switch( javaParserObject.getType() ) {
                case BOOLEAN -> Primitive.BOOLEAN;
                case BYTE    -> Primitive.BYTE;
                case CHAR    -> Primitive.CHAR;
                case DOUBLE  -> Primitive.DOUBLE;
                case FLOAT   -> Primitive.FLOAT;
                case INT     -> Primitive.INT;
                case LONG    -> Primitive.LONG;
                case SHORT   -> Primitive.SHORT;
            });
            
            return ecoreObject;
        }

    }

    private static class ReferenceTypeVisitor extends GenericVisitorAdapter< ReferenceType, JavaFactory > {

        public ReferenceType visit( com.github.javaparser.ast.type.ReferenceType javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.type.ArrayType ) {
                return new ArrayTypeVisitor().visit( ( com.github.javaparser.ast.type.ArrayType ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.type.ClassOrInterfaceType ) {
                return new ClassOrInterfaceTypeVisitor().visit( ( com.github.javaparser.ast.type.ClassOrInterfaceType ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.type.TypeParameter ) {
                return new TypeParameterVisitor().visit( ( com.github.javaparser.ast.type.TypeParameter ) javaParserObject, factory );
            }
            
            return null;
        }

        public ReferenceType visit( com.github.javaparser.ast.type.ReferenceType javaParserObject, JavaFactory factory, ReferenceType ecoreObject ) {
    
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeVisitor extends GenericVisitorAdapter< Type, JavaFactory > {

        public Type visit( com.github.javaparser.ast.type.Type javaParserObject, JavaFactory factory ) {

            if( javaParserObject instanceof com.github.javaparser.ast.type.IntersectionType ) {
                return new IntersectionTypeVisitor().visit( ( com.github.javaparser.ast.type.IntersectionType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.PrimitiveType ) {
                return new PrimitiveTypeVisitor().visit( ( com.github.javaparser.ast.type.PrimitiveType ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.type.ReferenceType ) {
                return new ReferenceTypeVisitor().visit( ( com.github.javaparser.ast.type.ReferenceType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.UnionType ) {
                return new UnionTypeVisitor().visit( ( com.github.javaparser.ast.type.UnionType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.UnknownType ) {
                return new UnknownTypeVisitor().visit( ( com.github.javaparser.ast.type.UnknownType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.VarType ) {
                return new VarTypeVisitor().visit( ( com.github.javaparser.ast.type.VarType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.VoidType ) {
                return new VoidTypeVisitor().visit( ( com.github.javaparser.ast.type.VoidType ) javaParserObject, factory );
            }

            if( javaParserObject instanceof com.github.javaparser.ast.type.WildcardType ) {
                return new WildcardTypeVisitor().visit( ( com.github.javaparser.ast.type.WildcardType ) javaParserObject, factory );
            }

            return null;
        }

        public Type visit( com.github.javaparser.ast.type.Type javaParserObject, JavaFactory factory, Type ecoreObject ) {
    
            // Extends Node
            new JavaNodeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeParameterVisitor extends GenericVisitorAdapter< TypeParameter, JavaFactory > {

        @Override
        public TypeParameter visit( com.github.javaparser.ast.type.TypeParameter javaParserObject, JavaFactory factory ) {

            TypeParameter ecoreObject = factory.createTypeParameter();

            // extends ReferenceType
            new ReferenceTypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<ClassOrInterfaceType> typeBound
            javaParserObject.getTypeBound().forEach(
                    tb -> ecoreObject.getTypeBound().add( new ClassOrInterfaceTypeVisitor().visit( tb, factory ))
            );

            return ecoreObject;
        }

    }

    private static class UnionTypeVisitor extends GenericVisitorAdapter< UnionType, JavaFactory > {

        @Override
        public UnionType visit( com.github.javaparser.ast.type.UnionType javaParserObject, JavaFactory factory ) {

            UnionType ecoreObject = factory.createUnionType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // NodeList<ReferenceType> elements;
            javaParserObject.getElements().forEach(
                    el -> ecoreObject.getElements().add( new ReferenceTypeVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class UnknownTypeVisitor extends GenericVisitorAdapter< UnknownType, JavaFactory > {

        @Override
        public UnknownType visit( com.github.javaparser.ast.type.UnknownType javaParserObject, JavaFactory factory ) {

            UnknownType ecoreObject = factory.createUnknownType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class VarTypeVisitor extends GenericVisitorAdapter< VarType, JavaFactory > {

        @Override
        public VarType visit( com.github.javaparser.ast.type.VarType javaParserObject, JavaFactory factory ) {

            VarType ecoreObject = factory.createVarType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class VoidTypeVisitor extends GenericVisitorAdapter< VoidType, JavaFactory > {

        @Override
        public VoidType visit( com.github.javaparser.ast.type.VoidType javaParserObject, JavaFactory factory ) {

            VoidType ecoreObject = factory.createVoidType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class WildcardTypeVisitor extends GenericVisitorAdapter< WildcardType, JavaFactory > {

        @Override
        public WildcardType visit( com.github.javaparser.ast.type.WildcardType javaParserObject, JavaFactory factory ) {

            WildcardType ecoreObject = factory.createWildcardType();
            
            // extends Type
            new TypeVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().visit( javaParserObject, factory, ecoreObject );
            
            // ReferenceType extendedType;
            javaParserObject.getExtendedType().ifPresent(
                    et -> ecoreObject.setExtendedType( new ReferenceTypeVisitor().visit( et, factory ))
            );
            
            // ReferenceType superType;
            javaParserObject.getSuperType().ifPresent(
                    et -> ecoreObject.setSuperType( new ReferenceTypeVisitor().visit( et, factory ))
            );
            
            return ecoreObject;
        }

    }
}