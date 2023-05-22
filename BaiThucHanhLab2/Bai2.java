package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            int a;
            System.out.println("nhap vao so nguyen a = ");
                a = Bai2.scanner.nextInt();
        if( a%2 == 0)
        {
            System.out.println("so chan!");
        }
        else 
        {
            System.out.println("so le!");
        }
    }
}