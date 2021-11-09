import java.lang.reflect.Array;
import java.util.Scanner;

public class _gop_mang {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int sizeA,sizeB,sizeC;
//        int arrayA [],arrayB [];
        System.out.println("Nhap chieu dai mang A");
        sizeA = number.nextInt();
        int arrayA [] = new int[sizeA];
        for (int i=0;i<sizeA;i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + " cua mang A");
            arrayA[i] = number.nextInt();
        }
        System.out.println("Nhap chieu dai mang B");
        sizeB = number.nextInt();
        int arrayB [] = new int[sizeB];
        for (int i=0;i<sizeB;i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + " cua mang B");
            arrayB[i] = number.nextInt();
        }
        sizeC = sizeA + sizeB;
        int arrayC [] = new int[sizeC];
        for (int i=0;i<sizeA;i++) {
            arrayC[i] = arrayA[i];
        }
        for (int i=0;i<sizeB;i++) {
            arrayB[i] = arrayC[sizeA+1];
        }

        System.out.println("Mang C la " + arrayC);
    }
}