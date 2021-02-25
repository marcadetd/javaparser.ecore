/**
 */
package fr.centralesupelec.csd.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modifier Keyword</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.csd.java.JavaPackage#getModifierKeyword()
 * @model
 * @generated
 */
public enum ModifierKeyword implements Enumerator {
	/**
     * The '<em><b>PUBLIC</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PUBLIC_VALUE
     * @generated
     * @ordered
     */
	PUBLIC(1, "PUBLIC", "PUBLIC"),

	/**
     * The '<em><b>STATIC</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STATIC_VALUE
     * @generated
     * @ordered
     */
	STATIC(2, "STATIC", "STATIC"),

	/**
     * The '<em><b>PROTECTED</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PROTECTED_VALUE
     * @generated
     * @ordered
     */
	PROTECTED(3, "PROTECTED", "PROTECTED"),

	/**
     * The '<em><b>PRIVATE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PRIVATE_VALUE
     * @generated
     * @ordered
     */
	PRIVATE(4, "PRIVATE", "PRIVATE"),

	/**
     * The '<em><b>FINAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FINAL_VALUE
     * @generated
     * @ordered
     */
	FINAL(5, "FINAL", "FINAL"),

	/**
     * The '<em><b>ABSTRACT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ABSTRACT_VALUE
     * @generated
     * @ordered
     */
	ABSTRACT(6, "ABSTRACT", "ABSTRACT"),

	/**
     * The '<em><b>SYNCHRONIZED</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SYNCHRONIZED_VALUE
     * @generated
     * @ordered
     */
	SYNCHRONIZED(7, "SYNCHRONIZED", "SYNCHRONIZED"),

	/**
     * The '<em><b>NATIVE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NATIVE_VALUE
     * @generated
     * @ordered
     */
	NATIVE(8, "NATIVE", "NATIVE"),

	/**
     * The '<em><b>TRANSIENT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRANSIENT_VALUE
     * @generated
     * @ordered
     */
	TRANSIENT(9, "TRANSIENT", "TRANSIENT"),

	/**
     * The '<em><b>VOLATILE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #VOLATILE_VALUE
     * @generated
     * @ordered
     */
	VOLATILE(10, "VOLATILE", "VOLATILE"),

	/**
     * The '<em><b>STRICTFP</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STRICTFP_VALUE
     * @generated
     * @ordered
     */
	STRICTFP(11, "STRICTFP", "STRICTFP"),

	/**
     * The '<em><b>TRANSITIVE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRANSITIVE_VALUE
     * @generated
     * @ordered
     */
	TRANSITIVE(12, "TRANSITIVE", "TRANSITIVE"),

	/**
     * The '<em><b>DEFAULT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEFAULT_VALUE
     * @generated
     * @ordered
     */
	DEFAULT(13, "DEFAULT", "DEFAULT");

	/**
     * The '<em><b>PUBLIC</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PUBLIC
     * @model
     * @generated
     * @ordered
     */
	public static final int PUBLIC_VALUE = 1;

	/**
     * The '<em><b>STATIC</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STATIC
     * @model
     * @generated
     * @ordered
     */
	public static final int STATIC_VALUE = 2;

	/**
     * The '<em><b>PROTECTED</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PROTECTED
     * @model
     * @generated
     * @ordered
     */
	public static final int PROTECTED_VALUE = 3;

	/**
     * The '<em><b>PRIVATE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PRIVATE
     * @model
     * @generated
     * @ordered
     */
	public static final int PRIVATE_VALUE = 4;

	/**
     * The '<em><b>FINAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #FINAL
     * @model
     * @generated
     * @ordered
     */
	public static final int FINAL_VALUE = 5;

	/**
     * The '<em><b>ABSTRACT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ABSTRACT
     * @model
     * @generated
     * @ordered
     */
	public static final int ABSTRACT_VALUE = 6;

	/**
     * The '<em><b>SYNCHRONIZED</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SYNCHRONIZED
     * @model
     * @generated
     * @ordered
     */
	public static final int SYNCHRONIZED_VALUE = 7;

	/**
     * The '<em><b>NATIVE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NATIVE
     * @model
     * @generated
     * @ordered
     */
	public static final int NATIVE_VALUE = 8;

	/**
     * The '<em><b>TRANSIENT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRANSIENT
     * @model
     * @generated
     * @ordered
     */
	public static final int TRANSIENT_VALUE = 9;

	/**
     * The '<em><b>VOLATILE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #VOLATILE
     * @model
     * @generated
     * @ordered
     */
	public static final int VOLATILE_VALUE = 10;

	/**
     * The '<em><b>STRICTFP</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #STRICTFP
     * @model
     * @generated
     * @ordered
     */
	public static final int STRICTFP_VALUE = 11;

	/**
     * The '<em><b>TRANSITIVE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #TRANSITIVE
     * @model
     * @generated
     * @ordered
     */
	public static final int TRANSITIVE_VALUE = 12;

	/**
     * The '<em><b>DEFAULT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEFAULT
     * @model
     * @generated
     * @ordered
     */
	public static final int DEFAULT_VALUE = 13;

	/**
     * An array of all the '<em><b>Modifier Keyword</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ModifierKeyword[] VALUES_ARRAY =
		new ModifierKeyword[] {
            PUBLIC,
            STATIC,
            PROTECTED,
            PRIVATE,
            FINAL,
            ABSTRACT,
            SYNCHRONIZED,
            NATIVE,
            TRANSIENT,
            VOLATILE,
            STRICTFP,
            TRANSITIVE,
            DEFAULT,
        };

	/**
     * A public read-only list of all the '<em><b>Modifier Keyword</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ModifierKeyword> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Modifier Keyword</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifierKeyword get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModifierKeyword result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Modifier Keyword</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifierKeyword getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ModifierKeyword result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Modifier Keyword</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ModifierKeyword get(int value) {
        switch (value) {
            case PUBLIC_VALUE: return PUBLIC;
            case STATIC_VALUE: return STATIC;
            case PROTECTED_VALUE: return PROTECTED;
            case PRIVATE_VALUE: return PRIVATE;
            case FINAL_VALUE: return FINAL;
            case ABSTRACT_VALUE: return ABSTRACT;
            case SYNCHRONIZED_VALUE: return SYNCHRONIZED;
            case NATIVE_VALUE: return NATIVE;
            case TRANSIENT_VALUE: return TRANSIENT;
            case VOLATILE_VALUE: return VOLATILE;
            case STRICTFP_VALUE: return STRICTFP;
            case TRANSITIVE_VALUE: return TRANSITIVE;
            case DEFAULT_VALUE: return DEFAULT;
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
	private ModifierKeyword(int value, String name, String literal) {
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
	
} //ModifierKeyword
