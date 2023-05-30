package gr.aueb.cf.ch6;
/**
 * Μέθοδος που επιστρέφει τη θέση στον πίνακα arr
 * του μέγιστου στοιχείου του πίνακα αρχίζοντας από
 * τη θέση low ώς τη θέση high, τις οποίες μπορεί να δώσει
 * ο χρήστης.
 *
 * @author kostis
 */
public class MaxPosition {
    public static int getMaxPosition (int[] arr, int low, int high) {
        int position = -1;
        int maxValue = Integer.MIN_VALUE;

        if ((arr == null) || (low < 0) || (high > arr.length)) return position;
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                position = i;
            }
        }
        return position;
    }
}
