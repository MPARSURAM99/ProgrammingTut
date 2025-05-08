import java.util.Scanner;

public class ESortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is:");
        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i] + ", ");
        }

        Boolean isSorted = false;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
