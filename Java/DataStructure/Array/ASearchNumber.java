import java.util.*;
public class ASearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arraySize = sc.nextInt();
        
        int array[] = new int[arraySize];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arraySize; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("Enter the number to be searched in the array");
        int number = sc.nextInt();

        for (int i = 0; i < array.length; i ++) {
            if (array[i] == number) {
                System.out.println("The number found at index :" + i);
            }
        }

    }
}
