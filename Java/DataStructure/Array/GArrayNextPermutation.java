import java.util.Scanner;

public class GArrayNextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        System.out.println("Enter array elements :");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        // Find pivot element.
        int pivotIndex = 0;
        boolean findPivot = false;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivotIndex = i;
                findPivot = true;
                break;
            }
        }

        if (findPivot == false) {
            int start = 0;
            int end = arr.length - 1;
            int temp = 0;
            while (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        } else {
            // Find the next greater element from the pivot element and swap them.
            int nextGreaterIndex = 0;
            for (int i = arr.length - 1; i > pivotIndex; i--) {
                if (arr[i] > arr[pivotIndex]) {
                    nextGreaterIndex = i;
                    int temp = arr[pivotIndex];
                    arr[pivotIndex] = arr[nextGreaterIndex];
                    arr[nextGreaterIndex] = temp;
                    break;
                }
            }

            // Reverse from the pivot index to acchive the minimum number.
            int start = pivotIndex + 1;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        System.out.println("The next permutation of the array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

}
