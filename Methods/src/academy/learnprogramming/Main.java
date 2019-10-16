package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        String player1Name = "Bob";
        int player1Score = 1500;
        int player1Position = (calculateHighScorePosition(player1Score));
        String player2Name = "Jake";
        int player2Score = 900;
        int player2Position = calculateHighScorePosition(player2Score);
        String player3Name = "Jane";
        int player3Score = 400;
        int player3Position = calculateHighScorePosition(player3Score);
        String player4Name = "Dori";
        int player4Score = 50;
        int player4Position = calculateHighScorePosition(player4Score);


        displayHighScorePosition("Bob", 1500);
        displayHighScorePosition("Jake", 900);
        displayHighScorePosition("Jane", 400);
        displayHighScorePosition("Dori", 50);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition (String name, int score) {
        System.out.println (name " managed to get into position " + calculateHighScorePosition(score) + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;

        if( playerScore >=  1000 ) {
            position = 1;
        } else if( playerScore >= 500 ) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;

        }
    }










