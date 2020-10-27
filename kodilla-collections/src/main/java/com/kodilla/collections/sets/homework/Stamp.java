package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampWidth;
    private double stampHeight;

    public Stamp(String stampName, double stampWidth, double stampHeight) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;

    }

    public String getStampName() {
        return stampName;
    }

   public void stamped() {
       System.out.println("Stamp is stamped");
    }

    public void notStamped() {
        System.out.println("Stamp is not stamped");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 &&
                Double.compare(stamp.stampHeight, stampHeight) == 0 &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                '}';
    }

}
