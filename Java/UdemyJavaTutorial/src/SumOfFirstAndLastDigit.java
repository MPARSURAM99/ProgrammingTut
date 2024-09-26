public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(addFirstAndLastDigit(518));
    }
    public static int addFirstAndLastDigit(int n){
        int lastDigit = n % 10;

        if (n >= 0){
            while (n > 9){
                n = n / 10;
            }
            return n + lastDigit;
        } else {
            return -1;
        }
    }
}
