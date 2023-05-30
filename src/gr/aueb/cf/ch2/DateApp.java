package gr.aueb.cf.ch2;

/**
 * Μετατρέπει 3 ακέραιους αριθμούς που δίνει ο χρήστης
 * σε ημερομηνία με την μορφή DD/MM/YY
 *
 * @author kostis
 */
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //Εντολές
        System.out.println("Παρακαλώ δώστε 3 ακέραιους αριθμούς που αναπαριστούν ημέρα μήνα και έτος");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num3 = num3%100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Οι αριθμοί που δώσατε σε μορφή DD/MM/YY είναι %d/%d/%02d" , num1, num2, num3);
    }
}
