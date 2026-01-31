package Sorting;

public class selectionSort {

    public static void selectionSorting(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {78, 45, 90, 65, 82};

        selectionSorting(scores);

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

