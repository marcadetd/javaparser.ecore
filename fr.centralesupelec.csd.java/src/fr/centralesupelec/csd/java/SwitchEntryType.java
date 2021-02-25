/**
 */
package fr.centralesupelec.csd.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Switch Entry Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage#getSwitchEntryType()
 * @model
 * @generated
 */
public enum SwitchEntryType implements Enumerator {
	/**
     * The '<em><b>STATEMENT GROUP</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STATEMENT_GROUP_VALUE
     * @generated
     * @ordered
     */
	STATEMENT_GROUP(1, "STATEMENT_GROUP", "STATEMENT_GROUP"),

	/**
     * The '<em><b>EXPRESSION</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #EXPRESSION_VALUE
     * @generated
     * @ordered
     */
	EXPRESSION(2, "EXPRESSION", "EXPRESSION"),

	/**
     * The '<em><b>BLOCK</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BLOCK_VALUE
     * @generated
     * @ordered
     */
	BLOCK(3, "BLOCK", "BLOCK"),

	/**
     * The '<em><b>THROWS STATEMENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #THROWS_STATEMENT_VALUE
     * @generated
     * @ordered
     */
	THROWS_STATEMENT(4, "THROWS_STATEMENT", "THROWS_STATEMENT");

	/**
     * The '<em><b>STATEMENT GROUP</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STATEMENT_GROUP
     * @model
     * @generated
     * @ordered
     */
	public static final int STATEMENT_GROUP_VALUE = 1;

	/**
     * The '<em><b>EXPRESSION</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #EXPRESSION
     * @model
     * @generated
     * @ordered
     */
	public static final int EXPRESSION_VALUE = 2;

	/**
     * The '<em><b>BLOCK</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #BLOCK
     * @model
     * @generated
     * @ordered
     */
	public static final int BLOCK_VALUE = 3;

	/**
     * The '<em><b>THROWS STATEMENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #THROWS_STATEMENT
     * @model
     * @generated
     * @ordered
     */
	public static final int THROWS_STATEMENT_VALUE = 4;

	/**
     * An array of all the '<em><b>Switch Entry Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final SwitchEntryType[] VALUES_ARRAY =
		new SwitchEntryType[] {
            STATEMENT_GROUP,
            EXPRESSION,
            BLOCK,
            THROWS_STATEMENT,
        };

	/**
     * A public read-only list of all the '<em><b>Switch Entry Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<SwitchEntryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Switch Entry Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static SwitchEntryType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SwitchEntryType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Switch Entry Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static SwitchEntryType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SwitchEntryType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Switch Entry Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static SwitchEntryType get(int value) {
        switch (value) {
            case STATEMENT_GROUP_VALUE: return STATEMENT_GROUP;
            case EXPRESSION_VALUE: return EXPRESSION;
            case BLOCK_VALUE: return BLOCK;
            case THROWS_STATEMENT_VALUE: return THROWS_STATEMENT;
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
	private SwitchEntryType(int value, String name, String literal) {
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
	
} //SwitchEntryType
