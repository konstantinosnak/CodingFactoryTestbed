package gr.aueb.cf.ch7;
/**
 * Converts every char of a String that the user
 * provides with the next char in ASCII and backwards.
 */

import java.util.Scanner;

public class CipherDecipherApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String ciphered;
        String deciphered;

        System.out.println("Please insert the sentence you would like to cipher!");
        s = sc.nextLine();

        ciphered = cipher(s);
        System.out.println("Ciphered string: " + ciphered);

        deciphered = decipher(ciphered);
        System.out.println("Deciphered string: " + deciphered);

    }

    /**
     *Converts every char of a String with the next char in ASCII
     *     * @param s a String
     * @return a new String with every char of the String s
     * being replaced with the next char
     */
    public static String  cipher (String s) {
        String sPlusOne = new String();

        for (int i = 0; i <s.length(); i++) {
            sPlusOne+=(char)(s.charAt(i)+1);
        }
        return sPlusOne;
    }

    /**
     * Converts every char of a String to the previous char in ASCII
     *
     * @param s a String
     * @return a String with every char of the String s
     * being replaced with the previous char
     */
    public static String decipher (String s) {
        String sMinusOne = new String();

        for (int i = 0; i <s.length(); i++) {
            sMinusOne += (char) (s.charAt(i) - 1);
        }
        return sMinusOne;
    }

}
