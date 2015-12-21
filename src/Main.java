/**
 * Created by Adm on 12/21/2015.
 */
public class Main {
    public static void main(String[] args) {
        int array[] = {3, 4, 3, 2, 1, 4, 5, 7, 8};
        bubbleSorting(array);
        dispay(array);
    }

    public static void dispay(int[] array) {
        for (int a: array ) {
            System.out.println(a);
        }
    }

    public static void bubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}
