package _optional_2_tim_chuoi_dai_nhat;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuousStringWithMaxLength {
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi kí tự: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        //Tìm chuỗi dài nhất
        String result = "";
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char ascii = inputString.charAt(i);
            if (result.length() == 0 || ascii >= result.charAt(result.length() - 1)) {
                result += inputString.charAt(i);
            } else {
                if (arrayList.size() == 0) {
                    arrayList.add(result.trim());
                } else {
                    if (result.trim().length() > arrayList.get(0).length()) {
                        arrayList.set(0, result.trim());
                    }
                }
                result = String.valueOf(inputString.charAt(i));
            }
        }
        if (result.trim().length() > arrayList.get(0).length()) {
            arrayList.set(0, result.trim());
        }

        System.out.println("result = " + arrayList);
        //Độ phức tạp = O(length of String)
    }
}
