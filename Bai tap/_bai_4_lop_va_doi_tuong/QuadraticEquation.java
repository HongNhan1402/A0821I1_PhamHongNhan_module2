import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation () {
    }
    public QuadraticEquation (double a , double b , double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA () {
        this.a = a;
    }
    public void setB () {
        this.b = b;
    }
    public void setC () {
        this.c = c;
    }
    public double getDenta () {
        return b*b - 4*a*c;
    }
    public double getRoot1 () {
        return (-b + Math.sqrt(this.getDenta()))/2;
    }
    public double getRoot2 () {
        return (-b - Math.sqrt(this.getDenta()))/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("input Your a");
        a = sc.nextDouble();
        System.out.print("input Your b");
        b = sc.nextDouble();
        System.out.print("input Your c");
        c = sc.nextDouble();
        System.out.println("Phuong trinh cua ban la : " + a + "x^2" + b + "x" + c + " = 0" );
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("Your result 1 " + quadraticEquation.getRoot1());
        System.out.println("Your result 2 " + quadraticEquation.getRoot2());
    }
}
