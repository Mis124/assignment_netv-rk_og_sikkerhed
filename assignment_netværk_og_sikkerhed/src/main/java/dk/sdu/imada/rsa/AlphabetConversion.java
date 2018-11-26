package dk.sdu.imada.rsa;

import java.math.BigInteger;


public class AlphabetConversion {

	/**
	 * Converts a char to a BigInteger according to the alphabet conversion in the assignment
	 * @param c
	 * @return
	 */
	private static BigInteger charToNumber(char c) {
		// TODO Implementation needed
		int num = (int) c;
		num = num - 96;
		if (num <= 0 || num >= 27) {
			return new BigInteger("0");
		}else{
			String fin = " ";
			fin = fin + num;
			return new BigInteger(fin);
		}
	}


	/**
	 * Converts a number in the interval [0:26] to the corresponding char
	 * @param number The number to convert
	 * @return The converted char
	 */
	private static char numberToChar(BigInteger number) {
		// TODO Implementation needed
		int num = number.intValue();
		if (num == 0){
		 	num = num + 32;
			return ((char) num);
		}else{
			num = num + 96;
			return ((char) num);
		}
	}


	/**
	 * Converts a number to a string, according to the alphabet conversion rules of the assignment
	 * @param number
	 * @return
	 */
	public static String numberToString(BigInteger number) {
		// TODO Implementation needed
		return null;
	}


	/**
	 * Convert a string of length 5 to a BigInteger number
	 * @param string The string to convert
	 * @return The converted number
	 */
	public static BigInteger stringToNumber(String string) {
		// TODO Implementation needed
		return null;
	}



}
