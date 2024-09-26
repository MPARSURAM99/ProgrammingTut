public class FootBallWiner {
    public static void main(String[] args) {
        int numberOfPlayers;
        System.out.println("The winner is player No. " + footBallWiner(10, 80));
    }
    public static int footBallWiner(int numberOfPlayers, int numberOfRotation){
        int numberOfHalfRotation = numberOfRotation / (numberOfPlayers - 1);
        int numberOfRemainingRotation = numberOfRotation % (numberOfPlayers - 1);
        int winer = 0;

        if (numberOfHalfRotation % 2 == 0){
            winer = 1 + numberOfRemainingRotation;
        } else {
            winer = numberOfPlayers - numberOfRemainingRotation;
        }
        return winer;
    }
}
