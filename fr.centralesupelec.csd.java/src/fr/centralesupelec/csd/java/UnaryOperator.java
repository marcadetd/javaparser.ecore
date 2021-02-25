/**
 */
package fr.centralesupelec.csd.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage#getUnaryOperator()
 * @model
 * @generated
 */
public enum UnaryOperator implements Enumerator {
	/**
     * The '<em><b>PLUS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PLUS_VALUE
     * @generated
     * @ordered
     */
	PLUS(1, "PLUS", "PLUS"),

	/**
     * The '<em><b>MINUS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MINUS_VALUE
     * @generated
     * @ordered
     */
	MINUS(2, "MINUS", "MINUS"),

	/**
     * The '<em><b>PREFIX INCREMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREFIX_INCREMENT_VALUE
     * @generated
     * @ordered
     */
	PREFIX_INCREMENT(3, "PREFIX_INCREMENT", "PREFIX_INCREMENT"),

	/**
     * The '<em><b>PREFIX DECREMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREFIX_DECREMENT_VALUE
     * @generated
     * @ordered
     */
	PREFIX_DECREMENT(4, "PREFIX_DECREMENT", "PREFIX_DECREMENT"),

	/**
     * The '<em><b>LOGICAL COMPLEMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LOGICAL_COMPLEMENT_VALUE
     * @generated
     * @ordered
     */
	LOGICAL_COMPLEMENT(5, "LOGICAL_COMPLEMENT", "LOGICAL_COMPLEMENT"),

	/**
     * The '<em><b>BITWISE COMPLEMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BITWISE_COMPLEMENT_VALUE
     * @generated
     * @ordered
     */
	BITWISE_COMPLEMENT(6, "BITWISE_COMPLEMENT", "BITWISE_COMPLEMENT"),

	/**
     * The '<em><b>POSTFIX INCREMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #POSTFIX_INCREMENT_VALUE
     * @generated
     * @ordered
     */
	POSTFIX_INCREMENT(7, "POSTFIX_INCREMENT", "POSTFIX_INCREMENT"),

	/**
     * The '<em><b>POSTFIX DECREMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #POSTFIX_DECREMENT_VALUE
     * @generated
     * @ordered
     */
	POSTFIX_DECREMENT(8, "POSTFIX_DECREMENT", "POSTFIX_DECREMENT");

	/**
     * The '<em><b>PLUS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PLUS
     * @model
     * @generated
     * @ordered
     */
	public static final int PLUS_VALUE = 1;

	/**
     * The '<em><b>MINUS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MINUS
     * @model
     * @generated
     * @ordered
     */
	public static final int MINUS_VALUE = 2;

	/**
     * The '<em><b>PREFIX INCREMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREFIX_INCREMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int PREFIX_INCREMENT_VALUE = 3;

	/**
     * The '<em><b>PREFIX DECREMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREFIX_DECREMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int PREFIX_DECREMENT_VALUE = 4;

	/**
     * The '<em><b>LOGICAL COMPLEMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LOGICAL_COMPLEMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int LOGICAL_COMPLEMENT_VALUE = 5;

	/**
     * The '<em><b>BITWISE COMPLEMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BITWISE_COMPLEMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int BITWISE_COMPLEMENT_VALUE = 6;

	/**
     * The '<em><b>POSTFIX INCREMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #POSTFIX_INCREMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int POSTFIX_INCREMENT_VALUE = 7;

	/**
     * The '<em><b>POSTFIX DECREMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #POSTFIX_DECREMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int POSTFIX_DECREMENT_VALUE = 8;

	/**
     * An array of all the '<em><b>Unary Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final UnaryOperator[] VALUES_ARRAY =
		new UnaryOperator[] {
            PLUS,
            MINUS,
            PREFIX_INCREMENT,
            PREFIX_DECREMENT,
            LOGICAL_COMPLEMENT,
            BITWISE_COMPLEMENT,
            POSTFIX_INCREMENT,
            POSTFIX_DECREMENT,
        };

	/**
     * A public read-only list of all the '<em><b>Unary Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<UnaryOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Unary Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static UnaryOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UnaryOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Unary Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static UnaryOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            UnaryOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Unary Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static UnaryOperator get(int value) {
        switch (value) {
            case PLUS_VALUE: return PLUS;
            case MINUS_VALUE: return MINUS;
            case PREFIX_INCREMENT_VALUE: return PREFIX_INCREMENT;
            case PREFIX_DECREMENT_VALUE: return PREFIX_DECREMENT;
            case LOGICAL_COMPLEMENT_VALUE: return LOGICAL_COMPLEMENT;
            case BITWISE_COMPLEMENT_VALUE: return BITWISE_COMPLEMENT;
            case POSTFIX_INCREMENT_VALUE: return POSTFIX_INCREMENT;
            case POSTFIX_DECREMENT_VALUE: return POSTFIX_DECREMENT;
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
	private UnaryOperator(int value, String name, String literal) {
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
	
} //UnaryOperator
