package com.twschool.practice;

public class Answer {

    public static String check(int[] gameAnswer,int[] userAnswer){
         int Anum=getANumber(gameAnswer,userAnswer);
         int Bnum=getBNumber(gameAnswer,userAnswer);
         return ""+Anum+"A"+Bnum+"B";
    }
    //获得A前面的数字
    private static int getANumber(int[] gameAnswer,int[] userAnswer){
        int ANumber =0;
        for(int i=0;i<gameAnswer.length;i++){
            if(gameAnswer[i]==userAnswer[i])
                ANumber++;
        }
        return ANumber;
    }

    //获得B前面的数字
    private static int getBNumber(int[] gameAnswer,int[] userAnswer){
        int BNumber =0;
        for(int i=0;i<gameAnswer.length;i++){
            for(int j=0;j<userAnswer.length;j++){
                if(i==j) continue;
                if(gameAnswer[i]==userAnswer[j])
                    BNumber++;
            }
        }
        return BNumber;
    }
}
