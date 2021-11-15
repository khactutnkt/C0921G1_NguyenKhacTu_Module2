package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String score = "";
        int tempScore = 0;
        boolean hoa = playerScore1 == playerScore2;
        boolean advantage = playerScore1 >= 4 || playerScore2 >= 4;
        if (hoa) {
            score = tiSoKhiHoa(playerScore1);
        } else if (advantage) {
            score = tiSoCuoiCung(playerScore1, playerScore2);
        } else {
            score = tiSoHienTai(playerScore1, playerScore2);
        }
        return score;
    }

    public static String tiSoKhiHoa(int playerScore1) {
        String score;
        switch (playerScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String tiSoCuoiCung(int playerScore1, int playerScore2) {
        String score;
        int minusResult = playerScore1 - playerScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String tiSoHienTai(int playerScore1, int playerScore2) {
        int tempScore;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                score += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}