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
                 BigInteger a0 = a;
                 BigInteger b0 = b;
                 BigInteger t0 = new BigInteger("0");
                 BigInteger t = new BigInteger("1");
                 BigInteger s0 = new BigInteger("1");
                 BigInteger s = new BigInteger("0");
                 BigInteger q = a0.divide(b0);
                 BigInteger r = a0.subtract(q.multiply(b0));
                 BigInteger temp = new BigInteger("0");

                 while (r.compareTo(new BigInteger("0")) == 1){
                     temp = t0.subtract(q.multiply(t));
                     t0 = t;
                     t = temp;
                     temp = s0.subtract(q.multiply(s));
                     s0 = s;
                     s = temp;
                     a0 = b0;
                     b0 = r;
                     q = a0.divide(b0);
                     r = a0.subtract(q.multiply(b0));
                 }
                 r = b0;
                 BigInteger[] arr = {r,s,t};
                 return arr ;
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
                if (pow.compareTo(new BigInteger("0")) == 0){
                    BigInteger temp = new BigInteger("1");
                    return temp;
                }
                if (pow.mod(new BigInteger("2")).compareTo(new BigInteger("0")) == 0){
                    BigInteger temp = recursiveModularExponentiation(base,pow.divide(new BigInteger("2")),modulus);
                    return temp.multiply(temp).mod(modulus);
                }else{
                    BigInteger temp = recursiveModularExponentiation(base,pow.divide(new BigInteger("2")),modulus);
                    return base.multiply(temp.multiply(temp)).mod(modulus);
                }
	}
}
