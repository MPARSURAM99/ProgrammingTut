public class SumOfN {
    public static int sumOfN(int n){
        if(n == 0){
            return n;
        }
        return n + sumOfN(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfN(5));
    }
}
