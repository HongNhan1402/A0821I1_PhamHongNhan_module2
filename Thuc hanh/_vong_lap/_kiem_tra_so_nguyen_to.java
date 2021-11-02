package bai_2;

import java.util.Scanner;

public class _kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ban can kiem tra");
        int number = scanner.nextInt();
        if (number<2) System.out.println("Day khong phai la so nguyen to");
        else {
            int a = 2;
            boolean check = true;
            while (a<number) {
                if (number%2 == 0) check = false;
                break;
            }
            a++;
            if (check == true) System.out.println("Day la so nguyen to");
            else System.out.println("Day khong phai la so nguyen to");
        }
    }
}
