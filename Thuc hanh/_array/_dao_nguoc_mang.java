import java.util.Scanner;

public class _dao_nguoc_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int array [];
        int temp;
        do {
            System.out.println("Nhap so luong phan tu cua ban");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Xin vui long nhap lai");
        }
        while (size>20);

        array = new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + " cua ban");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang cua ban la:");
        for (int j=0;j<size;j++) {
            System.out.print( array[j] + "\t");
        }

        for(int i=0;i<size/2;i++){
            temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }
        System.out.println("\nMang sau khi dao nguoc la:");
        for (int i=0;i<size;i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
