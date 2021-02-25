/**
 */
package fr.centralesupelec.csd.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assign Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage#getAssignOperator()
 * @model
 * @generated
 */
public enum AssignOperator implements Enumerator {
	/**
     * The '<em><b>ASSIGN</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ASSIGN_VALUE
     * @generated
     * @ordered
     */
	ASSIGN(1, "ASSIGN", "ASSIGN"),

	/**
     * The '<em><b>PLUS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PLUS_VALUE
     * @generated
     * @ordered
     */
	PLUS(2, "PLUS", "PLUS"),

	/**
     * The '<em><b>MINUS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MINUS_VALUE
     * @generated
     * @ordered
     */
	MINUS(3, "MINUS", "MINUS"),

	/**
     * The '<em><b>MULTIPLY</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MULTIPLY_VALUE
     * @generated
     * @ordered
     */
	MULTIPLY(4, "MULTIPLY", "MULTIPLY"),

	/**
     * The '<em><b>DIVIDE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DIVIDE_VALUE
     * @generated
     * @ordered
     */
	DIVIDE(5, "DIVIDE", "DIVIDE"),

	/**
     * The '<em><b>BINARY AND</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BINARY_AND_VALUE
     * @generated
     * @ordered
     */
	BINARY_AND(6, "BINARY_AND", "BINARY_AND"),

	/**
     * The '<em><b>BINARY OR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BINARY_OR_VALUE
     * @generated
     * @ordered
     */
	BINARY_OR(7, "BINARY_OR", "BINARY_OR"),

	/**
     * The '<em><b>XOR</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #XOR_VALUE
     * @generated
     * @ordered
     */
	XOR(8, "XOR", "XOR"),

	/**
     * The '<em><b>REMAINDER</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #REMAINDER_VALUE
     * @generated
     * @ordered
     */
	REMAINDER(9, "REMAINDER", "REMAINDER"),

	/**
     * The '<em><b>LEFT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LEFT_SHIFT_VALUE
     * @generated
     * @ordered
     */
	LEFT_SHIFT(10, "LEFT_SHIFT", "LEFT_SHIFT"),

	/**
     * The '<em><b>SIGNED RIGHT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SIGNED_RIGHT_SHIFT_VALUE
     * @generated
     * @ordered
     */
	SIGNED_RIGHT_SHIFT(11, "SIGNED_RIGHT_SHIFT", "SIGNED_RIGHT_SHIFT"),

	/**
     * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UNSIGNED_RIGHT_SHIFT_VALUE
     * @generated
     * @ordered
     */
	UNSIGNED_RIGHT_SHIFT(12, "UNSIGNED_RIGHT_SHIFT", "UNSIGNED_RIGHT_SHIFT");

	/**
     * The '<em><b>ASSIGN</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ASSIGN
     * @model
     * @generated
     * @ordered
     */
	public static final int ASSIGN_VALUE = 1;

	/**
     * The '<em><b>PLUS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PLUS
     * @model
     * @generated
     * @ordered
     */
	public static final int PLUS_VALUE = 2;

	/**
     * The '<em><b>MINUS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MINUS
     * @model
     * @generated
     * @ordered
     */
	public static final int MINUS_VALUE = 3;

	/**
     * The '<em><b>MULTIPLY</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #MULTIPLY
     * @model
     * @generated
     * @ordered
     */
	public static final int MULTIPLY_VALUE = 4;

	/**
     * The '<em><b>DIVIDE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DIVIDE
     * @model
     * @generated
     * @ordered
     */
	public static final int DIVIDE_VALUE = 5;

	/**
     * The '<em><b>BINARY AND</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BINARY_AND
     * @model
     * @generated
     * @ordered
     */
	public static final int BINARY_AND_VALUE = 6;

	/**
     * The '<em><b>BINARY OR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BINARY_OR
     * @model
     * @generated
     * @ordered
     */
	public static final int BINARY_OR_VALUE = 7;

	/**
     * The '<em><b>XOR</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #XOR
     * @model
     * @generated
     * @ordered
     */
	public static final int XOR_VALUE = 8;

	/**
     * The '<em><b>REMAINDER</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #REMAINDER
     * @model
     * @generated
     * @ordered
     */
	public static final int REMAINDER_VALUE = 9;

	/**
     * The '<em><b>LEFT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #LEFT_SHIFT
     * @model
     * @generated
     * @ordered
     */
	public static final int LEFT_SHIFT_VALUE = 10;

	/**
     * The '<em><b>SIGNED RIGHT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SIGNED_RIGHT_SHIFT
     * @model
     * @generated
     * @ordered
     */
	public static final int SIGNED_RIGHT_SHIFT_VALUE = 11;

	/**
     * The '<em><b>UNSIGNED RIGHT SHIFT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UNSIGNED_RIGHT_SHIFT
     * @model
     * @generated
     * @ordered
     */
	public static final int UNSIGNED_RIGHT_SHIFT_VALUE = 12;

	/**
     * An array of all the '<em><b>Assign Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final AssignOperator[] VALUES_ARRAY =
		new AssignOperator[] {
            ASSIGN,
            PLUS,
            MINUS,
            MULTIPLY,
            DIVIDE,
            BINARY_AND,
            BINARY_OR,
            XOR,
            REMAINDER,
            LEFT_SHIFT,
            SIGNED_RIGHT_SHIFT,
            UNSIGNED_RIGHT_SHIFT,
        };

	/**
     * A public read-only list of all the '<em><b>Assign Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<AssignOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static AssignOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AssignOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static AssignOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AssignOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Assign Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static AssignOperator get(int value) {
        switch (value) {
            case ASSIGN_VALUE: return ASSIGN;
            case PLUS_VALUE: return PLUS;
            case MINUS_VALUE: return MINUS;
            case MULTIPLY_VALUE: return MULTIPLY;
            case DIVIDE_VALUE: return DIVIDE;
            case BINARY_AND_VALUE: return BINARY_AND;
            case BINARY_OR_VALUE: return BINARY_OR;
            case XOR_VALUE: return XOR;
            case REMAINDER_VALUE: return REMAINDER;
            case LEFT_SHIFT_VALUE: return LEFT_SHIFT;
            case SIGNED_RIGHT_SHIFT_VALUE: return SIGNED_RIGHT_SHIFT;
            case UNSIGNED_RIGHT_SHIFT_VALUE: return UNSIGNED_RIGHT_SHIFT;
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
	private AssignOperator(int value, String name, String literal) {
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
	
} //AssignOperator
