package gr.aueb.cf.ch6;
/**
 * Βρίσκει και επιστρέφει το 2ο μικρότερο στοιχείο
 * ενός πίνακα.
 * @author kostis
 */
public class SecondMinElementApp {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 1, 2, 4, 6, 10, 8, 9};

        arr = selectionSort(arr);

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.print(position(arr,2));
    }
    /**
     * Κάνει ταξινόμηση τον πίνακα από΄το μικρότερο προς το μεγαλύτερο.
     * @param arr
     * @return ταξινομημένο τον arr απο το μικρότερο στο μεγαλύτερο.
     */
    static public int[] selectionSort(int[] arr) {
        int minVal = 0;
        int minPosition = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            minVal = arr[i];
            minPosition = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            temp = arr[i];
            arr[i] = minVal;
            arr[minPosition] = temp;

        }
        return arr;
    }

    /**
     * Επιστρέφει το στοιχείο που βρίσκεται στη θέση που θα ζητήσει ο χρήστης, με αρίθμηση user friendly
     * δλδ. 1 είναι η πρώτη θέση του πίνακα και όχι η δεύτερη σύμφωνα με τη Java.
     * @param arr
     * @param position
     * @return το στοιχείο που βρίσκεται στη θέση που θα ζητήσει ο χρήστης.
     */
    static public int position (int [] arr, int position) {
        return arr[position - 1];
    }
}
