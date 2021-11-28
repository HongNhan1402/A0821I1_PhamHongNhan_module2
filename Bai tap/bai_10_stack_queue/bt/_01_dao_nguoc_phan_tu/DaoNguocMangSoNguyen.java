package _01_dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class DaoNguocMangSoNguyen {
    public static void main(String[] args) {
        int[] array = initArray();
        System.out.println("Before:\n" + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("After:\n" + Arrays.toString(array));
    }

    //Mảng số nguyên rỗng cho sẵn
    public static int[] initArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 30);
        }
        return array;
    }
}
