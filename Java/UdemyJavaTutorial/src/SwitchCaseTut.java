public class SwitchCaseTut {
    public static void main(String[] args) {
        String st = printNumberInWord(1);
        System.out.println(st);
        }
    public static String printNumberInWord(int number){
        switch(number){
            case 0:
                return "ZERO";
            case  1:
                return "ONE";
            case 2:
                return "TWO";
            default:
                return "OTHER";
        }
    }
    }

