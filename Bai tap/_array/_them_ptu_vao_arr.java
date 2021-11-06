import java.util.Scanner;

public class _them_ptu_vao_arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        int number, location;
        System.out.print("Nhap so ban muon them vao mang: ");
        number = scanner.nextInt();
        System.out.print("Nhap vi tri ban muon chen: ");
        location = scanner.nextInt();
        if (location < 0 || location > array.length) {
            System.out.println("Khong chen duoc phan tu vao mang");
        }
        else{
            for(int i = array.length - 1; i>location;i--){
                array[i] = array[i-1];
            }
            array[location] = number;
        }
        System.out.print("Mang sau khi them la: ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + "\t");
        }
    }
}