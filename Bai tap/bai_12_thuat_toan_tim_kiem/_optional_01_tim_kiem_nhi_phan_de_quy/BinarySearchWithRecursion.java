package _optional_01_tim_kiem_nhi_phan_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        System.out.print("Tạo mảng ngẫu nhiên với số lượng phần tử = ");
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            size = sc.nextInt();
        } while (size <= 0);
        int[] array = initArray(size);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Phần tử cần tìm = ");
        int value = sc.nextInt();
        int left = 0, right = size - 1;
        System.out.println("vị trí: " + binarySearch(array, left, right, value));
    }

    public static int[] initArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random() * size * 4);
        }
        return array;
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (right >= left) {
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            }
            if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }
}
