import java.text.DecimalFormat;
import java.util.Scanner;

public class bai_5 {
    public static void main(String[] args) {
        int aNumber,bNumber,ve_phai;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // lam tron toi so thap phan thu 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a");
        aNumber = scanner.nextInt();
        System.out.println("Nhap vao so b");
        bNumber = scanner.nextInt();
        System.out.println("Nhap vao ve phai");
        ve_phai = scanner.nextInt();
        System.out.println("Phuong trinh cua ban la: " + aNumber + "x " + bNumber + " = " + ve_phai);
        if (aNumber == 0 ) {
            if (bNumber == 0) {
                System.out.println("Phuong trinh cua ban co vo so nghiem");
            }
            else System.out.println("Phuong trinh cua ban vo nghiem");
        }
        else {
            nghiem = (ve_phai - bNumber) / aNumber;
            System.out.println("Phuong trinh cua ban co nghiem la x = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
