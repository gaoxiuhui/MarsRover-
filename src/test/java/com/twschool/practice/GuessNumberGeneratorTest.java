package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Integer.parseInt;


public class GuessNumberGeneratorTest {

    @Test
    public void should_return_length__4_when_given_length_4(){
        //given
         GuessNumberGenerator  guessNumberGenerator=new GuessNumberGenerator();

        //when
        String gameNumber = guessNumberGenerator.generateNumber(4);
        //then
        Assert.assertEquals(4,gameNumber.length());
    }

    @Test
    public void should_return_number_when_given_length_4(){
        //given
        GuessNumberGenerator  guessNumberGenerator=new GuessNumberGenerator();
        boolean result=false;
        //when
        String gameNumber = guessNumberGenerator.generateNumber(4);
        //then
        for(int i=0;i<gameNumber.length();i++){
              int num=gameNumber.charAt(i)-'0';
            if(num<=9 && num>=0){
                result= true;
            }
            Assert.assertEquals(true,result);
        }
    }
}

