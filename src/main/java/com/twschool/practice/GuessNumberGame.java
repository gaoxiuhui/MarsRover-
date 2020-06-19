package com.twschool.practice;

public class GuessNumberGame {


    private GuessNumberAnswer guessNumberAnswer;

    public GuessNumberGame(GuessNumberAnswer guessNumberAnswer) {

        this.guessNumberAnswer = guessNumberAnswer;
    }

    public String guess(String userAnswerString) {
        return guessNumberAnswer.check(userAnswerString);
    }
}
