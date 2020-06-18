package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void  should_return_coordinate_0_0_direction_W_given_coordinate_0_0_direction_N(){
        //given
        MarsRover marsRover =new MarsRover();
        String direction="N";
        Coordinate coordinate= new Coordinate(0,0);
        //when
        String dir_result=marsRover.left(direction);
        //then
        Assert.assertEquals("W",dir_result);
        Assert.assertEquals(0,coordinate.x);
        Assert.assertEquals(0,coordinate.y);
    }

}
