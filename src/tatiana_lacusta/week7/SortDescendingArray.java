package tatiana_lacusta.week7;

public class SortDescendingArray {

    public static void main(String[] args) {

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        descSort(array);

        for (int i : array) {
            System.out.print(i + " "); // started with array [0]
        }
    }

    public static void descSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
