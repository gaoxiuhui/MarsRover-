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

    public void move() {
        switch(getDirection()){
            case "N":
                setCoordinateY(getCoordinateY()+1);
                break;
            case "S":
                setCoordinateY(getCoordinateY()-1);
                break;
            case "E":
                setCoordinateX(getcoordinateX()+1);
                break;
            case "W":
                setCoordinateX(getcoordinateX()-1);
                break;
        }
    }

    public void turnRight() {
        switch(getDirection()){
            case "N":
                setDirection("E");
                break;
            case "E":
                setDirection("S");
                break;
            case "S":
                setDirection("W");
                break;
            case "W":
                setDirection("N");
                break;
        }
    }

    public void turnLeft() {
        switch(getDirection()){
            case "N":
                setDirection("W");
                break;
            case "W":
                setDirection("S");
                break;
            case "S":
                setDirection("E");
                break;
            case "E":
                setDirection("N");
                break;
        }
    }
}
