public class LeapYear {
    public static void main(String[] args) {
        leapYear(2000);
    }
    public static void leapYear(int leapYear){
        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0){
            System.out.println(leapYear + " is a leap year");
        } else {
            System.out.println(leapYear + " is not a leap year");
        }
    }
}
