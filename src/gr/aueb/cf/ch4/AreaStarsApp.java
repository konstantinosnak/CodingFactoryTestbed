package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει έναν αριθμό n
 * και το AreaStarsApp εμφανίζει nxn
 * αστεράκια (*)
 *
 * @author: kostis
 */

public class AreaStarsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώστε τον αριθμό n που θα θέλατε:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
