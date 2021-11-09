import java.util.Scanner;

public class Retangle {
    double width, height;

    public Retangle() {
    }
    public Retangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth () {
        return width;
    }
    public double getHeight () {
        return height;
    }
    public double getArea () {
        return this.width*this.height;
    }
    public double getPerimeter () {
        return (this.height+this.width)*2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width,height;
        System.out.print("Input your width");
        width = sc.nextDouble();
        System.out.print("Input your height");
        height = sc.nextDouble();
        Retangle newRetangle = new Retangle(width,height);
        System.out.print("Your area is " + newRetangle.getArea());
        System.out.println("Your perimeter is " + newRetangle.getPerimeter());
    }
}
