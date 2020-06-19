package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberTest {

    @Test
    public void should_return_4_A_0_B_when_check_given_number_all_corr_position_all_corr(){
        //given
        int[] gameAnswer ={1,2,3,4};
        int[] userAnswer ={1,2,3,4};
        //when
        String  result=Answer.check(gameAnswer,userAnswer);
        //then
        Assert.assertEquals("4A0B",result);
    }
}
