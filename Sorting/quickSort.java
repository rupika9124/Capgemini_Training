package Sorting;

public class quickSort {

    public static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSorting(arr, low, pi - 1);
            quickSorting(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {1200, 500, 900, 300, 700};

        quickSorting(prices, 0, prices.length - 1);

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}

