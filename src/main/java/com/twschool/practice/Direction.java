package com.twschool.practice;

public enum Direction {
    E {
        @Override
        public Direction leftDirection() {
            return Direction.N;
        }

        @Override
        public Direction rightDirection() {
            return Direction.S;
        }
    }, N {
        @Override
        public Direction leftDirection() {
            return Direction.W;
        }

        @Override
        public Direction rightDirection() {
            return Direction.E;
        }
    }, S {
        @Override
        public Direction leftDirection() {
            return Direction.E;
        }

        @Override
        public Direction rightDirection() {
            return Direction.W;
        }
    }, W {
        @Override
        public Direction leftDirection() {
            return Direction.S;
        }

        @Override
        public Direction rightDirection() {
            return Direction.N;
        }
    };


    public abstract Direction leftDirection();
    public abstract Direction rightDirection();
    
    /*
    public Direction leftDirection(){
        int index=(this.ordinal()+3)%Direction.values().length;
        return Direction.values()[index];
    }*/
}
