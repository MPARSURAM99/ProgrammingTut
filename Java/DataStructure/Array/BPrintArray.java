import java.util.Scanner;

public class BPrintArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        String arr[] = new String[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.next();
        }

        // Print array element.
        System.out.println("Students names are:");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }

        // Reverse array element.
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}