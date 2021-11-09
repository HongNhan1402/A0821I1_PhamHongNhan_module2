import java.util.Arrays;
import java.util.Scanner;

public class _tong_cac_duong_cheo {
        public static void main(String[] args) {
            System.out.print("Kích thước của ma trận vuông: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[][] arr = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("arr[" + i + "][" + j + "] = ");
                    arr[i][j] = scanner.nextInt();
                }
            }
            //tính tổng đường chéo chính
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i][i];
            }
            //in ra mảng và kết quả
            System.out.println("Mảng:");
            for (int i = 0; i < size; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.print("Tổng đường chéo chính = " + sum);
        }
}
