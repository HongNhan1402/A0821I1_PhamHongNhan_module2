package Comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle () {
    }
    public ComparableCircle (double Radius) {
        super(Radius);
    }
    public ComparableCircle (double Radius , String color , boolean filled) {
        super(Radius, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}