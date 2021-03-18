package fr.centralesupelec.csd.ejava.command;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.centralesupelec.csd.ejava.util.CreateEJavaModel;

public class ConvertToEJavaHandler extends AbstractHandler {

    @Override
    public Object execute( ExecutionEvent event ) throws ExecutionException {
        ISelection sel = HandlerUtil.getCurrentSelection( event );
        if( sel instanceof TreeSelection ) {
            Object selected = (( TreeSelection ) sel ).getFirstElement();
            if( selected instanceof ICompilationUnit ) {
                ICompilationUnit cu = ( ICompilationUnit ) selected;
                try {
                    CreateEJavaModel createEJavaModel = new CreateEJavaModel();
                    IPath path = Platform.getLocation().append( cu.getPath() );
                    Resource resource = createEJavaModel.createEJavaModel( path.toFile() );
                    BufferedOutputStream output = new BufferedOutputStream( new FileOutputStream( path.removeFileExtension().addFileExtension( "ejava" ).toFile() ));
                    resource.save( output, null );
                    output.close();
                }
                catch( FileNotFoundException e ) {
                    e.printStackTrace();
                }
                catch( IOException e ) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
