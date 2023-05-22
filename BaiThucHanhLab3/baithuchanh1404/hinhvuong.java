package BaiThucHanhLab3.baithuchanh1404;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat{
    public hinhvuong(){
        ten = "hình vuông ";
    }
    public void nhapcanh(){
        System.out.println("cạnh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
    
}
