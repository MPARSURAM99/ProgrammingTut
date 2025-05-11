import java.util.*;

public class FArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the array element:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + ",");
        }

        System.out.println("Left Rotation: 0");
        System.out.println("Right Rotation: 1");
        int direction = sc.nextInt();

        System.out.println("Enter the position of rotation:");
        int position = sc.nextInt();

        int temp[] = new int[size];
        int j = 0;

        switch (direction) {
            case 0:
                System.out.println("Left rotation for the array is:");
                position = position % size;
                for(int i = 0; i < size; i++){
                    temp[i] = arr[(i + position) % size];
                }
                System.out.println(Arrays.toString(temp));
                break;

            case 1:
                System.out.println("Right rotation for the array is:");
                position = position % size;
                for(int i = 0; i < size; i++){
                    temp[(i + position) % size] = arr[i];
                }
                System.out.println(Arrays.toString(temp));
                break;
        
            default:
                System.out.println("Please enter a valid number:");
                break;
        }
    }
}
