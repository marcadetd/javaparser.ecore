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
package fr.centralesupelec.csd.ejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getPrimitive()
 * @model
 * @generated
 */
public enum Primitive implements Enumerator {
    /**
     * The '<em><b>BOOLEAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOLEAN_VALUE
     * @generated
     * @ordered
     */
    BOOLEAN( 1, "BOOLEAN", "BOOLEAN" ),

    /**
     * The '<em><b>CHAR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHAR_VALUE
     * @generated
     * @ordered
     */
    CHAR( 2, "CHAR", "CHAR" ),

    /**
     * The '<em><b>BYTE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BYTE_VALUE
     * @generated
     * @ordered
     */
    BYTE( 3, "BYTE", "BYTE" ),

    /**
     * The '<em><b>SHORT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHORT_VALUE
     * @generated
     * @ordered
     */
    SHORT( 4, "SHORT", "SHORT" ),

    /**
     * The '<em><b>INT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT_VALUE
     * @generated
     * @ordered
     */
    INT( 5, "INT", "INT" ),

    /**
     * The '<em><b>LONG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LONG_VALUE
     * @generated
     * @ordered
     */
    LONG( 6, "LONG", "LONG" ),

    /**
     * The '<em><b>FLOAT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT_VALUE
     * @generated
     * @ordered
     */
    FLOAT( 7, "FLOAT", "FLOAT" ),

    /**
     * The '<em><b>DOUBLE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE_VALUE
     * @generated
     * @ordered
     */
    DOUBLE( 8, "DOUBLE", "DOUBLE" );

    /**
     * The '<em><b>BOOLEAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BOOLEAN
     * @model
     * @generated
     * @ordered
     */
    public static final int BOOLEAN_VALUE = 1;

    /**
     * The '<em><b>CHAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHAR
     * @model
     * @generated
     * @ordered
     */
    public static final int CHAR_VALUE = 2;

    /**
     * The '<em><b>BYTE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BYTE
     * @model
     * @generated
     * @ordered
     */
    public static final int BYTE_VALUE = 3;

    /**
     * The '<em><b>SHORT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHORT
     * @model
     * @generated
     * @ordered
     */
    public static final int SHORT_VALUE = 4;

    /**
     * The '<em><b>INT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INT
     * @model
     * @generated
     * @ordered
     */
    public static final int INT_VALUE = 5;

    /**
     * The '<em><b>LONG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LONG
     * @model
     * @generated
     * @ordered
     */
    public static final int LONG_VALUE = 6;

    /**
     * The '<em><b>FLOAT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLOAT
     * @model
     * @generated
     * @ordered
     */
    public static final int FLOAT_VALUE = 7;

    /**
     * The '<em><b>DOUBLE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DOUBLE
     * @model
     * @generated
     * @ordered
     */
    public static final int DOUBLE_VALUE = 8;

    /**
     * An array of all the '<em><b>Primitive</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Primitive[] VALUES_ARRAY = new Primitive[] {
            BOOLEAN,
            CHAR,
            BYTE,
            SHORT,
            INT,
            LONG,
            FLOAT,
            DOUBLE,
    };

    /**
     * A public read-only list of all the '<em><b>Primitive</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< Primitive > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Primitive</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Primitive get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            Primitive result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Primitive</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Primitive getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            Primitive result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Primitive</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Primitive get( int value ) {
        switch( value ) {
        case BOOLEAN_VALUE:
            return BOOLEAN;
        case CHAR_VALUE:
            return CHAR;
        case BYTE_VALUE:
            return BYTE;
        case SHORT_VALUE:
            return SHORT;
        case INT_VALUE:
            return INT;
        case LONG_VALUE:
            return LONG;
        case FLOAT_VALUE:
            return FLOAT;
        case DOUBLE_VALUE:
            return DOUBLE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private Primitive( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //Primitive
