package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class GuessNumberAnswer {
    private final List<String> answerNumbers;

    public GuessNumberAnswer(String answerString){
        this.answerNumbers= Arrays.asList(answerString.split(" "));
    }
    public  String check(String userAnswerString){
         List<String> userAnswerNumbers=Arrays.asList(userAnswerString.split(" "));
         int valueAndPositionCorrCount=0;
         int  valueCorrPositionNotCorrCount=0;
         for (int i=0;i<answerNumbers.size();i++){
             if(answerNumbers.get(i).equals(userAnswerNumbers.get(i))){
                 valueAndPositionCorrCount++;
             }else if(answerNumbers.contains(userAnswerNumbers.get(i))){
                 valueCorrPositionNotCorrCount++;
             }
         }
         return valueAndPositionCorrCount+"A"+valueCorrPositionNotCorrCount+"B";
    }

}
