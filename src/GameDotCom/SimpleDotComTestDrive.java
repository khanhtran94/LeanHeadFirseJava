package GameDotCom;

import java.util.Random;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
//        SimpleDotCom dot = new SimpleDotCom();
//        int[] locations = {2,3,4};
//        dot.setLocationCells(locations);
//
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//
//        String testResult = "failed";
//        if (result.equals("hit")){
//            testResult = "passed";
//        }
//        System.out.println(testResult);

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNumber = (int) (Math.random()*5);
        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive){
            String guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesss");
            }
        }
    }
}
