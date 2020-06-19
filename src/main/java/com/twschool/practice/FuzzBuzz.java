package com.twschool.practice;

public class FuzzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int FizzNumber = 3;
    public static final int BuzzNumber = 5;
    public static final int WhizzNumber = 7;

    public String say(int  number) {
        if(isContain(number,FizzNumber)&&!isContain(number,BuzzNumber)){
            return FIZZ;
        }
        if (isDivided(number,FizzNumber)&&isDivided(number,BuzzNumber)&&isDivided(number,WhizzNumber)&&!isContain(number,BuzzNumber)&&!isContain(number,BuzzNumber)){
            return FIZZ+BUZZ+WHIZZ;
        }
        if (isDivided(number,FizzNumber)&&isDivided(number,BuzzNumber)&&!isContain(number,BuzzNumber)&&!isContain(number,WhizzNumber)){
            return FIZZ+BUZZ;
        }
        if (isDivided(number,WhizzNumber)&&isDivided(number,FizzNumber)&&!isContain(number,BuzzNumber)){
            return FIZZ+WHIZZ;
        }
        if (isDivided(number,BuzzNumber)&&isDivided(number,WhizzNumber)&&!isContain(number,WhizzNumber)){
            return BUZZ+WHIZZ;
        }

        if (isDivided(number,FizzNumber)&&(!isContain(number,BuzzNumber)||isContain(number,WhizzNumber))){
            return FIZZ;
        }
        if (isDivided(number,BuzzNumber)&&!isContain(number,WhizzNumber)){
            return BUZZ;
        }
        if (isDivided(number,WhizzNumber)){
            return WHIZZ;
        }

        return String.valueOf(number);
    }
    private boolean isContain(int number,int num) {
        return String.valueOf(number).contains(String.valueOf(num));
    }
    private Boolean isDivided (int number1 ,int number2){
        return (number1 % number2 ==0);
    }
}
