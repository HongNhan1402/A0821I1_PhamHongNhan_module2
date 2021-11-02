package bai_2;

import java.util.Scanner;

public class _uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so thu hai");
        int number2 = scanner.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("Khong co ket qua");
        }
        else {
            while ( number1 != number2) {
                if (number1>number2) number1 = number1 - number2;
                else number2 = number2 - number1;
            }
        }
        System.out.println("Uoc chung lon nhat la " + number1);
    }
}
