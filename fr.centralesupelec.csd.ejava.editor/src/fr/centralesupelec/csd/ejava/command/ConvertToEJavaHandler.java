package fr.centralesupelec.csd.ejava.command;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.centralesupelec.csd.ejava.util.EJavaModelFactory;

public class ConvertToEJavaHandler extends AbstractHandler {

    @Override
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        ISelection sel = HandlerUtil.getCurrentSelection( event );
        if( sel instanceof TreeSelection ) {
            Object selected = (( TreeSelection ) sel ).getFirstElement();
            if( selected instanceof IJavaProject ) {
                IJavaProject project = ( IJavaProject ) selected;
                
                try {
                    for( IPackageFragmentRoot fragment : project.getPackageFragmentRoots() ) {
                        if( fragment.getKind() == IPackageFragmentRoot.K_SOURCE ) {
                            EJavaModelFactory javaModelFactory = new EJavaModelFactory();
                            IPath projectPath = project.getProject().getLocation();
                            IPath path = projectPath.append( fragment.getPath().removeFirstSegments( 1 ));
                            Resource resource = javaModelFactory.createProjectResource( project.getElementName(), path.toFile() );
                            BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream( projectPath.append( project.getElementName() ).addFileExtension( "ejava" ).toFile() ));
                            resource.save( output, null );
                            output.close();
                            project.getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
                            break;
                       }
                    }
                }
                catch( JavaModelException e ) {
                    e.printStackTrace();
                }
                catch( IOException e ) {
                    e.printStackTrace();
                }
                catch( CoreException e ) {
                    e.printStackTrace();
                }
            }
            if( selected instanceof ICompilationUnit ) {
                ICompilationUnit cu = ( ICompilationUnit ) selected;
                
                try {
                    EJavaModelFactory javaModelFactory = new EJavaModelFactory();
                    IPath path = cu.getJavaProject().getProject().getLocation().append( cu.getPath().removeFirstSegments( 1 ));
                    Resource resource = javaModelFactory.createCompilationUnitResource( path.toFile() );
                    BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream( path.removeFileExtension().addFileExtension( "ejava" ).toFile() ));
                    resource.save( output, null );
                    output.close();
                    cu.getJavaProject().getProject().refreshLocal( IResource.DEPTH_INFINITE, null );
                }
                catch( FileNotFoundException e ) {
                    e.printStackTrace();
                }
                catch( IOException e ) {
                    e.printStackTrace();
                }
                catch( CoreException e ) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
