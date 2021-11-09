package _bai_1;

import java.util.Scanner;

public class _chuyen_doi_tien {
    public static void main(String[] args) {
        int money,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so tien cua ban (USD)");
        money = scanner.nextInt();
        result = 23000*money;
        System.out.println(money + " = " + result + " (VND)");
    }
}
