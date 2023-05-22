package BaiThucHanhLab3.BaiThucHanh2004;

import java.util.Scanner;

public class student {
    String fullName;
    int age;

    public void nhapten()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhập tên:");
        fullName = sc.nextLine();
    }
    public void nhaptuoi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhập tuổi:");
        age = sc.nextInt();
    }
}
