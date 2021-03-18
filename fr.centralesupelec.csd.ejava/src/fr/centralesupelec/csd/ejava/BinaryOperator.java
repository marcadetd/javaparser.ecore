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
 * A representation of the literals of the enumeration '<em><b>Binary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.ejava.EJavaPackage#getBinaryOperator()
 * @model
 * @generated
 */
public enum BinaryOperator implements Enumerator {
    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_VALUE
     * @generated
     * @ordered
     */
    OR( 1, "OR", "OR" ),

    /**
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND_VALUE
     * @generated
     * @ordered
     */
    AND( 2, "AND", "AND" ),

    /**
     * The '<em><b>BINARY OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_OR_VALUE
     * @generated
     * @ordered
     */
    BINARY_OR( 3, "BINARY_OR", "BINARY_OR" ),

    /**
     * The '<em><b>BINARY AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_AND_VALUE
     * @generated
     * @ordered
     */
    BINARY_AND( 4, "BINARY_AND", "BINARY_AND" ),

    /**
     * The '<em><b>XOR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XOR_VALUE
     * @generated
     * @ordered
     */
    XOR( 5, "XOR", "XOR" ),

    /**
     * The '<em><b>EQUALS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUALS_VALUE
     * @generated
     * @ordered
     */
    EQUALS( 6, "EQUALS", "EQUALS" ),

    /**
     * The '<em><b>NOT EQUALS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUALS_VALUE
     * @generated
     * @ordered
     */
    NOT_EQUALS( 7, "NOT_EQUALS", "NOT_EQUALS" ),

    /**
     * The '<em><b>LESS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_VALUE
     * @generated
     * @ordered
     */
    LESS( 8, "LESS", "LESS" ),

    /**
     * The '<em><b>GREATER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_VALUE
     * @generated
     * @ordered
     */
    GREATER( 9, "GREATER", "GREATER" ),

    /**
     * The '<em><b>LESS EQUALS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_EQUALS_VALUE
     * @generated
     * @ordered
     */
    LESS_EQUALS( 10, "LESS_EQUALS", "LESS_EQUALS" ),

    /**
     * The '<em><b>GREATER EQUALS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_EQUALS_VALUE
     * @generated
     * @ordered
     */
    GREATER_EQUALS( 11, "GREATER_EQUALS", "GREATER_EQUALS" ),

    /**
     * The '<em><b>LEFT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEFT_SHIFT_VALUE
     * @generated
     * @ordered
     */
    LEFT_SHIFT( 12, "LEFT_SHIFT", "LEFT_SHIFT" ),

    /**
     * The '<em><b>SIGNED RIGHT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIGNED_RIGHT_SHIFT_VALUE
     * @generated
     * @ordered
     */
    SIGNED_RIGHT_SHIFT( 13, "SIGNED_RIGHT_SHIFT", "SIGNED_RIGHT_SHIFT" ),

    /**
     * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_RIGHT_SHIFT_VALUE
     * @generated
     * @ordered
     */
    UNSIGNED_RIGHT_SHIFT( 14, "UNSIGNED_RIGHT_SHIFT", "UNSIGNED_RIGHT_SHIFT" ),

    /**
     * The '<em><b>PLUS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLUS_VALUE
     * @generated
     * @ordered
     */
    PLUS( 15, "PLUS", "PLUS" ),

    /**
     * The '<em><b>MINUS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUS_VALUE
     * @generated
     * @ordered
     */
    MINUS( 16, "MINUS", "MINUS" ),

    /**
     * The '<em><b>MULTIPLY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MULTIPLY_VALUE
     * @generated
     * @ordered
     */
    MULTIPLY( 17, "MULTIPLY", "MULTIPLY" ),

    /**
     * The '<em><b>DIVIDE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIVIDE_VALUE
     * @generated
     * @ordered
     */
    DIVIDE( 18, "DIVIDE", "DIVIDE" ),

    /**
     * The '<em><b>REMAINDER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMAINDER_VALUE
     * @generated
     * @ordered
     */
    REMAINDER( 19, "REMAINDER", "REMAINDER" );

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR
     * @model
     * @generated
     * @ordered
     */
    public static final int OR_VALUE = 1;

    /**
     * The '<em><b>AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND
     * @model
     * @generated
     * @ordered
     */
    public static final int AND_VALUE = 2;

    /**
     * The '<em><b>BINARY OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_OR
     * @model
     * @generated
     * @ordered
     */
    public static final int BINARY_OR_VALUE = 3;

    /**
     * The '<em><b>BINARY AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BINARY_AND
     * @model
     * @generated
     * @ordered
     */
    public static final int BINARY_AND_VALUE = 4;

    /**
     * The '<em><b>XOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XOR
     * @model
     * @generated
     * @ordered
     */
    public static final int XOR_VALUE = 5;

    /**
     * The '<em><b>EQUALS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUALS
     * @model
     * @generated
     * @ordered
     */
    public static final int EQUALS_VALUE = 6;

    /**
     * The '<em><b>NOT EQUALS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUALS
     * @model
     * @generated
     * @ordered
     */
    public static final int NOT_EQUALS_VALUE = 7;

    /**
     * The '<em><b>LESS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS
     * @model
     * @generated
     * @ordered
     */
    public static final int LESS_VALUE = 8;

    /**
     * The '<em><b>GREATER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER
     * @model
     * @generated
     * @ordered
     */
    public static final int GREATER_VALUE = 9;

    /**
     * The '<em><b>LESS EQUALS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_EQUALS
     * @model
     * @generated
     * @ordered
     */
    public static final int LESS_EQUALS_VALUE = 10;

    /**
     * The '<em><b>GREATER EQUALS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_EQUALS
     * @model
     * @generated
     * @ordered
     */
    public static final int GREATER_EQUALS_VALUE = 11;

    /**
     * The '<em><b>LEFT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEFT_SHIFT
     * @model
     * @generated
     * @ordered
     */
    public static final int LEFT_SHIFT_VALUE = 12;

    /**
     * The '<em><b>SIGNED RIGHT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIGNED_RIGHT_SHIFT
     * @model
     * @generated
     * @ordered
     */
    public static final int SIGNED_RIGHT_SHIFT_VALUE = 13;

    /**
     * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSIGNED_RIGHT_SHIFT
     * @model
     * @generated
     * @ordered
     */
    public static final int UNSIGNED_RIGHT_SHIFT_VALUE = 14;

    /**
     * The '<em><b>PLUS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLUS
     * @model
     * @generated
     * @ordered
     */
    public static final int PLUS_VALUE = 15;

    /**
     * The '<em><b>MINUS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUS
     * @model
     * @generated
     * @ordered
     */
    public static final int MINUS_VALUE = 16;

    /**
     * The '<em><b>MULTIPLY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MULTIPLY
     * @model
     * @generated
     * @ordered
     */
    public static final int MULTIPLY_VALUE = 17;

    /**
     * The '<em><b>DIVIDE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIVIDE
     * @model
     * @generated
     * @ordered
     */
    public static final int DIVIDE_VALUE = 18;

    /**
     * The '<em><b>REMAINDER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REMAINDER
     * @model
     * @generated
     * @ordered
     */
    public static final int REMAINDER_VALUE = 19;

    /**
     * An array of all the '<em><b>Binary Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BinaryOperator[] VALUES_ARRAY = new BinaryOperator[] {
            OR,
            AND,
            BINARY_OR,
            BINARY_AND,
            XOR,
            EQUALS,
            NOT_EQUALS,
            LESS,
            GREATER,
            LESS_EQUALS,
            GREATER_EQUALS,
            LEFT_SHIFT,
            SIGNED_RIGHT_SHIFT,
            UNSIGNED_RIGHT_SHIFT,
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE,
            REMAINDER,
    };

    /**
     * A public read-only list of all the '<em><b>Binary Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BinaryOperator > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Binary Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryOperator get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BinaryOperator result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Binary Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryOperator getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BinaryOperator result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Binary Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BinaryOperator get( int value ) {
        switch( value ) {
        case OR_VALUE:
            return OR;
        case AND_VALUE:
            return AND;
        case BINARY_OR_VALUE:
            return BINARY_OR;
        case BINARY_AND_VALUE:
            return BINARY_AND;
        case XOR_VALUE:
            return XOR;
        case EQUALS_VALUE:
            return EQUALS;
        case NOT_EQUALS_VALUE:
            return NOT_EQUALS;
        case LESS_VALUE:
            return LESS;
        case GREATER_VALUE:
            return GREATER;
        case LESS_EQUALS_VALUE:
            return LESS_EQUALS;
        case GREATER_EQUALS_VALUE:
            return GREATER_EQUALS;
        case LEFT_SHIFT_VALUE:
            return LEFT_SHIFT;
        case SIGNED_RIGHT_SHIFT_VALUE:
            return SIGNED_RIGHT_SHIFT;
        case UNSIGNED_RIGHT_SHIFT_VALUE:
            return UNSIGNED_RIGHT_SHIFT;
        case PLUS_VALUE:
            return PLUS;
        case MINUS_VALUE:
            return MINUS;
        case MULTIPLY_VALUE:
            return MULTIPLY;
        case DIVIDE_VALUE:
            return DIVIDE;
        case REMAINDER_VALUE:
            return REMAINDER;
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
    private BinaryOperator( int value, String name, String literal ) {
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

} //BinaryOperator
