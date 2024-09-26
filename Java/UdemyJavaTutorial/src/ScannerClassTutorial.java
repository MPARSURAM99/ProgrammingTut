import java.util.Scanner;

public class ScannerClassTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Sum of two number = " + (firstNumber + secondNumber));
    }
}
