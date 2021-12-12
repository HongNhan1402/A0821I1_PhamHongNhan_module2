package _02_cai_dat_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {19, 60, 8, 9, 26, 4, 53, 10, 21, 41, 16, 34};
//        System.out.println("Acsending Sort: ");
//        insertionSortAcsending(list);
        System.out.println("Desending Sort: ");
        insertionSortDescending(list);

        System.out.println(Arrays.toString(list));
    }

    public static void insertionSortAcsending(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0; k--) {
                if (currentElement < list[k]) {
                    list[k + 1] = list[k];
                } else break;
            }
            list[k + 1] = currentElement;
        }
    }

    public static void insertionSortDescending(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0; k--) {
                if (currentElement > list[k]) {
                    list[k + 1] = list[k];
                } else break;
            }
            list[k + 1] = currentElement;
        }
    }
}
