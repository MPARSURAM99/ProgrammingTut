import java.util.Arrays;
import java.util.Scanner;

public class DFindSecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", " + "\n");
        }

        Arrays.sort(arr);
        int largestNumber = arr[arr.length - 1];
        int secondLargestNumber;

        for(int i = arr.length -2; i >= 0; i--){
            if (arr[i] < largestNumber) {
                secondLargestNumber = arr[i];
                System.out.println("Second Largest number is " + secondLargestNumber);
                return;
            } else {
                System.out.println("There is no second largest number in the given array.");
            }
        }
    }
}
