package com.twschool.practice;

public class MarsRover {

    private final MarsRoverPostion marsRoverPostion;

    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }


    public void receive(String command) {
        //向左转
        if(command.equals("L")){
            marsRoverPostion.turnLeft();
        }
        //向右转
        else if(command.equals("R")){
            marsRoverPostion.turnRight();
        }
        //向前移动
        else if(command.equals("M")){
            marsRoverPostion.move();
        }
    }



}
