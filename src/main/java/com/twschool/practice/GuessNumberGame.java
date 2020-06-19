package com.twschool.practice;

public class GuessNumberGame {

    public static final int MAX_TRY_TIMES=6;
    private GuessNumberAnswer guessNumberAnswer;
    private GameStatus gameStatus=GameStatus.CONTINUE;
    private int leftTryTime=MAX_TRY_TIMES;

    public GuessNumberGame(GuessNumberAnswer guessNumberAnswer) {

        this.guessNumberAnswer = guessNumberAnswer;
    }

    public String guess(String userAnswerString) {
        String result= guessNumberAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    private void modifyStatus(String result) {
        if("4A0B".equals(result)){
            gameStatus= GameStatus.SUCCESS;
        } else if(leftTryTime ==0){
            gameStatus=GameStatus.FAILED;
        }else{
            gameStatus=GameStatus.CONTINUE;
        }
    }

    private void decreaseTryTimes() {
        leftTryTime--;
    }

    public GameStatus getStatus() {

        return gameStatus;
    }
}
