public class SelectionSort {
    // public static int[] sortedArray(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++) {
    //         int smallestIndex = i;
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j] < arr[smallestIndex]) {
    //                 smallestIndex = j;
    //             }
    //         }
    //         int smallestElement = arr[smallestIndex];
    //         for (int k = smallestIndex; k > i; k--) {
    //             arr[k] = arr[k - 1];
    //         }
    //         arr[i] = smallestElement;
    //     }
    //     return arr;
    // }

    // The time complexity of the above method can be optimized by optimizing the innner loop 2;

    public static int[] sortedArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = { 30, 25, 20, 10, 15, 5, 0 };
        int res[] = sortedArray(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }
}




