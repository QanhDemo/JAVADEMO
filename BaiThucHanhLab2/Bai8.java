package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai8 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n, tong = 0 , so;
        float tbcong;
        System.out.println("nhap vao day so nguyen:");
        n = scanner.nextInt();

        for (int count = 1; count <= n; count++){
            System.out.println("nhap so thu" + count + " : ");
            so = scanner.nextInt();
            tong += so;
        }

        tbcong = (float) tong / n;
        System.out.println("tb cong = " + tbcong);
    }
}
