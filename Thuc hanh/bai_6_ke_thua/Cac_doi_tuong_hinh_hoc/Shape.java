package Cac_doi_tuong_hinh_hoc;

public class Shape {
    // thuộc tính
    private String color;
    private boolean filled;
    // constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString () {
        return "A Shape with color of " + color + (isFilled() ? " and filled":" and not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
    }
}
