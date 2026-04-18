public class BubbleSort {

    // public static int[] shortedArray(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }

    // Bubble sort can be improved;
    public static int[] shortedArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swaped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = { 3, 10, 8, 7, 4, 0 };
        int res[] = shortedArray(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}