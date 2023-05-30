package gr.aueb.cf.ch8;
/**
 * Εκτυπώνει ένα μενού με 4 επιλογές
 * και 5η την Έξοδο. Στη συνέχεια ζητάει από τον χρήστη
 * να επιλέξει μια επιλογή και εκτυπώνει την επιλογή που επέλεξε
 * μέχρι να επιλέξει την επιλογή 5 (Έξοδος).
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuApp {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            printMenu();

            try {
                choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException ex) {
//                ex.printStackTrace();
                System.err.println("Please select a number between 1-5!");
            }

        } while (choice != 5);
    }

    /**
     * Εκτυπώνει το μενού!
     */
    static public void printMenu() {
        System.out.println("Please select one of the following options: ");
        System.out.println("1. Insert a new phone number");
        System.out.println("2. Update an existing phone number");
        System.out.println("3. Delete a phone number");
        System.out.println("4. Call a phone number");
        System.out.println("5. Quit");
    }


    /**
     * Δέχεται την επιλογή από τον χρήστη και την επιστρέφει.
     * @return sc.nextInt();
     */

    public static int getChoice() {
        while (!sc.hasNextInt()) {
            System.out.println("Please insert an integer!");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Εκτυπώνει την επιλογή που επέλεξε ο χρήστης.
     * @param choice
     */
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException();

        } else {
            if (choice == 1) {
                System.out.println("You selected option 1, Insert a new number");
            } else if (choice == 2) {
                System.out.println("You selected option 2, Update an existing number");
            } else if (choice == 3) {
                System.out.println("You selected option 3. Delete a number");
            } else if (choice == 4) {
                System.out.println("You selected option 4, Call a number");
            } else {
                System.out.println("You selected option 5 quit! cya!");
            }
        }
    }
}
