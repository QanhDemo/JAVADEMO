package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int so;
        int tong = 0;
        while (tong<100);
        System.out.println("nhap vao so:");
        so = scanner.nextInt();

        tong = tong + so;
        System.out.println("ket qua:" +tong);
    }
}
