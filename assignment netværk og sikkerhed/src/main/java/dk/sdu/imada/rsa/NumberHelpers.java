package dk.sdu.imada.rsa;

import java.math.BigInteger;

public class NumberHelpers {

	private static final BigInteger TWO = new BigInteger("2");

	/**
	 * Extended euclidean algorithm
	 * @param a
	 * @param b
	 * @return [r,s,t] where r = gcd(a,b) and sa + tb = r
	 */
	public static BigInteger[] extendedEuclideanAlgorithm(BigInteger a, BigInteger b) {
		// TODO Implementation needed

		return null;
	}

	/**
	 * Method handling modular exponentiation efficiently
	 * @param base
	 * @param pow
	 * @param modulus
	 * @return BigDecimal with the value of base^pow mod modulus
	 */
	public static BigInteger recursiveModularExponentiation(BigInteger base, BigInteger pow, BigInteger modulus) {
		// TODO Implementation needed
		return null;
	}
}
