package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai1 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

    int a;
    int b;
        System.out.println("nhap vao so a : ");
        a = sc.nextInt();
        System.out.println("nhap vao so b : ");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong);

        System.out.println("Kết quả so sánh bằng 2 số " + a + " và " + b + " là " + (a == b));
        System.out.println("Kết quả so sánh không bằng 2 số " + a + " và " + b + " là " + (a != b ));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + a + " và " + b + " là " + (a > b));
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + a + " và " + b + " là " + (a >= b));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + a + " và " + b + " là " + (a < b));
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + a + " và " + b + " là " + (a <= b));

    }
}