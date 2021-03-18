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
package fr.centralesupelec.csd.ejava.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

import fr.centralesupelec.csd.ejava.util.CreateEJavaModel;

public class TestCreateJavaEModel {

    //private static final String FILE_PATH = "src/fr/centralesupelec/csd/java/test/TestCreateJavaEModel.java";
    private static final String FILE_PATH = "/Users/marcadet/Desktop/Essai.java";

    public static void main( String[] args ) {
        try {
            CreateEJavaModel createEJavaModel = new CreateEJavaModel();
            Resource resource = createEJavaModel.createEJavaModel( new File( FILE_PATH ));
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
