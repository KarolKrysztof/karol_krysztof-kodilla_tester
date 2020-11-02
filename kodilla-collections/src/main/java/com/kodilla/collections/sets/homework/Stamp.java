package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampWidth;
    private double stampHeight;
    private boolean stamped;

    public Stamp(String stampName, double stampWidth, double stampHeight, boolean stamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.stamped = stamped;

    }

    public String getStampName() {

        return stampName;

    }

    public double getStampSize() {
        return stampWidth * stampHeight;
    }

    public String getStamped() {
        return stamped? "stamped" : "not stamped";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 &&
                Double.compare(stamp.stampHeight, stampHeight) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", stamped=" + stamped +
                '}';
    }

}
