package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void  should_return_coordinate_x0_y0_direction_W_when_command_L_given_coordinate_x0_y0_direction_N(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_E_when_command_L_given_coordinate_x0_y0_direction_S(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_N_when_command_L_given_coordinate_x0_y0_direction_E(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_S_when_command_L_given_coordinate_x0_y0_direction_W(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("L");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_E_when_command_R_given_coordinate_x0_y0_direction_N(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_W_when_command_R_given_coordinate_x0_y0_direction_S(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_S_when_command_R_given_coordinate_x0_y0_direction_E(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_coordinate_x0_y0_direction_N_when_command_R_given_coordinate_x0_y0_direction_W(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("R");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_y_add_1_direction_N_when_command_M_given_coordinate_x0_y0_direction_N(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.N);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.N,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(1,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_y_sub_1_direction_S_when_command_M_given_coordinate_x0_y0_direction_S(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.S);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.S,marsRoverPostion.getDirection());
        Assert.assertEquals(0,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(-1,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_x_add_1_direction_E_when_command_M_given_coordinate_x0_y0_direction_E(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.E);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.E,marsRoverPostion.getDirection());
        Assert.assertEquals(1,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }

    @Test
    public void  should_return_x_sub_1_direction_W_when_command_M_given_coordinate_x0_y0_direction_W(){
        //given
        MarsRoverPostion marsRoverPostion =new MarsRoverPostion(0,0,Direction.W);
        MarsRover marsRover =new MarsRover(marsRoverPostion);
        //when
        marsRover.receive("M");
        //then
        Assert.assertEquals(Direction.W,marsRoverPostion.getDirection());
        Assert.assertEquals(-1,marsRoverPostion.getcoordinateX());
        Assert.assertEquals(0,marsRoverPostion.getCoordinateY());
    }


}
