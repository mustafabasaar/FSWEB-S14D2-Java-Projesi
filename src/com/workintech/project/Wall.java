package com.workintech.project;

import com.workintech.Enum.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    public void create(){
        System.out.println("direction: "+getDirection());
    }
}
