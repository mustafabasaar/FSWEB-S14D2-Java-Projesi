package com.workintech.project;

import com.workintech.Enum.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
   private int globRating;

    public Lamp(boolean battery, int globRating, LampType style) {
        this.style = style;
        this.battery=battery;
        this.globRating=globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public void turnOn(){
      System.out.println("Lamp is being turned on.");
  }
}
