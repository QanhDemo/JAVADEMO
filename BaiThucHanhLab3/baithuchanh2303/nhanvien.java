package BaiThucHanhLab3.baithuchanh2303;

import java.util.Scanner;

public class nhanvien {
    String fullName;
    int age;
    float hesoluong;
    float luongcoban = 1490000f;
    float luong;

    void nhapten()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten:");
        fullName = sc.nextLine();
    }
    void nhaptuoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tuoi: ");
        age = sc.nextInt();
    }
    void nhaphesoluong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap he so luong: ");
        hesoluong = sc.nextFloat();
    }
    void tinhluong()
    {
        luong = hesoluong * luongcoban;
    }
    void hienthithongtin()
    {
        System.out.printf("ten = %s , tuoi = %d , hesoluong = %f , luong = %f", fullName , age , hesoluong,luong);
    }
}
