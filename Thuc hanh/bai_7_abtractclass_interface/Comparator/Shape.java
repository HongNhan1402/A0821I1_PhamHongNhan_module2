package Comparator;

public class Shape {
    private String color;
    private boolean filled;
    public Shape () {
    }
    public Shape (String color , boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
    public String toString () {
        return  "This color is " + getColor();
    }
}