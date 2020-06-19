package com.twschool.practice;

public class GuessNumberGame {


    private GuessNumberAnswer guessNumberAnswer;
    private GameStatus gameStatus;
    int leftTryTime;

    public GuessNumberGame(GuessNumberAnswer guessNumberAnswer) {

        this.guessNumberAnswer = guessNumberAnswer;
    }

    public String guess(String userAnswerString) {
        String result= guessNumberAnswer.check(userAnswerString);
        leftTryTime=0;
        if("4A0B".equals(result)){
            gameStatus=GameStatus.SUCCESS;
        } else if(leftTryTime ==0){
            gameStatus=GameStatus.FAILED;
        }else{
            gameStatus=GameStatus.CONTINUE;
        }
          return result;
    }

    public GameStatus getStatus() {

        return gameStatus;
    }
}
