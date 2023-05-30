package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει το έτος που του δίνει ο χρήστης
 * και απαντάει αν είναι δίσεκτο ή όχι
 *
 * @author kostis
 */

public class WrongLeapYearApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.println("Please insert the year you desire to find out if its leap year or not:");
        year = sc.nextInt();

        if (year % 4 != 0) {
            leapYear = false;
        } else if ((year % 100 != 0) || (year % 400 == 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.printf("%d is a leap year.", year);
        } else {
            System.out.printf("%d is not a leap year.", year);
        }
    }
}


