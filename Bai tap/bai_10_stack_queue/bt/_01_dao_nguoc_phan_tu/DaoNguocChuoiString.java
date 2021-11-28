package _01_dao_nguoc_phan_tu;

import java.util.Stack;

public class DaoNguocChuoiString {
    public static void main(String[] args) {
        String initString = "Đảo ngược chuỗi String bằng cách sử dụng stack";
        String[] words = initString.split("\\s");
        Stack<String> stack = new Stack<>();
        for (String value : words) {
            stack.push(value);
        }
        initString = "";
        while (!stack.isEmpty()) {
            initString += stack.pop() + " ";
        }
        System.out.println("After: " + initString);
    }
}
