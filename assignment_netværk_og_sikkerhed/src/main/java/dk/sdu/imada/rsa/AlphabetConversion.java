package dk.sdu.imada.rsa;

import java.math.BigInteger;


public class AlphabetConversion {

	/**
	 * Converts a char to a BigInteger according to the alphabet conversion in the assignment
	 * @param c
	 * @return
	 */
	 private  static BigInteger charToNumber(char c) {
	 		// TODO Implementation needed
	 		int num = (int) c;
	 		num = num - 96;
	 		if (num <= 0 || num >= 27) {
	 			return new BigInteger("0");
	 		}else{
				String finNum = Integer.toString(num);
				return new BigInteger(finNum);
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
 		 	num = 32;
 			return ((char) num);
                 }else if(num >= 1 && num <=26){
                     num = num + 96;
 			return ((char) num);
 		}else{
                     throw new IllegalArgumentException("fuuuuu");
 		}
 	}


	/**
	 * Converts a number to a string, according to the alphabet conversion rules of the assignment
	 * @param number
	 * @return
	 */
	 public static String numberToString(BigInteger number) {
 		// TODO Implementation needed
                 BigInteger finNum = new BigInteger("0");
                 BigInteger op = new BigInteger("27");
                 String done = "";

                 for(int i=4; i>=0;i--){
                     finNum = number.divide(op.pow(i));
                     if (finNum.compareTo(new BigInteger("0")) == 0){

                         done+=" ";
                     }else{
                         number = number.subtract(finNum.multiply(op.pow(i)));
                         char holder = (char)(finNum.intValueExact()+96);
                         done += holder;
                     }
                     System.out.println(done);
                 }

 		return done;
 	}

	/**
	 * Convert a string of length 5 to a BigInteger number
	 * @param string The string to convert
	 * @return The converted number
	 */
	 public static BigInteger stringToNumber(String string) {
	             // TODO Implementation needed
	             BigInteger finNum = new BigInteger("0");
	             BigInteger op = new BigInteger("27");
	             while(string.length() < 5){
	                 string = string + " ";
	             }
	             System.out.println(string);
	             char[] charArr = string.toCharArray();
	             for(int i=0; i<5; i++){
	                 finNum = finNum.add(charToNumber(charArr[i]).multiply(op.pow(4-i)));
	                 System.out.println(finNum);
	             }
	             return finNum;
	 	}



}
