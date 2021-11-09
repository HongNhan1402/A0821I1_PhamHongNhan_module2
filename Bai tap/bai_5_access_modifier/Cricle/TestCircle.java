package Bai_5.Access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ban kinh cua ban");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
