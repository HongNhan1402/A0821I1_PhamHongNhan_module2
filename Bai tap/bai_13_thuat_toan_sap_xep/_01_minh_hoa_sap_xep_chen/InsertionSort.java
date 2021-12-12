package _01_minh_hoa_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {19, 60, 8, 9, 26, 4, 53, 10, 21, 41, 16, 34};
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            System.out.println("----------");
            System.out.print("Giá trị chèn = " + currentElement + "\n");
            int k;
            System.out.println("Sublist hiện tại:");
            for (k = i - 1; k >= 0; k--) {
                System.out.print(list[k] + "\t");
            }
            for (k = i - 1; k >= 0; k--) {
                if (currentElement > list[k]) {
                    list[k + 1] = list[k];
                } else break;
            }

            list[k + 1] = currentElement;
            System.out.println();
        }
    }
}
