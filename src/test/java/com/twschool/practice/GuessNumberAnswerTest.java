package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberAnswerTest {

    @Test
    public void should_return_4A0B_when_userAnswerString_1234_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_1A3B_when_userAnswerString_1342_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("1 3 4 2");
        //then
        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void should_return_1A1B_when_userAnswerString_1378_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("1 3 7 8");
        //then
        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void should_return_0A4B_when_userAnswerString_2341_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("2 3 4 1");
        //then
        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_0A3B_when_userAnswerString_2345_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("2 3 4 5");
        //then
        Assert.assertEquals("0A3B",result);
    }

    @Test
    public void should_return_0A0B_when_userAnswerString_5678_given_game_answerString_1234(){
        //given
        GuessNumberAnswer answer=new GuessNumberAnswer("1 2 3 4");
        //when
        String  result=answer.check("5 6 7 8");
        //then
        Assert.assertEquals("0A0B",result);
    }

}
