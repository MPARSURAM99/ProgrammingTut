import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = sc.nextLine();

        String newString = reversedString(word);
        System.out.println("Reversed word is " + newString);
    }

    public static String reversedString(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
