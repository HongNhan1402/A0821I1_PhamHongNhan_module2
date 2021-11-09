import java.util.Scanner;
import java.util.SortedMap;

public class _xoa_ptu_trong_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayNumber = {1,2,3,4,5,6,7};
        System.out.println("Nhap so ban muon xoa");
        int number = input.nextInt();
        for (int i=0;i<arrayNumber.length;i++) {
            if (arrayNumber[i] == number) {
                arrayNumber[i] = arrayNumber[i+1];
            }
        }
        System.out.println("Mang sau khi xoa la:");
        for (int i=0;i<arrayNumber.length-1;i++){
            System.out.print(arrayNumber[i]);
        }
    }
}