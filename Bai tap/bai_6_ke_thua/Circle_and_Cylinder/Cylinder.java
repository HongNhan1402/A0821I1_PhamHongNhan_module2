package Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder () {
    }
    public Cylinder (double height , String color , double radius) {
        super(radius , color);
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume () {
        return Math.PI*super.getRadius()*super.getRadius()*this.height;
    }
    public String toString () {
        return "Height is " + this.height + " ,color is " + super.getColor() + " and volume is " + getVolume();
    }
}
