public class App {
    public static int[] bubbleSoft(int[] arr) {
        boolean notSorted = true;
        int temp, swaps;
        while(notSorted) {
            swaps = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                notSorted = false;
            }
        }
        // {3, 2, 6, 7, 4}
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 7, 4, 3, 1, 9, 4, 9, 2, 5};
        printArray(bubbleSoft(arr));

    }
}
