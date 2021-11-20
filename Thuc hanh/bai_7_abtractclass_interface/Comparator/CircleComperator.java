package Comparator;

import java.util.Comparator;

public class CircleComperator extends Circle implements Comparator<Circle> {
    public CircleComperator (double Radius , String color , boolean filled) {
        super (Radius , color , filled);
    }
    //    @Override
//    public int compare(Circle c1, Circle c2) {
//        if (c1.getRadius() > c2.getRadius()) return 1;
//        else if (c1.getRadius() < c2.getRadius()) return -1;
//        else return 0;
//    }
    public int compare (Circle c1 , Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}