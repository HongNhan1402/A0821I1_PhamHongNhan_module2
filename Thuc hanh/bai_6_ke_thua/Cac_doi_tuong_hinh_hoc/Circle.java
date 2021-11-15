package Cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle () {
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius,String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    public double getArea () {
        return radius*radius*Math.PI;
    }
    public double getPerimeter () {
        return 2*radius*Math.PI;
    }
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()
                + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2, "RED", false);
        System.out.println(circle.toString());
    }
}
