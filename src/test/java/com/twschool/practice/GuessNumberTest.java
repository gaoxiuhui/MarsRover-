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

    @Test
    public void should_return_1_A_3_B_when_check_given_number_all_corr_position_part_corr(){
        //given
        int[] gameAnswer ={1,2,3,4};
        int[] userAnswer ={1,3,4,2};
        //when
        String  result=Answer.check(gameAnswer,userAnswer);
        //then
        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void should_return_1_A_1_B_when_check_given_number_part_corr_position_part_corr(){
        //given
        int[] gameAnswer ={1,2,3,4};
        int[] userAnswer ={1,3,7,8};
        //when
        String  result=Answer.check(gameAnswer,userAnswer);
        //then
        Assert.assertEquals("1A1B",result);
    }

}
