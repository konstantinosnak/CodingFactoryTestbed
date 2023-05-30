package gr.aueb.cf.ch2;

/**
 * Μετατρέπει την θερμοκρασία που θα δώσει ο χρήστης
 * από Fahrenheit σε Celsius.
 *
 * @author kostis
 */
import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση
        Scanner sc = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

        //Εντολές
        System.out.println("Παρακαλώ δώστε θερμοκρασία σε" + "\u00B0F");
        fahrenheit =sc.nextInt();
        celsius = (5 *(fahrenheit - 32)) / 9;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Η θερμοκρασία %d %s είναι %d %s", fahrenheit, "\u00B0F", celsius, "\u00B0C");

    }
}
