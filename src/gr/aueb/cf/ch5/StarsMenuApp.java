package gr.aueb.cf.ch5;

/**
 * Το StarsMenuApp εμφανίζει ένα μενού με 6 επιλογές στον χρήστη
 * αυτός επιλέγει ποια από αυτές θέλει για ποιόν αριθμό θέλει.
 *
 * @aythor: kostis
 */

import java.util.Scanner;

public class StarsMenuApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;


        do {
            printMenu();
            choice = userChoice(choice);
            if (isChoiceInvalid(choice)) {
                System.out.println("Please type a valid number for selection");
                continue;
            }
            if (isChoiceQuit(choice)) {
                System.out.println("Exiting... Please wait!");
                System.out.println("Thank you for using our App! Cya soon!");
                break;
            }
            onChoice(choice);

        } while (true);

    }

    /**
     * Prints the menu with the choices.
     */
    public static void printMenu() {
        System.out.println("Please select the number of the choice you would like:");
        System.out.println("1. Print n stars horizontal");
        System.out.println("2. Print n stars vertical");
        System.out.println("3. Print n rows with n stars");
        System.out.println("4. Print n rows with 1-n stars");
        System.out.println("5. Print n rows with n-1 stars");
        System.out.println("6. Exit");
    }

    /**
     * @return the choice of the user.
     */
    public static int userChoice(int choice) {
        return sc.nextInt();
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static int nNumber() {
        return sc.nextInt();
    }

    public static void horizontalStars(int n) {
        if (n != 0) {
            System.out.print("*");
            horizontalStars(n-1);
        }
    }

    public static void verticalStars(int n) {
        if (n != 0) {
            System.out.println("*");
            verticalStars(n-1);
        }
    }

    public static void areaStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(n);
            System.out.println();
        }

    }

    public static void descStars(int n) {
        for (int i = n; i > 0; i--) {
            horizontalStars(i);
            System.out.println();
        }
    }

//        public static void descStars(int n) {
//            if (n != 0) {
//                horizontalStars(n);
//                System.out.println();
//                descStars(n - 1);
//            }
//        }

        public static void ascStars(int n) {
            for (int i = 1; i <= n; i++) {
                horizontalStars(i);
                System.out.println();
            }
        }

        public static void onChoice(int choice) {
            int n = 0;
            switch (choice) {
                case 1:
                    System.out.println("You selected \"Print n stars horizontal\"");
                    System.out.println("Please insert number n you would like:");
                    n = nNumber();
                    horizontalStars(n);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You selected \"Print n stars vertical\"");
                    System.out.println("Please insert number n you would like:");
                    n = nNumber();
                    verticalStars(n);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("You selected \"Print n rows with n stars\"");
                    System.out.println("Please insert number n you would like:");
                    n = nNumber();
                    areaStars(n);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("You selected \"Print n rows with 1-n stars\"");
                    System.out.println("Please insert number n you would like:");
                    n = nNumber();
                    ascStars(n);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("You selected \"Print n rows with n-1 stars\"");
                    System.out.println("Please insert number n you would like:");
                    n = nNumber();
                    descStars(n);
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
}
