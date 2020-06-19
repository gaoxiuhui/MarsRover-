package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

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
}

