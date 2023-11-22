package com.workintech.project;

public class Bedroom extends Room {
    private String name;
    private Bed bed;
    private Wardrope wardrope;
    private Carpet carpet;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, String name, Bed bed, Wardrope wardrope, Carpet carpet) {
        super(wall1, wall2, wall3, wall4, ceiling, lamp);
        this.name = name;
        this.bed = bed;
        this.wardrope = wardrope;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrope getWardrope() {
        return wardrope;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public void setWardrope(Wardrope wardrope) {
        this.wardrope = wardrope;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    @Override
    public String toString() {
        return super.toString()+"Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrope=" + wardrope +
                ", carpet=" + carpet +
                '}';
    }

    public void createBedroom() {
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getWall4().create();
        getCeiling().create();

        bed.make();
        getCarpet().lying();
        wardrope.add();
        getLamp().turnOn();
    }
}