package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και επιλογές
 * ανάλογα με το τι θα επιλέξει ο χρήστης
 *
 * @author kostis
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε μία απο τις επιλογές δίνοντας το αντίστοιχο νούμερο!");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
                case 5:
                    System.out.println("Επιλέξατε Έξοδο! Cya soon!");
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε μία έγκυρη επιλογή:");
            }
        } while (choice != 5);

    }
}
