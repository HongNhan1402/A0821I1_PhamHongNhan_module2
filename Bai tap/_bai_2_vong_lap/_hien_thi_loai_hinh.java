import java.sql.SQLOutput;
import java.util.Scanner;

public class _hien_thi_loai_hinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 2:
                System.out.println("Draw the triangle");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                System.out.println("**");
                System.out.println("*");
                break;
            case 3:
                System.out.println("Draw the triangle");
                System.out.println("*");
                System.out.println("**");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                break;
            case 4:
                System.exit(0);
        }
    }
}
