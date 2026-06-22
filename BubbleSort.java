public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}