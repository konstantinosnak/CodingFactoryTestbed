package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapAppVolTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        boolean leapYear = false;

        System.out.println("Please insert the year you desire to find out if its leap year or not:");
        year = sc.nextInt();

        leapYear = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));

        System.out.printf("%d is leap year: %s", year, leapYear);

    }
}
