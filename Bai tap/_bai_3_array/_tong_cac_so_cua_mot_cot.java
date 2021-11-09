import java.util.Arrays;
import java.util.Scanner;

public class _tong_cac_so_cua_mot_cot {
    public static void main(String[] args) {
        System.out.print("Số hàng của ma trận: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.print("Số cột của ma trận: ");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int colToSum;
        do {
            System.out.print("Tính tổng của cột j = ");
            colToSum = scanner.nextInt();
        } while (colToSum < 0 || colToSum > col);
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += arr[i][colToSum];
        }
        System.out.println("\nMảng: ");
        for (int[] arrEle : arr) {
            System.out.print(Arrays.toString(arrEle) + "\n");
        }
        System.out.println("\nSum = " + sum);
    }
}
