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
package fr.centralesupelec.csd.java.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import fr.centralesupelec.csd.java.util.CreateJavaModel;

public class TestCreateJavaModel {

    private static final String FILE_PATH = "src/fr/centralesupelec/csd/java/test/TestCreateJavaModel.java";

    public static void main( String[] args ) {
        try {
            CreateJavaModel createJavaModel = new CreateJavaModel();
            Resource resource = createJavaModel.createJavaModel( new File( FILE_PATH ));
            resource.save( System.out, null );
        }
        catch( FileNotFoundException e ) {
            e.printStackTrace();
        }
        catch( IOException e ) {
            e.printStackTrace();
        }
    }

}
