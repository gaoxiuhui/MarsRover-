package com.twschool.practice;

public class MarsRover {

    public String left(String direction) {
        if(direction=="N") return "W";
        if(direction=="W") return "S";
        if(direction=="S") return "E";
        if(direction=="E") return "N";
        return "direction is error";
    }

    public String right(String direction) {
        if(direction=="N") return "E";
        if(direction=="W") return "N";
        if(direction=="S") return "W";
        if(direction=="E") return "S";
        return "direction is error";
    }
}
