import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // C:"\xyz\"abc.txt
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Arrays.sort(arr);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max =" + max + " & Min =" + min );

        System.out.println("Your array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        
    }
}
