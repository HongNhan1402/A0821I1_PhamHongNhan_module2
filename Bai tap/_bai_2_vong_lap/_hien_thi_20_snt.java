import java.util.Scanner;

public class _hien_thi_20_snt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to ban muon");
        int number;
        number = input.nextInt();
        int count =0;
        int x = 2;
        boolean check = false;
        while (count<number) {
            for (int i = 2;i<Math.sqrt(x);i++) {
                if (x%i == 0) check = false;
                else check = true;
                x++;
            }
            if (check == true) count++;
        }
        if (count == number) System.out.println(x);
    }
}
