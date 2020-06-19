package com.twschool.practice;

public class MarsRoverPostion {

    public Direction direction;
    private  int coordinateY;
    private int coordinateX;

    public MarsRoverPostion(int coordinateX, int coordinateY, Direction direction) {

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
    public void setDirection(Direction direction){
        this.direction=direction;
    }
    public int getcoordinateX()
    {
        return coordinateX;
    }
    public int getCoordinateY(){
        return coordinateY;
    }

    public Direction getDirection(){
        return direction;
    }

    public void move() {
        switch(getDirection()){
            case N:
                setCoordinateY(getCoordinateY()+1);
                break;
            case S:
                setCoordinateY(getCoordinateY()-1);
                break;
            case E:
                setCoordinateX(getcoordinateX()+1);
                break;
            case W:
                setCoordinateX(getcoordinateX()-1);
                break;
        }
    }

    public void turnRight() {
        setDirection(getDirection().rightDirection());
    }

    public void turnLeft() {
        setDirection(getDirection().leftDirection());
    }
}
