public class NumberOfDayInMonths {
    public static void main(String[] args) {
        boolean leapYear = isLeapYear(2000);
        System.out.println(leapYear);
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDayInMonth(int month, int year){
        if ((month <= 1 && month <= 12) && (year <= 1 && year <= 9999)){
            if( month == 4 || month == 7 || month == 9 || month == 11){
                return 31;
            } else if (isLeapYear(year) && month == 2){
                return 29;
            } else {
                return 30;
            }
        } else {
            return -1;
        }
    }
}
