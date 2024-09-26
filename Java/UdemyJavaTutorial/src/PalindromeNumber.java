import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number, to check is palindrome!!!");
        int n = sc.nextInt();

        if (n == palindromeNumber(n)){
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
    }

    public static int palindromeNumber(int num){
        int reversedNumber = 0;

        while (num != 0){
            int lastDigit = num % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNumber;
    }
}
