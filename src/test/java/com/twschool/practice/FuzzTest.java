package com.twschool.practice;

import com.twschool.practice.FuzzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FuzzTest {

    @Test
    public void  should_return_1_given_number_1(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(1);
        //then
        Assert.assertEquals("1",result);
    }

    @Test
    public void  should_return_Fizz_given_number_can_be_divided_by_3(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(3);
        //then
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void  should_return_Buzz_given_number_can_be_divided_by_5(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(5);
        //then
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void  should_return_Whizz_given_number_can_be_divided_by_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(7);
        //then
        Assert.assertEquals("Whizz",result);
    }

    @Test
    public void  should_return_FizzBuzz_given_number_can_be_divided_by_3_and_5(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(60);
        //then
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void  should_return_FizzWhizz_given_number_can_be_divided_by_3_and_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(21);
        //then
        Assert.assertEquals("FizzWhizz",result);
    }

    @Test
    public void  should_return_BuzzWhizz_given_number_can_be_divided_by_5_and_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(140);
        //then
        Assert.assertEquals("BuzzWhizz",result);
    }

    @Test
    public void  should_return_FizzBuzzWhizz_given_number_can_be_divided_by_3_and_5_and_7(){
        //given
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when
        String result=fizzBuzz.say(210);
        //then
        Assert.assertEquals("FizzBuzzWhizz",result);
    }

    @Test
    public void  should_return_Fizz_given_number_contains_3(){
        //given 输入
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when 调用方法
        String result=fizzBuzz.say(13);
        //then 断言测试结果
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void  should_return_Fizz_given_number_contains_3_can_be_divided_by_5_and_3(){
        //given 输入
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when 调用方法
        String result=fizzBuzz.say(30);
        //then 断言测试结果
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void  should_return_BuzzWhizz_given_number_contains_5_contains_3(){
        //given 输入
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when 调用方法
        String result=fizzBuzz.say(35);
        //then 断言测试结果
        Assert.assertEquals("BuzzWhizz",result);
    }

    @Test
    public void  should_return_Fizz_given_number_contains_7_can_be_divided_by_5(){
        //given 输入
        FuzzBuzz fizzBuzz =new FuzzBuzz();
        //when 调用方法
        String result=fizzBuzz.say(75);
        //then 断言测试结果
        Assert.assertEquals("Fizz",result);
    }



}
