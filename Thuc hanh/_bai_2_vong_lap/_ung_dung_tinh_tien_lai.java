package bai_2;

import java.util.Scanner;

public class _ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money,interestRate;
        int month;
        int result = 0;
        System.out.println("Nhap so tien ban muon gui");
        money = scanner.nextInt();
        System.out.println("Nhap so thang ban muon gui");
        month = scanner.nextInt();
        System.out.println("nhap lai suat");
        interestRate = scanner.nextInt();
        for (int i=0;i<month;i++) {
            result += money*(interestRate/100)/12*month;
        }
        System.out.println("Tong tien lai cua ban la " + result);
    }
}
