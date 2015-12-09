package uits.jv1503;

import java.io.Serializable;

/**
 * Created by Lucky on 09.12.2015.
 */
public class Point implements Comparable <Point>,Serializable{
    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
     private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int compareTo(Point p) {

        return this.x-p.getX();
    }
}
