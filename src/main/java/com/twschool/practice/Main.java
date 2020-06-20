package com.twschool.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final int RUN_TIMES = 6;
    public static void main(String[] args) throws Exception {
        GuessNumberGenerator generateNumber = new GuessNumberGenerator();
        String gameAnswer = generateNumber.generateNumber(4);
        GuessNumberAnswer guessNumberAnswer =new GuessNumberAnswer(gameAnswer);
        GuessNumberGame guessNumberGame=new GuessNumberGame(guessNumberAnswer);
        System.out.println("------Please input your answer as x x x x , x <10 ------");

        for (int i = 0; i < RUN_TIMES; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String userAnswer=bufferedReader.readLine();
            if(isValid(userAnswer)){
                String resultString=guessNumberGame.guess(userAnswer);
                GameStatus gameStatus=guessNumberGame.getStatus();
                if(gameStatus.equals(GameStatus.SUCCESS)){
                    System.out.println("------Answer is correct,you win!------");
                    break;
                } else if(gameStatus.equals(GameStatus.CONTINUE)){
                    System.out.println("---Answer is wrong ,input again------"+resultString);
                }
            }else{
                System.out.println("------Wrong Input，Input again------");
            }
        }
        System.out.println("------Game is over!-----");
    }

    public static boolean isValid(String input){
        String[] inputNumbers = input.split(" ");
        if (inputNumbers.length!=4){
            return false;
        }else{
            for(int i = 0;i<inputNumbers.length;i++){
                if(inputNumbers[i].charAt(0)<48||inputNumbers[i].charAt(0)>57){
                    return false;
                }
                for(int j = i+1; j<inputNumbers.length;j++){
                    if (inputNumbers[i].equals(inputNumbers[j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
