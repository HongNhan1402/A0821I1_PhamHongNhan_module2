package Reziable;

public class Retangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Retangle() {
    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle (double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    public String toString() {
        return "A Rectangle:" + "\twidth = " + getWidth() + "\tlength = " + this.getLength();
    }


    public void resize (double percent) {
        this.width = (1+percent/100)*width;
        this.length = (1+percent/100)*length;
    }
}