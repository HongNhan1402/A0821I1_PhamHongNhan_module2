import java.util.Scanner;
import java.util.SortedMap;

public class _demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayNumber = {1,2,3,4,5,6,7};
        System.out.println("Nhap so ban muon xoa");
        int number = input.nextInt();
        boolean check = false;
        for (int i=0;i<arrayNumber.length;i++) {
            if (arrayNumber[i] == number) {
                check = true;
                System.out.println("So cua ban o vi tri " + i);
                for(int j=i;j<arrayNumber.length-1;j++){
                    arrayNumber[j] = arrayNumber[j+1];
                }
                break;
            }
        }
        if(check == false) System.out.println("Phần tử " + number + " không có trong mảng.");
        else{
            System.out.println("Mảng sau khi xóa là: ");
            for(int i=0;i<arrayNumber.length-1;i++){
                System.out.print(arrayNumber[i] + "\t");
            }
        }
    }
}