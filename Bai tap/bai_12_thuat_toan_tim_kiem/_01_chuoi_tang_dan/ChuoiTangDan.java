package _01_chuoi_tang_dan;

import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi kí tự: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (result.length() == 0) {
                result += inputString.charAt(i);
            } else {
                char ascii = inputString.charAt(i);
                if (ascii > result.charAt(result.length() - 1)) {
                    result += ascii;
                }
            }
        }
        //Độ phức tạp = O(length) vs length là độ dài chuỗi nhập vào
        System.out.println(result);
    }
}
