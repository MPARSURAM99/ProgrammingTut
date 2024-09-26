public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-2284));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if (number >= 0) {
            while (number > 0){
                int lastDigit = number % 10;
                number = number / 10;
                if (lastDigit % 2 == 0){
                    sum += lastDigit;
                } else {
                    sum = sum;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
