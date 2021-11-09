import java.util.Scanner;

public class bai_7 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nam cua ban");
        a = scanner.nextInt();
        if (a % 100 == 0 && a % 400 == 0)
            System.out.println("Day la nam nhuan");
        else if (a % 4 == 0 && a % 100 != 0)
            System.out.println("Day la nam nhuan");
        else if (a % 100 == 0 && a % 400 == 0 )
            System.out.println("Day khong phai la nam nhuan");
        else System.out.println("Day khong phai la nam nhuan");
    }
}
