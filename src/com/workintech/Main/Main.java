package com.workintech.Main;
import com.workintech.Enum.Direction;
import com.workintech.Enum.LampType;
import com.workintech.Enum.PaintColor;
import com.workintech.project.*;

public class Main {
    public static void main(String[] args) {

            Lamp lamp1 = new Lamp(true,100,LampType.LED);
            lamp1.turnOn();

            Ceiling ceiling = new Ceiling(3, PaintColor.RED);
            ceiling.create();

            Bed bed = new Bed(2, 2,2,2);


            Wall northWall = new Wall(Direction.NORTH);
            Wall eastWall = new Wall(Direction.EAST);
            Wall westWall = new Wall(Direction.WEST);
            Wall southWall = new Wall(Direction.SOUTH);



            Wall[] walls = {northWall, eastWall, westWall, southWall};

            //new Wall[]{northWall, eastWall, westWall, southWall}
            Bedroom bedroom = new Bedroom(northWall, eastWall, westWall, southWall, ceiling,
                    new Lamp(true, 120,LampType.FLORASAN),"Ebeveyn",
                    new Bed(2, 2, 2, 2),
                    new Wardrope(1,3, 20),
                    new Carpet(1,3, PaintColor.BLUE));

            //bedroom.
            System.out.println(bedroom);

            bedroom.createBedroom();
        }

    }
