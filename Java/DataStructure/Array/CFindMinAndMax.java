import java.util.Scanner;

public class CFindMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
           if (arr[i] > max) {
            max = arr[i];
           }
           if (arr[i] < min) {
            min = arr[i];
           }
        }

        System.out.println("Max is: " + max + " & Min is: " + min);
    }
}
