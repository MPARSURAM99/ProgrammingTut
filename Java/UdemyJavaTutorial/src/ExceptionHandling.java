import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        do {
            System.out.println("Enter #" + counter + " number :");
            String nextNumber = sc.nextLine();

            try {
                double number = Double.parseDouble(nextNumber);
                counter ++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        } while (counter <= 5);
    }
}
