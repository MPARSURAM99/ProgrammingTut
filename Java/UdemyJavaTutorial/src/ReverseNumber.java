import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int reversedNumber = 0;
        int count = 0;

        while (n != 0){
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
            count++;
        }

        System.out.println("Reversed number is " + reversedNumber + " & the original number is divided with 10 by " + count + " times.");
    }

}
