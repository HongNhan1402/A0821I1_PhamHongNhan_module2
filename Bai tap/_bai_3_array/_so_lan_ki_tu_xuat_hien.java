import java.util.Scanner;

public class _so_lan_ki_tu_xuat_hien {
    public static void main(String[] args) {
        String s = "bai 3: mang va phuong thuc";
        Scanner sc = new Scanner(System.in);
        String c;
        do {
            System.out.println("Nhập vào 1 kí tự: ");
            c = sc.next();
        } while (c.length() != 1);

        //đếm số lần xuất hiện
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c.equals(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }

        System.out.println("Chuỗi: \"" + s + "\"");
        System.out.printf("Kí tự %s xuất hiện %d lần", c, count);
    }
}
