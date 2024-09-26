import java.util.Scanner;

public class GenerateUserId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your birthdate day (dd): ");
        String day = scanner.nextLine();


        System.out.print("Enter your birthdate month (mm): ");
        String month = scanner.nextLine();


        System.out.print("Enter your birthdate year (yyyy): ");
        String year = scanner.nextLine();

        String birthDay = day.length() == 1 ? ("0"+day) : day;
        String birthMonth = month.length() == 1 ? ("0"+month) : month;


        String birthdate = birthDay + birthMonth;


        String userId = generateUserId(name, birthdate);

        System.out.println("you registration is successful");
        System.out.println("Name : " + name);
        System.out.println("DOB : " + birthDay + " " + birthMonth + " " + year + " ");
        System.out.println("your  user id: " + userId);
    }


    private static String generateUserId(String name, String birthdate) {

        String namePart = name.length() >= 4 ? name.substring(0, 4) : name;

        String birthdatePart = birthdate;

        return namePart + birthdatePart;
    }


}
