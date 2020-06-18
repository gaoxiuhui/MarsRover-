package com.twschool.practice;

public class MarsRover {

    private final MarsRoverPostion marsRoverPostion;

    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }


    public void receive(String command) {
        //向左转
        if(command.equals("L")){
            switch(marsRoverPostion.getDirection()){
                case "N":
                    marsRoverPostion.setDirection("W");
                    break;
                case "W":
                    marsRoverPostion.setDirection("S");
                    break;
                case "S":
                    marsRoverPostion.setDirection("E");
                    break;
                case "E":
                    marsRoverPostion.setDirection("N");
                    break;
            }
        }
        //向右转
        else if(command.equals("R")){
            switch(marsRoverPostion.getDirection()){
                case "N":
                    marsRoverPostion.setDirection("E");
                    break;
                case "E":
                    marsRoverPostion.setDirection("S");
                    break;
                case "S":
                    marsRoverPostion.setDirection("W");
                    break;
                case "W":
                    marsRoverPostion.setDirection("N");
                    break;
            }
        }
        //向前移动
        else if(command.equals("M")){
            switch(marsRoverPostion.getDirection()){
                case "N":
                    marsRoverPostion.setCoordinateY(marsRoverPostion.getCoordinateY()+1);
                    break;
                case "S":
                    marsRoverPostion.setCoordinateY(marsRoverPostion.getCoordinateY()-1);
                    break;
                case "E":
                    marsRoverPostion.setCoordinateX(marsRoverPostion.getcoordinateX()+1);
                    break;
                case "W":
                    marsRoverPostion.setCoordinateX(marsRoverPostion.getcoordinateX()-1);
                    break;
            }
        }
    }

}
