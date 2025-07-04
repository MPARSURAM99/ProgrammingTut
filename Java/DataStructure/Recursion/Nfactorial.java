import java.math.BigInteger;

public class Nfactorial {
    public static BigInteger calculateNFactorial(int n){
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calculateNFactorial(n - 1));
    }
    public static void main(String[] args) {
        System.out.println(calculateNFactorial(10));
    }
}
