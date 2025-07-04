public class Fibonancci {
    public static int NthTerm(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return NthTerm(n - 1) + NthTerm(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(NthTerm(5));
    }
}
