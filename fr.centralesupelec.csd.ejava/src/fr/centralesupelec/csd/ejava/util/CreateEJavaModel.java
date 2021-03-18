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
package fr.centralesupelec.csd.ejava.util;

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

import fr.centralesupelec.csd.ejava.*;

public class CreateEJavaModel {
    
    public CreateEJavaModel() {

    }

    public Resource createEJavaModel( File file ) throws FileNotFoundException {
        // Create a resource set to hold the resources.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file extensions.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION,
                new XMIResourceFactoryImpl()
        );

        // Register the package to ensure it is available during loading.
        resourceSet.getPackageRegistry().put( EJavaPackage.eNS_URI, EJavaPackage.eINSTANCE );

        JavaParser javaParser = new JavaParser();
        javaParser.getParserConfiguration().setLanguageLevel( LanguageLevel.JAVA_15 );
        ParseResult< com.github.javaparser.ast.CompilationUnit > result = javaParser.parse( file );

        Resource resource = resourceSet.createResource ( URI.createURI( "http://csd.centralesupelec.fr/ejava/resource.java" ));

        result.ifSuccessful(
                cu -> {
                    CompilationUnitVisitor cuv = new CompilationUnitVisitor();
                    CompilationUnit compilationUnit = cuv.visit( cu, EJavaFactory.eINSTANCE );

                    resource.getContents().add( compilationUnit );
                }
        );

        return resource;
    }
    
    private static class JavaNodeVisitor extends GenericVisitorAdapter< JavaNode, EJavaFactory > {
        
        public JavaNode collect( com.github.javaparser.ast.Node javaParserObject, EJavaFactory factory, JavaNode ecoreObject ) {
            
            javaParserObject.getComment().ifPresent(
                    co -> ecoreObject.setComment( new CommentVisitor().visit( co, factory ))
            );
            
            javaParserObject.getOrphanComments().forEach(
                    co -> ecoreObject.getOrphanComments().add( new CommentVisitor().visit( co, factory ))
            );
            
            return ecoreObject;
        }
    }

    private static class ArrayCreationLevelVisitor extends GenericVisitorAdapter< ArrayCreationLevel, EJavaFactory > {

        @Override
        public ArrayCreationLevel visit( com.github.javaparser.ast.ArrayCreationLevel javaParserObject, EJavaFactory factory ) {

            ArrayCreationLevel ecoreObject = factory.createArrayCreationLevel();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression dimension;
            javaParserObject.getDimension().ifPresent(
                    dim -> ecoreObject.setDimension( new ExpressionVisitor().visit( dim , factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class CompilationUnitVisitor extends GenericVisitorAdapter< CompilationUnit, EJavaFactory > {

        @Override
        public CompilationUnit visit( com.github.javaparser.ast.CompilationUnit javaParserObject, EJavaFactory factory ) {

            CompilationUnit ecoreObject = factory.createCompilationUnit();

            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class ImportDeclarationVisitor extends GenericVisitorAdapter< ImportDeclaration, EJavaFactory > {

        @Override
        public ImportDeclaration visit( com.github.javaparser.ast.ImportDeclaration javaParserObject, EJavaFactory factory ) {

            ImportDeclaration ecoreObject = factory.createImportDeclaration();

            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );

            ecoreObject.setStatic( javaParserObject.isStatic() );
            ecoreObject.setAsterisk( javaParserObject.isAsterisk() );

            return ecoreObject;
        }

    }

//    private static class ModifierVisitor extends GenericVisitorAdapter< Modifier, EJavaFactory > {
//
//        @Override
//        public Modifier visit( com.github.javaparser.ast.Modifier javaParserObject, EJavaFactory factory ) {
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

    private static class PackageDeclarationVisitor extends GenericVisitorAdapter< PackageDeclaration, EJavaFactory > {

        @Override
        public PackageDeclaration visit( com.github.javaparser.ast.PackageDeclaration javaParserObject, EJavaFactory factory ) {

            PackageDeclaration ecoreObject = factory.createPackageDeclaration();

            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class AnnotationDeclarationVisitor extends GenericVisitorAdapter< AnnotationDeclaration, EJavaFactory > {

        @Override
        public AnnotationDeclaration visit( com.github.javaparser.ast.body.AnnotationDeclaration javaParserObject, EJavaFactory factory ) {

            AnnotationDeclaration ecoreObject = factory.createAnnotationDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class AnnotationMemberDeclarationVisitor extends GenericVisitorAdapter< AnnotationMemberDeclaration, EJavaFactory > {

        @Override
        public AnnotationMemberDeclaration visit( com.github.javaparser.ast.body.AnnotationMemberDeclaration javaParserObject, EJavaFactory factory ) {

            AnnotationMemberDeclaration ecoreObject = factory.createAnnotationMemberDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType< Type >
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithPublicModifier
            new NodeWithPublicModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().collect( javaParserObject, factory, ecoreObject );

            // Expression defaultValue;
            javaParserObject.getDefaultValue().ifPresent(
                    val -> ecoreObject.setDefaultValue( new ExpressionVisitor().visit( val, factory )) 
            );

            return ecoreObject;
        }

    }

    private static class BodyDeclarationVisitor extends GenericVisitorAdapter< BodyDeclaration, EJavaFactory > {

        public BodyDeclaration visit( com.github.javaparser.ast.body.BodyDeclaration< ? > javaParserObject, EJavaFactory factory ) {

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
        
        public BodyDeclaration collect( com.github.javaparser.ast.body.BodyDeclaration< ? > javaParserObject, EJavaFactory factory, BodyDeclaration ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class CallableDeclarationVisitor extends GenericVisitorAdapter< CallableDeclaration, EJavaFactory > {

        public CallableDeclaration visit( com.github.javaparser.ast.body.CallableDeclaration< ? > javaParserObject, EJavaFactory factory ) {

            CallableDeclaration ecoreObject = null;
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.ConstructorDeclaration ) {
                ecoreObject = new ConstructorDeclarationVisitor().visit(( com.github.javaparser.ast.body.ConstructorDeclaration ) javaParserObject, factory );
            }
            
            if( javaParserObject instanceof com.github.javaparser.ast.body.MethodDeclaration ) {
                ecoreObject = new MethodDeclarationVisitor().visit(( com.github.javaparser.ast.body.MethodDeclaration ) javaParserObject, factory );
            }

            return ecoreObject;
        }
        
        public CallableDeclaration collect( com.github.javaparser.ast.body.CallableDeclaration< ? > javaParserObject, EJavaFactory factory, CallableDeclaration ecoreObject ) {
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithDeclaration: not sure it is useful
            //new NodeWithDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // ReceiverParameter receiverParameter
            javaParserObject.getReceiverParameter().ifPresent(
                    rp -> ecoreObject.setReceiverParameter( new ReceiverParameterVisitor().visit( rp, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ClassOrInterfaceDeclarationVisitor extends GenericVisitorAdapter< ClassOrInterfaceDeclaration, EJavaFactory > {

        @Override
        public ClassOrInterfaceDeclaration visit( com.github.javaparser.ast.body.ClassOrInterfaceDeclaration javaParserObject, EJavaFactory factory ) {

            ClassOrInterfaceDeclaration ecoreObject = factory.createClassOrInterfaceDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithImplements
            new NodeWithImplementsVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithExtends
            new NodeWithExtendsVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );

            // boolean isInterface;
            ecoreObject.setInterface( javaParserObject.isInterface() );

            return ecoreObject;
        }

    }

    private static class ConstructorDeclarationVisitor extends GenericVisitorAdapter< ConstructorDeclaration, EJavaFactory > {

        @Override
        public ConstructorDeclaration visit( com.github.javaparser.ast.body.ConstructorDeclaration javaParserObject, EJavaFactory factory ) {

            ConstructorDeclaration ecoreObject = factory.createConstructorDeclaration();
            
            // extends CallableDeclaration
            new CallableDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithParameters
            new NodeWithParametersVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().collect( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class EnumConstantDeclarationVisitor extends GenericVisitorAdapter< EnumConstantDeclaration, EJavaFactory > {

        @Override
        public EnumConstantDeclaration visit( com.github.javaparser.ast.body.EnumConstantDeclaration javaParserObject, EJavaFactory factory ) {

            EnumConstantDeclaration ecoreObject = factory.createEnumConstantDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<BodyDeclaration<?>> classBody;
            javaParserObject.getClassBody().forEach(
                    cb -> ecoreObject.getClassBody().add( new BodyDeclarationVisitor().visit( cb, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class EnumDeclarationVisitor extends GenericVisitorAdapter< EnumDeclaration, EJavaFactory > {

        @Override
        public EnumDeclaration visit( com.github.javaparser.ast.body.EnumDeclaration javaParserObject, EJavaFactory factory ) {

            EnumDeclaration ecoreObject = factory.createEnumDeclaration();
            
            // extends TypeDeclaration
            new TypeDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithImplements
            new NodeWithImplementsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<EnumConstantDeclaration> entries;
            javaParserObject.getEntries().forEach(
                    en -> ecoreObject.getEntries().add(  new EnumConstantDeclarationVisitor().visit( en, factory ))
            );

            return ecoreObject;
        }

    }

    private static class FieldDeclarationVisitor extends GenericVisitorAdapter< FieldDeclaration, EJavaFactory > {

        @Override
        public FieldDeclaration visit( com.github.javaparser.ast.body.FieldDeclaration javaParserObject, EJavaFactory factory ) {

            FieldDeclaration ecoreObject = factory.createFieldDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithVariables
            new NodeWithVariablesVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithTransientModifier
            new NodeWithTransientModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithVolatileModifier
            new NodeWithVolatileModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class InitializerDeclarationVisitor extends GenericVisitorAdapter< InitializerDeclaration, EJavaFactory > {

        @Override
        public InitializerDeclaration visit( com.github.javaparser.ast.body.InitializerDeclaration javaParserObject, EJavaFactory factory ) {

            InitializerDeclaration ecoreObject = factory.createInitializerDeclaration();
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // boolean isStatic;
            ecoreObject.setStatic( javaParserObject.isStatic() );
            
            return ecoreObject;
        }

    }

    private static class MethodDeclarationVisitor extends GenericVisitorAdapter< MethodDeclaration, EJavaFactory > {

        @Override
        public MethodDeclaration visit( com.github.javaparser.ast.body.MethodDeclaration javaParserObject, EJavaFactory factory ) {

            MethodDeclaration ecoreObject = factory.createMethodDeclaration();
            
            // extends CallableDeclaration
            new CallableDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithOptionalBlockStmt
            new NodeWithBlockStmtVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithDeclaration: not sure it is useful
            //new NodeWithDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithThrownExceptions
            new NodeWithThrownExceptionsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeParameters
            new NodeWithTypeParametersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAbstractModifier
            new NodeWithAbstractModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithSynchronizedModifier
            new NodeWithSynchronizedModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithNativeModifier
            new NodeWithNativeModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithDefaultModifier
            new NodeWithDefaultModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ParameterVisitor extends GenericVisitorAdapter< Parameter, EJavaFactory > {

        @Override
        public Parameter visit( com.github.javaparser.ast.body.Parameter javaParserObject, EJavaFactory factory ) {

            Parameter ecoreObject = factory.createParameter();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // boolean isVarArgs
            ecoreObject.setVarArgs( javaParserObject.isVarArgs() );
            
            return ecoreObject;
        }

    }

    private static class ReceiverParameterVisitor extends GenericVisitorAdapter< ReceiverParameter, EJavaFactory > {

        @Override
        public ReceiverParameter visit( com.github.javaparser.ast.body.ReceiverParameter javaParserObject, EJavaFactory factory ) {

            ReceiverParameter ecoreObject = factory.createReceiverParameter();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeDeclarationVisitor extends GenericVisitorAdapter< TypeDeclaration, EJavaFactory > {

        public TypeDeclaration visit( com.github.javaparser.ast.body.TypeDeclaration< ? > javaParserObject, EJavaFactory factory ) {

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

        public TypeDeclaration collect( com.github.javaparser.ast.body.TypeDeclaration< ? > javaParserObject, EJavaFactory factory, TypeDeclaration ecoreObject ) {
            
            // extends BodyDeclaration
            new BodyDeclarationVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithJavadoc
            new NodeWithJavadocVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithMembers
            new NodeWithMembersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAccessModifiers
            new NodeWithAccessModifiersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStrictfpModifier
            new NodeWithStrictfpModifierVisitor().collect( javaParserObject, factory, ecoreObject );
                        
            return ecoreObject;
        }

    }

    private static class VariableDeclaratorVisitor extends GenericVisitorAdapter< VariableDeclarator, EJavaFactory > {

        @Override
        public VariableDeclarator visit( com.github.javaparser.ast.body.VariableDeclarator javaParserObject, EJavaFactory factory ) {

            VariableDeclarator ecoreObject = factory.createVariableDeclarator();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression initializer;
            javaParserObject.getInitializer().ifPresent(
                    in -> ecoreObject.setInitializer( new ExpressionVisitor().visit( in, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class BlockCommentVisitor extends GenericVisitorAdapter< BlockComment, EJavaFactory > {

        @Override
        public BlockComment visit( com.github.javaparser.ast.comments.BlockComment javaParserObject, EJavaFactory factory ) {

            BlockComment ecoreObject = factory.createBlockComment();
            
            // extends Comment
            new CommentVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class CommentVisitor extends GenericVisitorAdapter< Comment, EJavaFactory > {

        public Comment visit( com.github.javaparser.ast.comments.Comment javaParserObject, EJavaFactory factory ) {
            
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


        public Comment collect( com.github.javaparser.ast.comments.Comment javaParserObject, EJavaFactory factory, Comment ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // String content;
            ecoreObject.setContent( javaParserObject.getContent() );
            
            return ecoreObject;
        }
    }

    private static class JavadocCommentVisitor extends GenericVisitorAdapter< JavadocComment, EJavaFactory > {

        @Override
        public JavadocComment visit( com.github.javaparser.ast.comments.JavadocComment javaParserObject, EJavaFactory factory ) {

            JavadocComment ecoreObject = factory.createJavadocComment();
            
            // extends Comment
            new CommentVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class LineCommentVisitor extends GenericVisitorAdapter< LineComment, EJavaFactory > {

        @Override
        public LineComment visit( com.github.javaparser.ast.comments.LineComment javaParserObject, EJavaFactory factory ) {

            LineComment ecoreObject = factory.createLineComment();
            
            // extends Comment
            new CommentVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class AnnotationExprVisitor extends GenericVisitorAdapter< AnnotationExpr, EJavaFactory > {

        public AnnotationExpr visit( com.github.javaparser.ast.expr.AnnotationExpr javaParserObject, EJavaFactory factory ) {

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

        public AnnotationExpr collect( com.github.javaparser.ast.expr.AnnotationExpr javaParserObject, EJavaFactory factory, AnnotationExpr ecoreObject ) {
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ArrayAccessExprVisitor extends GenericVisitorAdapter< ArrayAccessExpr, EJavaFactory > {

        @Override
        public ArrayAccessExpr visit( com.github.javaparser.ast.expr.ArrayAccessExpr javaParserObject, EJavaFactory factory ) {

            ArrayAccessExpr ecoreObject = factory.createArrayAccessExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression name
            ecoreObject.setName( new ExpressionVisitor().visit( javaParserObject.getName(), factory ));
            
            // Expression index
            ecoreObject.setIndex( new ExpressionVisitor().visit( javaParserObject.getIndex(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ArrayCreationExprVisitor extends GenericVisitorAdapter< ArrayCreationExpr, EJavaFactory > {

        @Override
        public ArrayCreationExpr visit( com.github.javaparser.ast.expr.ArrayCreationExpr javaParserObject, EJavaFactory factory ) {

            ArrayCreationExpr ecoreObject = factory.createArrayCreationExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class ArrayInitializerExprVisitor extends GenericVisitorAdapter< ArrayInitializerExpr, EJavaFactory > {

        @Override
        public ArrayInitializerExpr visit( com.github.javaparser.ast.expr.ArrayInitializerExpr javaParserObject, EJavaFactory factory ) {

            ArrayInitializerExpr ecoreObject = factory.createArrayInitializerExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<Expression> values;
            javaParserObject.getValues().forEach(
                    val -> ecoreObject.getValues().add( new ExpressionVisitor().visit( val, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class AssignExprVisitor extends GenericVisitorAdapter< AssignExpr, EJavaFactory > {

        @Override
        public AssignExpr visit( com.github.javaparser.ast.expr.AssignExpr javaParserObject, EJavaFactory factory ) {

            AssignExpr ecoreObject = factory.createAssignExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression target;
            ecoreObject.setTarget( new ExpressionVisitor().visit( javaParserObject.getTarget(), factory ));
            
            // Expression value;
            ecoreObject.setValue( new ExpressionVisitor().visit( javaParserObject.getValue(), factory ));
            
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

    private static class BinaryExprVisitor extends GenericVisitorAdapter< BinaryExpr, EJavaFactory > {

        @Override
        public BinaryExpr visit( com.github.javaparser.ast.expr.BinaryExpr javaParserObject, EJavaFactory factory ) {

            BinaryExpr ecoreObject = factory.createBinaryExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression left;
            ecoreObject.setLeft( new ExpressionVisitor().visit( javaParserObject.getLeft(), factory ));
            
            // Expression right;
            ecoreObject.setRight( new ExpressionVisitor().visit( javaParserObject.getRight(), factory ));
            
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

    private static class BooleanLiteralExprVisitor extends GenericVisitorAdapter< BooleanLiteralExpr, EJavaFactory > {

        @Override
        public BooleanLiteralExpr visit( com.github.javaparser.ast.expr.BooleanLiteralExpr javaParserObject, EJavaFactory factory ) {

            BooleanLiteralExpr ecoreObject = factory.createBooleanLiteralExpr();
            
            // extends LiteralExpr
            new LiteralExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // boolean value;
            ecoreObject.setValue( javaParserObject.getValue() );
            
            return ecoreObject;
        }

    }

    private static class CastExprVisitor extends GenericVisitorAdapter< CastExpr, EJavaFactory > {

        @Override
        public CastExpr visit( com.github.javaparser.ast.expr.CastExpr javaParserObject, EJavaFactory factory ) {

            CastExpr ecoreObject = factory.createCastExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class CharLiteralExprVisitor extends GenericVisitorAdapter< CharLiteralExpr, EJavaFactory > {

        @Override
        public CharLiteralExpr visit( com.github.javaparser.ast.expr.CharLiteralExpr javaParserObject, EJavaFactory factory ) {

            CharLiteralExpr ecoreObject = factory.createCharLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ClassExprVisitor extends GenericVisitorAdapter< ClassExpr, EJavaFactory > {

        @Override
        public ClassExpr visit( com.github.javaparser.ast.expr.ClassExpr javaParserObject, EJavaFactory factory ) {

            ClassExpr ecoreObject = factory.createClassExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ConditionalExprVisitor extends GenericVisitorAdapter< ConditionalExpr, EJavaFactory > {

        @Override
        public ConditionalExpr visit( com.github.javaparser.ast.expr.ConditionalExpr javaParserObject, EJavaFactory factory ) {

            ConditionalExpr ecoreObject = factory.createConditionalExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression condition;
            ecoreObject.setCondition( new ExpressionVisitor().visit( javaParserObject.getCondition(), factory ));
            
            // Expression thenExpr;
            ecoreObject.setThenExpr( new ExpressionVisitor().visit( javaParserObject.getThenExpr(), factory ));
            
            // Expression elseExpr;
            ecoreObject.setElseExpr( new ExpressionVisitor().visit( javaParserObject.getElseExpr(), factory ));
            
            return ecoreObject;
        }

    }

    private static class DoubleLiteralExprVisitor extends GenericVisitorAdapter< DoubleLiteralExpr, EJavaFactory > {

        @Override
        public DoubleLiteralExpr visit( com.github.javaparser.ast.expr.DoubleLiteralExpr javaParserObject, EJavaFactory factory ) {

            DoubleLiteralExpr ecoreObject = factory.createDoubleLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class EnclosedExprVisitor extends GenericVisitorAdapter< EnclosedExpr, EJavaFactory > {

        @Override
        public EnclosedExpr visit( com.github.javaparser.ast.expr.EnclosedExpr javaParserObject, EJavaFactory factory ) {

            EnclosedExpr ecoreObject = factory.createEnclosedExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression inner;
            ecoreObject.setInner( new ExpressionVisitor().visit( javaParserObject.getInner(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ExpressionVisitor extends GenericVisitorAdapter< Expression, EJavaFactory > {

        public Expression visit( com.github.javaparser.ast.expr.Expression javaParserObject, EJavaFactory factory ) {
            
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

        public Expression collect( com.github.javaparser.ast.expr.Expression javaParserObject, EJavaFactory factory, Expression ecoreObject ) {

            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
                      
            return ecoreObject;
        }

    }

    private static class FieldAccessExprVisitor extends GenericVisitorAdapter< FieldAccessExpr, EJavaFactory > {

        @Override
        public FieldAccessExpr visit( com.github.javaparser.ast.expr.FieldAccessExpr javaParserObject, EJavaFactory factory ) {

            FieldAccessExpr ecoreObject = factory.createFieldAccessExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithScope
            new NodeWithScopeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class InstanceOfExprVisitor extends GenericVisitorAdapter< InstanceOfExpr, EJavaFactory > {

        @Override
        public InstanceOfExpr visit( com.github.javaparser.ast.expr.InstanceOfExpr javaParserObject, EJavaFactory factory ) {

            InstanceOfExpr ecoreObject = factory.createInstanceOfExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< ReferenceType >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // PatternExpr pattern;
            javaParserObject.getPattern().ifPresent(
                    pa -> ecoreObject.setPattern( new PatternExprVisitor().visit( pa, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class IntegerLiteralExprVisitor extends GenericVisitorAdapter< IntegerLiteralExpr, EJavaFactory > {

        @Override
        public IntegerLiteralExpr visit( com.github.javaparser.ast.expr.IntegerLiteralExpr javaParserObject, EJavaFactory factory ) {

            IntegerLiteralExpr ecoreObject = factory.createIntegerLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class LambdaExprVisitor extends GenericVisitorAdapter< LambdaExpr, EJavaFactory > {

        @Override
        public LambdaExpr visit( com.github.javaparser.ast.expr.LambdaExpr javaParserObject, EJavaFactory factory ) {

            LambdaExpr ecoreObject = factory.createLambdaExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithParameters
            new NodeWithParametersVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // boolean isEnclosingParameters;
            ecoreObject.setEnclosingParameters( javaParserObject.isEnclosingParameters() );
            
            // Statement body;
            ecoreObject.setBody( new StatementVisitor().visit( javaParserObject, factory ));
            
            return ecoreObject;
        }

    }

    private static class LiteralExprVisitor extends GenericVisitorAdapter< LiteralExpr, EJavaFactory > {

        public LiteralExpr visit( com.github.javaparser.ast.expr.LiteralExpr javaParserObject, EJavaFactory factory ) {

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


        public LiteralExpr collect( com.github.javaparser.ast.expr.LiteralExpr javaParserObject, EJavaFactory factory, LiteralExpr ecoreObject ) {
            
            // Nothing
            
            return ecoreObject;
        }

    }

    private static class LiteralStringValueExprVisitor extends GenericVisitorAdapter< LiteralStringValueExpr, EJavaFactory > {

        public LiteralStringValueExpr visit( com.github.javaparser.ast.expr.LiteralStringValueExpr javaParserObject, EJavaFactory factory ) {

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


        public LiteralStringValueExpr collect( com.github.javaparser.ast.expr.LiteralStringValueExpr javaParserObject, EJavaFactory factory, LiteralStringValueExpr ecoreObject ) {
            
            // String value;
            ecoreObject.setValue( javaParserObject.getValue() );
            
            return ecoreObject;
        }

    }

    private static class LongLiteralExprVisitor extends GenericVisitorAdapter< LongLiteralExpr, EJavaFactory > {

        @Override
        public LongLiteralExpr visit( com.github.javaparser.ast.expr.LongLiteralExpr javaParserObject, EJavaFactory factory ) {

            LongLiteralExpr ecoreObject = factory.createLongLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class MarkerAnnotationExprVisitor extends GenericVisitorAdapter< MarkerAnnotationExpr, EJavaFactory > {

        @Override
        public MarkerAnnotationExpr visit( com.github.javaparser.ast.expr.MarkerAnnotationExpr javaParserObject, EJavaFactory factory ) {

            MarkerAnnotationExpr ecoreObject = factory.createMarkerAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class MemberValuePairVisitor extends GenericVisitorAdapter< MemberValuePair, EJavaFactory > {

        @Override
        public MemberValuePair visit( com.github.javaparser.ast.expr.MemberValuePair javaParserObject, EJavaFactory factory ) {

            MemberValuePair ecoreObject = factory.createMemberValuePair();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression value;
            ecoreObject.setValue( new ExpressionVisitor().visit( javaParserObject.getValue(), factory ));

            return ecoreObject;
        }

    }

    private static class MethodCallExprVisitor extends GenericVisitorAdapter< MethodCallExpr, EJavaFactory > {

        @Override
        public MethodCallExpr visit( com.github.javaparser.ast.expr.MethodCallExpr javaParserObject, EJavaFactory factory ) {

            MethodCallExpr ecoreObject = factory.createMethodCallExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalScope
            new NodeWithScopeVisitor().collect( javaParserObject, factory, ecoreObject );

            return ecoreObject;
        }

    }

    private static class MethodReferenceExprVisitor extends GenericVisitorAdapter< MethodReferenceExpr, EJavaFactory > {

        @Override
        public MethodReferenceExpr visit( com.github.javaparser.ast.expr.MethodReferenceExpr javaParserObject, EJavaFactory factory ) {

            MethodReferenceExpr ecoreObject = factory.createMethodReferenceExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NameVisitor extends GenericVisitorAdapter< Name, EJavaFactory > {

        @Override
        public Name visit( com.github.javaparser.ast.expr.Name javaParserObject, EJavaFactory factory ) {

            Name ecoreObject = factory.createName();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Name qualifier;
            javaParserObject.getQualifier().ifPresent(
                    qual -> ecoreObject.setQualifier( this.visit( qual, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NameExprVisitor extends GenericVisitorAdapter< NameExpr, EJavaFactory > {

        @Override
        public NameExpr visit( com.github.javaparser.ast.expr.NameExpr javaParserObject, EJavaFactory factory ) {

            NameExpr ecoreObject = factory.createNameExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NormalAnnotationExprVisitor extends GenericVisitorAdapter< NormalAnnotationExpr, EJavaFactory > {

        @Override
        public NormalAnnotationExpr visit( com.github.javaparser.ast.expr.NormalAnnotationExpr javaParserObject, EJavaFactory factory ) {

            NormalAnnotationExpr ecoreObject = factory.createNormalAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<MemberValuePair> pairs;
            MemberValuePairVisitor mvpv = new MemberValuePairVisitor();
            javaParserObject.getPairs().forEach(
                    pa -> ecoreObject.getPairs().add( mvpv.visit( pa, factory ))
            );

            return ecoreObject;
        }

    }

    private static class NullLiteralExprVisitor extends GenericVisitorAdapter< NullLiteralExpr, EJavaFactory > {

        @Override
        public NullLiteralExpr visit( com.github.javaparser.ast.expr.NullLiteralExpr javaParserObject, EJavaFactory factory ) {

            NullLiteralExpr ecoreObject = factory.createNullLiteralExpr();
            
            // extends LiteralExpr
            new LiteralExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ObjectCreationExprVisitor extends GenericVisitorAdapter< ObjectCreationExpr, EJavaFactory > {

        @Override
        public ObjectCreationExpr visit( com.github.javaparser.ast.expr.ObjectCreationExpr javaParserObject, EJavaFactory factory ) {

            ObjectCreationExpr ecoreObject = factory.createObjectCreationExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType<ClassOrInterfaceType>
            new NodeWithTypeVisitor< ClassOrInterfaceType >().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalScope
            new NodeWithScopeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<BodyDeclaration<?>> anonymousClassBody;
            javaParserObject.getAnonymousClassBody().ifPresent(
                    acbl -> acbl.forEach(
                            acb -> ecoreObject.getAnonymousClassBody().add( new BodyDeclarationVisitor().visit( acb, factory ))
                    )
            );
            
            return ecoreObject;
        }

    }

    private static class PatternExprVisitor extends GenericVisitorAdapter< PatternExpr, EJavaFactory > {

        @Override
        public PatternExpr visit( com.github.javaparser.ast.expr.PatternExpr javaParserObject, EJavaFactory factory ) {

            PatternExpr ecoreObject = factory.createPatternExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< ReferenceType >().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SimpleNameVisitor extends GenericVisitorAdapter< SimpleName, EJavaFactory > {

        @Override
        public SimpleName visit( com.github.javaparser.ast.expr.SimpleName javaParserObject, EJavaFactory factory ) {

            SimpleName ecoreObject = factory.createSimpleName();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithIdentifier
            new NodeWithIdentifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SingleMemberAnnotationExprVisitor extends GenericVisitorAdapter< SingleMemberAnnotationExpr, EJavaFactory > {

        @Override
        public SingleMemberAnnotationExpr visit( com.github.javaparser.ast.expr.SingleMemberAnnotationExpr javaParserObject, EJavaFactory factory ) {

            SingleMemberAnnotationExpr ecoreObject = factory.createSingleMemberAnnotationExpr();
            
            // extends AnnotationExpr
            new AnnotationExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression memberValue;
            ecoreObject.setMemberValue( new ExpressionVisitor().visit( javaParserObject.getMemberValue(), factory ));

            return ecoreObject;
        }

    }

    private static class StringLiteralExprVisitor extends GenericVisitorAdapter< StringLiteralExpr, EJavaFactory > {

        @Override
        public StringLiteralExpr visit( com.github.javaparser.ast.expr.StringLiteralExpr javaParserObject, EJavaFactory factory ) {

            StringLiteralExpr ecoreObject = factory.createStringLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SuperExprVisitor extends GenericVisitorAdapter< SuperExpr, EJavaFactory > {

        @Override
        public SuperExpr visit( com.github.javaparser.ast.expr.SuperExpr javaParserObject, EJavaFactory factory ) {

            SuperExpr ecoreObject = factory.createSuperExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Name typeName;
            javaParserObject.getTypeName().ifPresent(
                    tn -> ecoreObject.setTypeName( new NameVisitor().visit( tn, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class SwitchExprVisitor extends GenericVisitorAdapter< SwitchExpr, EJavaFactory > {

        @Override
        public SwitchExpr visit( com.github.javaparser.ast.expr.SwitchExpr javaParserObject, EJavaFactory factory ) {

            SwitchExpr ecoreObject = factory.createSwitchExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements SwitchNode
            new SwitchNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TextBlockLiteralExprVisitor extends GenericVisitorAdapter< TextBlockLiteralExpr, EJavaFactory > {

        @Override
        public TextBlockLiteralExpr visit( com.github.javaparser.ast.expr.TextBlockLiteralExpr javaParserObject, EJavaFactory factory ) {

            TextBlockLiteralExpr ecoreObject = factory.createTextBlockLiteralExpr();
            
            // extends LiteralStringValueExpr
            new LiteralStringValueExprVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ThisExprVisitor extends GenericVisitorAdapter< ThisExpr, EJavaFactory > {

        @Override
        public ThisExpr visit( com.github.javaparser.ast.expr.ThisExpr javaParserObject, EJavaFactory factory ) {

            ThisExpr ecoreObject = factory.createThisExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Name typeName;
            javaParserObject.getTypeName().ifPresent(
                    tn -> ecoreObject.setTypeName( new NameVisitor().visit( tn, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class TypeExprVisitor extends GenericVisitorAdapter< TypeExpr, EJavaFactory > {

        @Override
        public TypeExpr visit( com.github.javaparser.ast.expr.TypeExpr javaParserObject, EJavaFactory factory ) {

            TypeExpr ecoreObject = factory.createTypeExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithType
            new NodeWithTypeVisitor< Type >().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class UnaryExprVisitor extends GenericVisitorAdapter< UnaryExpr, EJavaFactory > {

        @Override
        public UnaryExpr visit( com.github.javaparser.ast.expr.UnaryExpr javaParserObject, EJavaFactory factory ) {

            UnaryExpr ecoreObject = factory.createUnaryExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class VariableDeclarationExprVisitor extends GenericVisitorAdapter< VariableDeclarationExpr, EJavaFactory > {

        @Override
        public VariableDeclarationExpr visit( com.github.javaparser.ast.expr.VariableDeclarationExpr javaParserObject, EJavaFactory factory ) {

            VariableDeclarationExpr ecoreObject = factory.createVariableDeclarationExpr();
            
            // extends Expression
            new ExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithFinalModifier
            new NodeWithFinalModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithVariables
            new NodeWithVariablesVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleDeclarationVisitor extends GenericVisitorAdapter< ModuleDeclaration, EJavaFactory > {

        @Override
        public ModuleDeclaration visit( com.github.javaparser.ast.modules.ModuleDeclaration javaParserObject, EJavaFactory factory ) {

            ModuleDeclaration ecoreObject = factory.createModuleDeclaration();

            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );

            // private boolean isOpen;
            ecoreObject.setOpen( javaParserObject.isOpen() );

            // private NodeList<ModuleDirective> directives;
            javaParserObject.getDirectives().forEach(
                    d -> ecoreObject.getDirectives().add( new ModuleDirectiveVisitor().visit( d, factory ) ) );

            return ecoreObject;
        }

    }

    private static class ModuleDirectiveVisitor extends GenericVisitorAdapter< ModuleDirective, EJavaFactory > {

        public ModuleDirective visit( com.github.javaparser.ast.modules.ModuleDirective javaParserObject, EJavaFactory factory ) {
            
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

        public ModuleDirective collect( com.github.javaparser.ast.modules.ModuleDirective javaParserObject, EJavaFactory factory, ModuleDirective ecoreObject ) {
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleExportsDirectiveVisitor extends GenericVisitorAdapter< ModuleExportsDirective, EJavaFactory > {

        @Override
        public ModuleExportsDirective visit( com.github.javaparser.ast.modules.ModuleExportsDirective javaParserObject, EJavaFactory factory ) {

            ModuleExportsDirective ecoreObject = factory.createModuleExportsDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getModuleNames().forEach(
                    name -> ecoreObject.getModuleNames().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleOpensDirectiveVisitor extends GenericVisitorAdapter< ModuleOpensDirective, EJavaFactory > {

        @Override
        public ModuleOpensDirective visit( com.github.javaparser.ast.modules.ModuleOpensDirective javaParserObject, EJavaFactory factory ) {

            ModuleOpensDirective ecoreObject = factory.createModuleOpensDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getModuleNames().forEach(
                    name -> ecoreObject.getModuleNames().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleProvidesDirectiveVisitor extends GenericVisitorAdapter< ModuleProvidesDirective, EJavaFactory > {

        @Override
        public ModuleProvidesDirective visit( com.github.javaparser.ast.modules.ModuleProvidesDirective javaParserObject, EJavaFactory factory ) {

            ModuleProvidesDirective ecoreObject = factory.createModuleProvidesDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<Name> moduleNames;
            javaParserObject.getWith().forEach(
                    name -> ecoreObject.getWith().add( new NameVisitor().visit( name, factory ))
            );

            return ecoreObject;
        }

    }

    private static class ModuleRequiresDirectiveVisitor extends GenericVisitorAdapter< ModuleRequiresDirective, EJavaFactory > {

        @Override
        public ModuleRequiresDirective visit( com.github.javaparser.ast.modules.ModuleRequiresDirective javaParserObject, EJavaFactory factory ) {

            ModuleRequiresDirective ecoreObject = factory.createModuleRequiresDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().collect( javaParserObject, factory, ecoreObject );

            // implements NodeWithStaticModifier
            new NodeWithStaticModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NOT in JavaParser: implements NodeWithTransitiveModifier
            new NodeWithTransitiveModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ModuleUsesDirectiveVisitor extends GenericVisitorAdapter< ModuleUsesDirective, EJavaFactory > {

        @Override
        public ModuleUsesDirective visit( com.github.javaparser.ast.modules.ModuleUsesDirective javaParserObject, EJavaFactory factory ) {

            ModuleUsesDirective ecoreObject = factory.createModuleUsesDirective();
            
            // extends ModuleDirective
            new ModuleDirectiveVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithName
            new NodeWithNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class NodeWithAnnotationsVisitor extends GenericVisitorAdapter< NodeWithAnnotations, EJavaFactory > {

        public NodeWithAnnotations collect( com.github.javaparser.ast.nodeTypes.NodeWithAnnotations< ? > javaParserObject, EJavaFactory factory, NodeWithAnnotations ecoreObject ) {

            AnnotationExprVisitor visitor = new AnnotationExprVisitor();
            javaParserObject.getAnnotations().forEach(
                    a -> ecoreObject.getAnnotations().add( visitor.visit( a, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithArgumentsVisitor extends GenericVisitorAdapter< NodeWithArguments, EJavaFactory > {

        public NodeWithArguments collect( com.github.javaparser.ast.nodeTypes.NodeWithArguments< ? > javaParserObject, EJavaFactory factory, NodeWithArguments ecoreObject ) {

            javaParserObject.getArguments().forEach(
                    arg -> ecoreObject.getArguments().add( new ExpressionVisitor().visit( arg, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithBlockStmtVisitor extends GenericVisitorAdapter< NodeWithBlockStmt, EJavaFactory > {

        public NodeWithBlockStmt collect( com.github.javaparser.ast.nodeTypes.NodeWithBlockStmt< ? > javaParserObject, EJavaFactory factory, NodeWithBlockStmt ecoreObject ) {

            ecoreObject.setBody( new BlockStmtVisitor().visit( javaParserObject.getBody(), factory ));
            
            return ecoreObject;
        }

        public NodeWithBlockStmt collect( com.github.javaparser.ast.nodeTypes.NodeWithOptionalBlockStmt< ? > javaParserObject, EJavaFactory factory, NodeWithBlockStmt ecoreObject ) {
            
            javaParserObject.getBody().ifPresent(
                    bo -> ecoreObject.setBody( new BlockStmtVisitor().visit( bo, factory ))
            );
            return ecoreObject;
        }

    }

    private static class NodeWithBodyVisitor extends GenericVisitorAdapter< NodeWithBody, EJavaFactory > {

        public NodeWithBody collect( com.github.javaparser.ast.nodeTypes.NodeWithBody< ? > javaParserObject, EJavaFactory factory, NodeWithBody ecoreObject ) {

            ecoreObject.setBody( new StatementVisitor().visit( javaParserObject.getBody(), factory ) );
            
            return ecoreObject;
        }

    }

    private static class NodeWithConditionVisitor extends GenericVisitorAdapter< NodeWithCondition, EJavaFactory > {

        public NodeWithCondition collect( com.github.javaparser.ast.nodeTypes.NodeWithCondition< ? > javaParserObject, EJavaFactory factory, NodeWithCondition ecoreObject ) {

            ecoreObject.setCondition( new ExpressionVisitor().visit( javaParserObject.getCondition(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithExpressionVisitor extends GenericVisitorAdapter< NodeWithExpression, EJavaFactory > {

        public NodeWithExpression collect( com.github.javaparser.ast.nodeTypes.NodeWithExpression< ? > javaParserObject, EJavaFactory factory, NodeWithExpression ecoreObject ) {

            ecoreObject.setExpression(  new ExpressionVisitor().visit( javaParserObject.getExpression(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithExtendsVisitor extends GenericVisitorAdapter< NodeWithExtends, EJavaFactory > {

        public NodeWithExtends collect( com.github.javaparser.ast.nodeTypes.NodeWithExtends< ? > javaParserObject, EJavaFactory factory, NodeWithExtends ecoreObject ) {

            javaParserObject.getExtendedTypes().forEach(
                    et -> ecoreObject.getExtendedTypes().add( new ClassOrInterfaceTypeVisitor().visit( et, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithIdentifierVisitor extends GenericVisitorAdapter< NodeWithIdentifier, EJavaFactory > {

        public NodeWithIdentifier collect( com.github.javaparser.ast.nodeTypes.NodeWithIdentifier< ? > javaParserObject, EJavaFactory factory, NodeWithIdentifier ecoreObject ) {

            ecoreObject.setIdentifier( javaParserObject.getIdentifier() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithImplementsVisitor extends GenericVisitorAdapter< NodeWithImplements, EJavaFactory > {

        public NodeWithImplements collect( com.github.javaparser.ast.nodeTypes.NodeWithImplements< ? > javaParserObject, EJavaFactory factory, NodeWithImplements ecoreObject ) {

            javaParserObject.getImplementedTypes().forEach(
                    et -> ecoreObject.getImplementedTypes().add( new ClassOrInterfaceTypeVisitor().visit( et, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithJavadocVisitor extends GenericVisitorAdapter< NodeWithJavadoc, EJavaFactory > {

        public NodeWithJavadoc collect( com.github.javaparser.ast.nodeTypes.NodeWithJavadoc< ? > javaParserObject, EJavaFactory factory, NodeWithJavadoc ecoreObject ) {

            // Not sure about its usefulness
            // And we don't have to check that Javadoc comments are used only when they are allowed, JavaParser has already done this
//            javaParserObject.getJavadocComment().ifPresent( 
//                    cm -> ecoreObject.setComment( new JavadocCommentVisitor().visit( cm, factory ))
//            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithLabelVisitor extends GenericVisitorAdapter< NodeWithLabelVisitor, EJavaFactory > {

        public NodeWithLabel collect( com.github.javaparser.ast.nodeTypes.NodeWithOptionalLabel< ? > javaParserObject, EJavaFactory factory, NodeWithLabel ecoreObject ) {

            javaParserObject.getLabel().ifPresent( 
                    la -> ecoreObject.setLabel( new SimpleNameVisitor().visit( la, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithMembersVisitor extends GenericVisitorAdapter< NodeWithMembers, EJavaFactory > {

        public NodeWithMembers collect( com.github.javaparser.ast.nodeTypes.NodeWithMembers< ? > javaParserObject, EJavaFactory factory, NodeWithMembers ecoreObject ) {

            javaParserObject.getMembers().forEach(
                    mb -> ecoreObject.getMembers().add( new BodyDeclarationVisitor().visit( mb, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithModifiersVisitor extends GenericVisitorAdapter< NodeWithModifiers, EJavaFactory > {
//
//        public NodeWithModifiers collect( com.github.javaparser.ast.nodeTypes.NodeWithModifiers< ? > javaParserObject, EJavaFactory factory, NodeWithModifiers ecoreObject ) {
//
//            javaParserObject.getModifiers().forEach(
//                    mo -> ecoreObject.getModifiers().add( new ModifierVisitor().visit( mo, factory ).getKeyword())
//            );
//            
//            return null;
//        }
//
//    }

    private static class NodeWithNameVisitor extends GenericVisitorAdapter< NodeWithName, EJavaFactory > {

        public NodeWithName collect( com.github.javaparser.ast.nodeTypes.NodeWithName< ? > javaParserObject, EJavaFactory factory, NodeWithName ecoreObject ) {

            ecoreObject.setName( new NameVisitor().visit( javaParserObject.getName(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithParametersVisitor extends GenericVisitorAdapter< NodeWithParameters, EJavaFactory > {

        public NodeWithParameters collect( com.github.javaparser.ast.nodeTypes.NodeWithParameters< ? > javaParserObject, EJavaFactory factory, NodeWithParameters ecoreObject ) {

            javaParserObject.getParameters().forEach(
                    pa -> ecoreObject.getParameters().add( new ParameterVisitor().visit( pa, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithRangeVisitor extends GenericVisitorAdapter< NodeWithRange, EJavaFactory > {
//
//        public NodeWithRange collect( com.github.javaparser.ast.nodeTypes.NodeWithRange javaParserObject, EJavaFactory factory, NodeWithRange ecoreObject ) {
//
//            return ecoreObject;
//        }
//
//    }

    private static class NodeWithScopeVisitor extends GenericVisitorAdapter< NodeWithScope< ? >, EJavaFactory > {

        public NodeWithScope< ? > collect( com.github.javaparser.ast.nodeTypes.NodeWithScope< ? > javaParserObject, EJavaFactory factory, NodeWithScope< Expression > ecoreObject ) {
            
            ecoreObject.setScope( new ExpressionVisitor().visit( javaParserObject.getScope(), factory ));
            
            return ecoreObject;
        }

        public NodeWithScope< ? > collect( com.github.javaparser.ast.nodeTypes.NodeWithOptionalScope< ? > javaParserObject, EJavaFactory factory, NodeWithScope< Expression > ecoreObject ) {
            
            javaParserObject.getScope().ifPresent(
                    sc -> ecoreObject.setScope( new ExpressionVisitor().visit( sc, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithSimpleNameVisitor extends GenericVisitorAdapter< NodeWithSimpleName, EJavaFactory > {

        public NodeWithSimpleName collect( com.github.javaparser.ast.nodeTypes.NodeWithSimpleName< ? > javaParserObject, EJavaFactory factory, NodeWithSimpleName ecoreObject ) {

            ecoreObject.setName( new SimpleNameVisitor().visit( javaParserObject.getName(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithStatementsVisitor extends GenericVisitorAdapter< NodeWithStatements, EJavaFactory > {

        public NodeWithStatements collect( com.github.javaparser.ast.nodeTypes.NodeWithStatements< ? > javaParserObject, EJavaFactory factory, NodeWithStatements ecoreObject ) {

            javaParserObject.getStatements().forEach(
                    st -> ecoreObject.getStatements().add( new StatementVisitor().visit( st, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithThrownExceptionsVisitor extends GenericVisitorAdapter< NodeWithThrownExceptions, EJavaFactory > {

        public NodeWithThrownExceptions collect( com.github.javaparser.ast.nodeTypes.NodeWithThrownExceptions< ? > javaParserObject, EJavaFactory factory, NodeWithThrownExceptions ecoreObject ) {

            javaParserObject.getThrownExceptions().forEach(
                    ex -> ecoreObject.getThrownExceptions().add( new ReferenceTypeVisitor().visit( ex, factory ))
            );
            
            return ecoreObject;
        }

    }

//    private static class NodeWithTokenRangeVisitor extends GenericVisitorAdapter< NodeWithTokenRange, EJavaFactory > {
//
//        public NodeWithTokenRange collect( com.github.javaparser.ast.nodeTypes.NodeWithTokenRange javaParserObject, EJavaFactory factory, NodeWithTokenRange ecoreObject ) {
//            
//            return ecoreObject;
//        }
//
//    }

    private static class NodeWithTypeVisitor< T > extends GenericVisitorAdapter< NodeWithType< T >, EJavaFactory > {

        @SuppressWarnings( "unchecked" )
        public NodeWithType< T > collect( com.github.javaparser.ast.nodeTypes.NodeWithType< ?, ? > javaParserObject, EJavaFactory factory, NodeWithType< T > ecoreObject ) {
            
            ecoreObject.setType( ( T ) new TypeVisitor().visit( javaParserObject.getType(), factory ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithTypeArgumentsVisitor extends GenericVisitorAdapter< NodeWithTypeArguments, EJavaFactory > {

        public NodeWithTypeArguments collect( com.github.javaparser.ast.nodeTypes.NodeWithTypeArguments< ? > javaParserObject, EJavaFactory factory, NodeWithTypeArguments ecoreObject ) {

            javaParserObject.getTypeArguments().ifPresent(
                    tal -> tal.forEach( ta -> ecoreObject.getTypeArguments().add( new TypeVisitor().visit( ta, factory )))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithTypeParametersVisitor extends GenericVisitorAdapter< NodeWithTypeParameters, EJavaFactory > {

        public NodeWithTypeParameters collect( com.github.javaparser.ast.nodeTypes.NodeWithTypeParameters< ? > javaParserObject, EJavaFactory factory, NodeWithTypeParameters ecoreObject ) {

            javaParserObject.getTypeParameters().forEach(
                    tp -> ecoreObject.getTypeParameters().add( new TypeParameterVisitor().visit( tp, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class NodeWithVariablesVisitor extends GenericVisitorAdapter< NodeWithVariables, EJavaFactory > {

        public NodeWithVariables collect( com.github.javaparser.ast.nodeTypes.NodeWithVariables< ? > javaParserObject, EJavaFactory factory, NodeWithVariables ecoreObject ) {

            javaParserObject.getVariables().forEach(
                    vd -> ecoreObject.getVariables().add( new VariableDeclaratorVisitor().visit( vd, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class SwitchNodeVisitor extends GenericVisitorAdapter< SwitchNode, EJavaFactory > {

        public SwitchNode collect( com.github.javaparser.ast.nodeTypes.SwitchNode javaParserObject, EJavaFactory factory, SwitchNode ecoreObject ) {
            
            javaParserObject.getEntries().forEach(
                    en -> ecoreObject.getEntries().add( new SwitchEntryVisitor().visit( en, factory ))
            );

            return ecoreObject;
        }

    }

    private static class NodeWithAbstractModifierVisitor extends GenericVisitorAdapter< NodeWithAbstractModifier, EJavaFactory > {

        public NodeWithAbstractModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAbstractModifier< ? > javaParserObject, EJavaFactory factory, NodeWithAbstractModifier ecoreObject ) {

            ecoreObject.setAbstract( javaParserObject.isAbstract() );
            
            return null;
        }

    }

    private static class NodeWithAccessModifiersVisitor extends GenericVisitorAdapter< NodeWithAccessModifiers, EJavaFactory > {

        public NodeWithAccessModifiers collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithAccessModifiers< ? > javaParserObject, EJavaFactory factory, NodeWithAccessModifiers ecoreObject ) {

            // extends NodeWithPublicModifier
            new NodeWithPublicModifierVisitor().collect( javaParserObject, factory, ecoreObject );

            // extends NodeWithPrivateModifier
            new NodeWithPrivateModifierVisitor().collect( javaParserObject, factory, ecoreObject );

            // extends NodeWithProtectedModifier
            new NodeWithProtectedModifierVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return null;
        }

    }

    private static class NodeWithDefaultModifierVisitor extends GenericVisitorAdapter< NodeWithDefaultModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithDefaultModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithDefaultModifier< ? > javaParserObject, EJavaFactory factory, NodeWithDefaultModifier ecoreObject ) {
        public NodeWithDefaultModifier collect( com.github.javaparser.ast.nodeTypes.          NodeWithModifiers      < ? > javaParserObject, EJavaFactory factory, NodeWithDefaultModifier ecoreObject ) {

            ecoreObject.setDefault( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.DEFAULT ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithFinalModifierVisitor extends GenericVisitorAdapter< NodeWithFinalModifier, EJavaFactory > {

        public NodeWithFinalModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithFinalModifier< ? > javaParserObject, EJavaFactory factory, NodeWithFinalModifier ecoreObject ) {

            ecoreObject.setFinal( javaParserObject.isFinal() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithNativeModifierVisitor extends GenericVisitorAdapter< NodeWithNativeModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithNativeModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithNativeModifier javaParserObject, EJavaFactory factory, NodeWithNativeModifier ecoreObject ) {
        public NodeWithNativeModifier collect( com.github.javaparser.ast.nodeTypes          .NodeWithModifiers< ? > javaParserObject, EJavaFactory factory, NodeWithNativeModifier ecoreObject ) {

            ecoreObject.setNative( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.NATIVE ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithPrivateModifierVisitor extends GenericVisitorAdapter< NodeWithPrivateModifier, EJavaFactory > {

        public NodeWithPrivateModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPrivateModifier< ? > javaParserObject, EJavaFactory factory, NodeWithPrivateModifier ecoreObject ) {

            ecoreObject.setPrivate( javaParserObject.isPrivate() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithProtectedModifierVisitor extends GenericVisitorAdapter< NodeWithProtectedModifier, EJavaFactory > {

        public NodeWithProtectedModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithProtectedModifier< ? > javaParserObject, EJavaFactory factory, NodeWithProtectedModifier ecoreObject ) {

            ecoreObject.setProtected( javaParserObject.isProtected() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithPublicModifierVisitor extends GenericVisitorAdapter< NodeWithPublicModifier, EJavaFactory > {

        public NodeWithPublicModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithPublicModifier< ? > javaParserObject, EJavaFactory factory, NodeWithPublicModifier ecoreObject ) {

            ecoreObject.setPublic( javaParserObject.isPublic() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithStaticModifierVisitor extends GenericVisitorAdapter< NodeWithStaticModifier, EJavaFactory > {

        public NodeWithStaticModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStaticModifier< ? > javaParserObject, EJavaFactory factory, NodeWithStaticModifier ecoreObject ) {

            ecoreObject.setStatic( javaParserObject.isStatic() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithSynchronizedModifierVisitor extends GenericVisitorAdapter< NodeWithSynchronizedModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithSynchronizedModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithSynchronizedModifier javaParserObject, EJavaFactory factory, NodeWithSynchronizedModifier ecoreObject ) {
        public NodeWithSynchronizedModifier collect( com.github.javaparser.ast.nodeTypes          .NodeWithModifiers< ? >       javaParserObject, EJavaFactory factory, NodeWithSynchronizedModifier ecoreObject ) {

            ecoreObject.setSynchronized( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.SYNCHRONIZED ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithStrictfpModifierVisitor extends GenericVisitorAdapter< NodeWithStrictfpModifier, EJavaFactory > {

        public NodeWithStrictfpModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithStrictfpModifier< ? > javaParserObject, EJavaFactory factory, NodeWithStrictfpModifier ecoreObject ) {

            ecoreObject.setStrictfp( javaParserObject.isStrictfp() );
            
            return ecoreObject;
        }

    }

    private static class NodeWithTransientModifierVisitor extends GenericVisitorAdapter< NodeWithTransientModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithTransientModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithTransientModifier javaParserObject, EJavaFactory factory, NodeWithTransientModifier ecoreObject ) {
        public NodeWithTransientModifier collect( com.github.javaparser.ast.nodeTypes          .NodeWithModifiers< ? >    javaParserObject, EJavaFactory factory, NodeWithTransientModifier ecoreObject ) {

            ecoreObject.setTransient( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.TRANSIENT ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithTransitiveModifierVisitor extends GenericVisitorAdapter< NodeWithTransitiveModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithTransitiveModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithTransitiveModifier javaParserObject, EJavaFactory factory, NodeWithTransitiveModifier ecoreObject ) {
        public NodeWithTransitiveModifier collect( com.github.javaparser.ast.nodeTypes          .NodeWithModifiers< ? >     javaParserObject, EJavaFactory factory, NodeWithTransitiveModifier ecoreObject ) {

            ecoreObject.setTransitive( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.TRANSITIVE ));
            
            return ecoreObject;
        }

    }

    private static class NodeWithVolatileModifierVisitor extends GenericVisitorAdapter< NodeWithVolatileModifier, EJavaFactory > {

        // Does not exist in JavaParser
      //public NodeWithVolatileModifier collect( com.github.javaparser.ast.nodeTypes.modifiers.NodeWithVolatileModifier javaParserObject, EJavaFactory factory, NodeWithVolatileModifier ecoreObject ) {
        public NodeWithVolatileModifier collect( com.github.javaparser.ast.nodeTypes          .NodeWithModifiers< ? >   javaParserObject, EJavaFactory factory, NodeWithVolatileModifier ecoreObject ) {

            ecoreObject.setVolatile( javaParserObject.hasModifier( com.github.javaparser.ast.Modifier.Keyword.VOLATILE ));
            
            return ecoreObject;
        }

    }

    private static class AssertStmtVisitor extends GenericVisitorAdapter< AssertStmt, EJavaFactory > {

        @Override
        public AssertStmt visit( com.github.javaparser.ast.stmt.AssertStmt javaParserObject, EJavaFactory factory ) {

            AssertStmt ecoreObject = factory.createAssertStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression check;
            ecoreObject.setCheck( new ExpressionVisitor().visit( javaParserObject.getCheck(), factory ));
            
            // Expression message;
            javaParserObject.getMessage().ifPresent(
                    me -> ecoreObject.setMessage( new ExpressionVisitor().visit( me, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class BlockStmtVisitor extends GenericVisitorAdapter< BlockStmt, EJavaFactory > {

        @Override
        public BlockStmt visit( com.github.javaparser.ast.stmt.BlockStmt javaParserObject, EJavaFactory factory ) {

            BlockStmt ecoreObject = factory.createBlockStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStatements
            new NodeWithStatementsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class BreakStmtVisitor extends GenericVisitorAdapter< BreakStmt, EJavaFactory > {

        @Override
        public BreakStmt visit( com.github.javaparser.ast.stmt.BreakStmt javaParserObject, EJavaFactory factory ) {

            BreakStmt ecoreObject = factory.createBreakStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // SimpleName label;
            // BreakStmt does not implement NodeWithOptionalLabel
            //new NodeWithLabelVisitor().collect( javaParserObject, factory, ecoreObject );
            javaParserObject.getLabel().ifPresent(
                    la -> ecoreObject.setLabel( new SimpleNameVisitor().visit( la, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class CatchClauseVisitor extends GenericVisitorAdapter< CatchClause, EJavaFactory > {

        @Override
        public CatchClause visit( com.github.javaparser.ast.stmt.CatchClause javaParserObject, EJavaFactory factory ) {

            CatchClause ecoreObject = factory.createCatchClause();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Parameter parameter;
            ecoreObject.setParameter( new ParameterVisitor().visit( javaParserObject.getParameter(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ContinueStmtVisitor extends GenericVisitorAdapter< ContinueStmt, EJavaFactory > {

        @Override
        public ContinueStmt visit( com.github.javaparser.ast.stmt.ContinueStmt javaParserObject, EJavaFactory factory ) {

            ContinueStmt ecoreObject = factory.createContinueStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithOptionalLabel
            new NodeWithLabelVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class DoStmtVisitor extends GenericVisitorAdapter< DoStmt, EJavaFactory > {

        @Override
        public DoStmt visit( com.github.javaparser.ast.stmt.DoStmt javaParserObject, EJavaFactory factory ) {

            DoStmt ecoreObject = factory.createDoStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class EmptyStmtVisitor extends GenericVisitorAdapter< EmptyStmt, EJavaFactory > {

        @Override
        public EmptyStmt visit( com.github.javaparser.ast.stmt.EmptyStmt javaParserObject, EJavaFactory factory ) {

            EmptyStmt ecoreObject = factory.createEmptyStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ExplicitConstructorInvocationStmtVisitor extends GenericVisitorAdapter< ExplicitConstructorInvocationStmt, EJavaFactory > {

        @Override
        public ExplicitConstructorInvocationStmt visit( com.github.javaparser.ast.stmt.ExplicitConstructorInvocationStmt javaParserObject, EJavaFactory factory ) {

            ExplicitConstructorInvocationStmt ecoreObject = factory.createExplicitConstructorInvocationStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithArguments
            new NodeWithArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class ExpressionStmtVisitor extends GenericVisitorAdapter< ExpressionStmt, EJavaFactory > {

        @Override
        public ExpressionStmt visit( com.github.javaparser.ast.stmt.ExpressionStmt javaParserObject, EJavaFactory factory ) {

            ExpressionStmt ecoreObject = factory.createExpressionStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ForEachStmtVisitor extends GenericVisitorAdapter< ForEachStmt, EJavaFactory > {

        @Override
        public ForEachStmt visit( com.github.javaparser.ast.stmt.ForEachStmt javaParserObject, EJavaFactory factory ) {

            ForEachStmt ecoreObject = factory.createForEachStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // VariableDeclarationExpr variable;
            ecoreObject.setVariable( new VariableDeclarationExprVisitor().visit( javaParserObject.getVariable(), factory ));
            
            // Expression iterable;
            ecoreObject.setIterable( new ExpressionVisitor().visit( javaParserObject.getIterable(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ForStmtVisitor extends GenericVisitorAdapter< ForStmt, EJavaFactory > {

        @Override
        public ForStmt visit( com.github.javaparser.ast.stmt.ForStmt javaParserObject, EJavaFactory factory ) {

            ForStmt ecoreObject = factory.createForStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class IfStmtVisitor extends GenericVisitorAdapter< IfStmt, EJavaFactory > {

        @Override
        public IfStmt visit( com.github.javaparser.ast.stmt.IfStmt javaParserObject, EJavaFactory factory ) {

            IfStmt ecoreObject = factory.createIfStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Statement thenStmt;
            ecoreObject.setThenStmt( new StatementVisitor().visit( javaParserObject.getThenStmt(), factory ));
            
            // Statement elseStmt;
            javaParserObject.getElseStmt().ifPresent(
                    el -> ecoreObject.setElseStmt( new StatementVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class LabeledStmtVisitor extends GenericVisitorAdapter< LabeledStmt, EJavaFactory > {

        @Override
        public LabeledStmt visit( com.github.javaparser.ast.stmt.LabeledStmt javaParserObject, EJavaFactory factory ) {

            LabeledStmt ecoreObject = factory.createLabeledStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // SimpleName label;
            // NodeWithLabel does not exist
            //new NodeWithLabelVisitor().collect( javaParserObject, factory, ecoreObject );
            ecoreObject.setLabel( new SimpleNameVisitor().visit( javaParserObject.getLabel(), factory ));
            
            // Statement statement;
            // NodeWithStatement does not exist
            ecoreObject.setStatement( new StatementVisitor().visit( javaParserObject.getLabel(), factory ));

            return ecoreObject;
        }

    }

    private static class LocalClassDeclarationStmtVisitor extends GenericVisitorAdapter< LocalClassDeclarationStmt, EJavaFactory > {

        @Override
        public LocalClassDeclarationStmt visit( com.github.javaparser.ast.stmt.LocalClassDeclarationStmt javaParserObject, EJavaFactory factory ) {

            LocalClassDeclarationStmt ecoreObject = factory.createLocalClassDeclarationStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // ClassOrInterfaceDeclaration classDeclaration;
            ecoreObject.setClassDeclaration( new ClassOrInterfaceDeclarationVisitor().visit( javaParserObject.getClassDeclaration(), factory ));
            
            return ecoreObject;
        }

    }

    private static class ReturnStmtVisitor extends GenericVisitorAdapter< ReturnStmt, EJavaFactory > {

        @Override
        public ReturnStmt visit( com.github.javaparser.ast.stmt.ReturnStmt javaParserObject, EJavaFactory factory ) {

            ReturnStmt ecoreObject = factory.createReturnStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // Expression expression;
            javaParserObject.getExpression().ifPresent(
                    ex -> ecoreObject.setExpression( new ExpressionVisitor().visit( ex, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class StatementVisitor extends GenericVisitorAdapter< Statement, EJavaFactory > {

        public Statement visit( com.github.javaparser.ast.stmt.Statement javaParserObject, EJavaFactory factory ) {

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

        public Statement collect( com.github.javaparser.ast.stmt.Statement javaParserObject, EJavaFactory factory,  Statement ecoreObject ) {
    
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SwitchEntryVisitor extends GenericVisitorAdapter< SwitchEntry, EJavaFactory > {

        @Override
        public SwitchEntry visit( com.github.javaparser.ast.stmt.SwitchEntry javaParserObject, EJavaFactory factory ) {

            SwitchEntry ecoreObject = factory.createSwitchEntry();
            
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithStatements
            new NodeWithStatementsVisitor().collect( javaParserObject, factory, ecoreObject );

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

    private static class SwitchStmtVisitor extends GenericVisitorAdapter< SwitchStmt, EJavaFactory > {

        @Override
        public SwitchStmt visit( com.github.javaparser.ast.stmt.SwitchStmt javaParserObject, EJavaFactory factory ) {

            SwitchStmt ecoreObject = factory.createSwitchStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements SwitchNode
            new SwitchNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class SynchronizedStmtVisitor extends GenericVisitorAdapter< SynchronizedStmt, EJavaFactory > {

        @Override
        public SynchronizedStmt visit( com.github.javaparser.ast.stmt.SynchronizedStmt javaParserObject, EJavaFactory factory ) {

            SynchronizedStmt ecoreObject = factory.createSynchronizedStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBlockStmt
            new NodeWithBlockStmtVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ThrowStmtVisitor extends GenericVisitorAdapter< ThrowStmt, EJavaFactory > {

        @Override
        public ThrowStmt visit( com.github.javaparser.ast.stmt.ThrowStmt javaParserObject, EJavaFactory factory ) {

            ThrowStmt ecoreObject = factory.createThrowStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TryStmtVisitor extends GenericVisitorAdapter< TryStmt, EJavaFactory > {

        @Override
        public TryStmt visit( com.github.javaparser.ast.stmt.TryStmt javaParserObject, EJavaFactory factory ) {

            TryStmt ecoreObject = factory.createTryStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class WhileStmtVisitor extends GenericVisitorAdapter< WhileStmt, EJavaFactory > {

        @Override
        public WhileStmt visit( com.github.javaparser.ast.stmt.WhileStmt javaParserObject, EJavaFactory factory ) {

            WhileStmt ecoreObject = factory.createWhileStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithBody
            new NodeWithBodyVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithCondition
            new NodeWithConditionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class YieldStmtVisitor extends GenericVisitorAdapter< YieldStmt, EJavaFactory > {

        @Override
        public YieldStmt visit( com.github.javaparser.ast.stmt.YieldStmt javaParserObject, EJavaFactory factory ) {

            YieldStmt ecoreObject = factory.createYieldStmt();
            
            // extends Statement
            new StatementVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithExpression
            new NodeWithExpressionVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class ArrayTypeVisitor extends GenericVisitorAdapter< ArrayType, EJavaFactory > {

        @Override
        public ArrayType visit( com.github.javaparser.ast.type.ArrayType javaParserObject, EJavaFactory factory ) {

            ArrayType ecoreObject = factory.createArrayType();
            
            // extends ReferenceType
            new ReferenceTypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class ClassOrInterfaceTypeVisitor extends GenericVisitorAdapter< ClassOrInterfaceType, EJavaFactory > {

        @Override
        public ClassOrInterfaceType visit( com.github.javaparser.ast.type.ClassOrInterfaceType javaParserObject, EJavaFactory factory ) {

            ClassOrInterfaceType ecoreObject = factory.createClassOrInterfaceType();

            // extends ReferenceType
            new ReferenceTypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithTypeArguments
            new NodeWithTypeArgumentsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // ClassOrInterfaceType scope;
            javaParserObject.getScope().ifPresent(
                    sc -> ecoreObject.setScope( new ClassOrInterfaceTypeVisitor().visit( sc, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class IntersectionTypeVisitor extends GenericVisitorAdapter< IntersectionType, EJavaFactory > {

        @Override
        public IntersectionType visit( com.github.javaparser.ast.type.IntersectionType javaParserObject, EJavaFactory factory ) {

            IntersectionType ecoreObject = factory.createIntersectionType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<ReferenceType> elements;
            javaParserObject.getElements().forEach(
                    el -> ecoreObject.getElements().add( new ReferenceTypeVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class PrimitiveTypeVisitor extends GenericVisitorAdapter< PrimitiveType, EJavaFactory > {

        @Override
        public PrimitiveType visit( com.github.javaparser.ast.type.PrimitiveType javaParserObject, EJavaFactory factory ) {

            PrimitiveType ecoreObject = factory.createPrimitiveType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
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

    private static class ReferenceTypeVisitor extends GenericVisitorAdapter< ReferenceType, EJavaFactory > {

        public ReferenceType visit( com.github.javaparser.ast.type.ReferenceType javaParserObject, EJavaFactory factory ) {

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

        public ReferenceType collect( com.github.javaparser.ast.type.ReferenceType javaParserObject, EJavaFactory factory, ReferenceType ecoreObject ) {
    
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeVisitor extends GenericVisitorAdapter< Type, EJavaFactory > {

        public Type visit( com.github.javaparser.ast.type.Type javaParserObject, EJavaFactory factory ) {

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

        public Type collect( com.github.javaparser.ast.type.Type javaParserObject, EJavaFactory factory, Type ecoreObject ) {
    
            // Extends Node
            new JavaNodeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class TypeParameterVisitor extends GenericVisitorAdapter< TypeParameter, EJavaFactory > {

        @Override
        public TypeParameter visit( com.github.javaparser.ast.type.TypeParameter javaParserObject, EJavaFactory factory ) {

            TypeParameter ecoreObject = factory.createTypeParameter();

            // extends ReferenceType
            new ReferenceTypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithSimpleName
            new NodeWithSimpleNameVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<ClassOrInterfaceType> typeBound
            javaParserObject.getTypeBound().forEach(
                    tb -> ecoreObject.getTypeBound().add( new ClassOrInterfaceTypeVisitor().visit( tb, factory ))
            );

            return ecoreObject;
        }

    }

    private static class UnionTypeVisitor extends GenericVisitorAdapter< UnionType, EJavaFactory > {

        @Override
        public UnionType visit( com.github.javaparser.ast.type.UnionType javaParserObject, EJavaFactory factory ) {

            UnionType ecoreObject = factory.createUnionType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // NodeList<ReferenceType> elements;
            javaParserObject.getElements().forEach(
                    el -> ecoreObject.getElements().add( new ReferenceTypeVisitor().visit( el, factory ))
            );
            
            return ecoreObject;
        }

    }

    private static class UnknownTypeVisitor extends GenericVisitorAdapter< UnknownType, EJavaFactory > {

        @Override
        public UnknownType visit( com.github.javaparser.ast.type.UnknownType javaParserObject, EJavaFactory factory ) {

            UnknownType ecoreObject = factory.createUnknownType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class VarTypeVisitor extends GenericVisitorAdapter< VarType, EJavaFactory > {

        @Override
        public VarType visit( com.github.javaparser.ast.type.VarType javaParserObject, EJavaFactory factory ) {

            VarType ecoreObject = factory.createVarType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class VoidTypeVisitor extends GenericVisitorAdapter< VoidType, EJavaFactory > {

        @Override
        public VoidType visit( com.github.javaparser.ast.type.VoidType javaParserObject, EJavaFactory factory ) {

            VoidType ecoreObject = factory.createVoidType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
            return ecoreObject;
        }

    }

    private static class WildcardTypeVisitor extends GenericVisitorAdapter< WildcardType, EJavaFactory > {

        @Override
        public WildcardType visit( com.github.javaparser.ast.type.WildcardType javaParserObject, EJavaFactory factory ) {

            WildcardType ecoreObject = factory.createWildcardType();
            
            // extends Type
            new TypeVisitor().collect( javaParserObject, factory, ecoreObject );
            
            // implements NodeWithAnnotations
            new NodeWithAnnotationsVisitor().collect( javaParserObject, factory, ecoreObject );
            
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
