package com.twschool.practice;

public class MarsRoverPostion {

    private  String direction;
    private  int coordinateY;
    private int coordinateX;

    public MarsRoverPostion(int coordinateX, int coordinateY, String direction) {

        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction =direction;
    }

    public void setCoordinateX(int coordinateX){
        this.coordinateX=coordinateX;
    }
    public void setCoordinateY(int coordinateY){
        this.coordinateY=coordinateY;
    }
    public void setDirection(String direction){
        this.direction=direction;
    }
    public int getcoordinateX()
    {
        return coordinateX;
    }
    public int getCoordinateY(){
        return coordinateY;
    }

    public String getDirection(){
        return direction;
    }
}
