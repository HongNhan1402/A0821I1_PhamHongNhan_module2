import java.util.Scanner;

public class bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight,result;
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chieu cao (m)");
        height = scanner.nextDouble();
        System.out.println("Vui long nhap can nang");
        weight = scanner.nextDouble();
        result = weight/(height*height);
        System.out.println("Bmi cua ban la " + result);
        if (result<18.5) System.out.println("Underweight");
        else if (result<25) System.out.println("Normal");
        else if (result<30) System.out.println("overweight");
        else System.out.println("obese");
    }
}
