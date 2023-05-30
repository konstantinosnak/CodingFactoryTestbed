package gr.aueb.cf.ch4;
/**
 * Ο χρήστης δίνει έναν αριθμό n
 * και το HorizontalStarsApp εμφανίζει n οριζόντια αστεράκια (*)
 *
 * @author: kostis
 */

import java.util.Scanner;

public class HorizontalStarsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώστε τον αριθμό n που θα θέλατε: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
