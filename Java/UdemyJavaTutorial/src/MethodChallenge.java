public class MethodChallenge {
    public static void main(String[] args) {
    displayHighScorePosition("Parsu", calculateHighScorePosition(1500));

    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " Managed to get into position " + playersPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playersScore) {
        int position = 0;
        if (playersScore >= 1000){
            position = 1;
        } else if (playersScore >= 500 && playersScore < 1000) {
            position = 2;
        } else if (playersScore >= 100 && playersScore < 500) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
