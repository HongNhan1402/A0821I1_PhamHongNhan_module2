import java.util.Scanner;

public class _tim_max {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("So ty phu ma ban muon nhap");
        int number = size.nextInt();
        int money [];
        money = new int[number];
        for (int i=0;i<number;i++) {
            System.out.println("Nhap so tien cua ty phu " + (i+1));
            money[i] = size.nextInt();
        }
        int max = money[0];
        for (int j=1;j<number;j++) {
            if (money[j] > number) max = money[j];
        }

        System.out.println("So tien lon nhat la " + max);
    }
}