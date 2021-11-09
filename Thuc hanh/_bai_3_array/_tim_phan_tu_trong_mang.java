import java.util.Scanner;

public class _tim_phan_tu_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String students [] = {"Nhan","Toan","Chien","Tam","Quoc"};
        System.out.println("Vui long nhap ten ban muon tim");
        String input = scanner.nextLine();
        boolean isExist = false;
        for (int i=0;i<students.length;i++) {
            if (input.equals(students[i])) {
                System.out.println("Ten cua ban o vi tri so " + (i+1));
                isExist = true;
                break;
            }
        }
        if(!isExist) System.out.println("Khong tim thay.");
    }
}
