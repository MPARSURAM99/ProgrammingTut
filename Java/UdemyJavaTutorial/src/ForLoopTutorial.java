public class ForLoopTutorial {
    public static void main(String[] args) {
        System.out.println("Total sum = " + addition(5));
    }
    public static int addition(int n){
        int constant = 0;
        for (int i = 0; i <= n; i++){
            constant += i;
        }
        return constant;
    }
}
