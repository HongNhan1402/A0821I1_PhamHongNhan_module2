package Comparator;

public class Circle extends Shape {
    private double Radius = 1.0;
    public Circle () {
    }
    public Circle (double Radius , String color , boolean filled) {
        super(color, filled);
        this.Radius = Radius;
    }
    public Circle (double Radius) {
        this.Radius = Radius;
    }
    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }
    public double getArea () {
        return Math.PI*Radius*Radius;
    }
    public double getPerimeter () {
        return 2*Radius*Math.PI;
    }
    public String toString () {
        return "A cricle is " + this.Radius + " and area is " + this.getArea() +
                " and perimeter is " + this.getPerimeter();
    }
}