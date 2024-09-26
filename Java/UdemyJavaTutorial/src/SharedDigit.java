public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(13, 33));
    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if (firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99){
            return false;
        }
        int firstNumbersLastDigit = firstNumber % 10;
        int secondNumbersLastDigit = secondNumber % 10;
        int firstNumbersFirstDigit = firstNumber / 10;
        int secondNumbersFirstDigit = secondNumber / 10;

        if (firstNumbersLastDigit == secondNumbersLastDigit || firstNumbersLastDigit == secondNumbersFirstDigit || firstNumbersFirstDigit == secondNumbersFirstDigit || firstNumbersFirstDigit == secondNumbersLastDigit){
            return true;
        } else {
            return false;
        }
    }
}
