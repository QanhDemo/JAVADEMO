package BaiThucHanhLab3.baithuchanh1404;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc{
    public float dai;
    public float rong;

    public void hinhchunhat(){
        ten = "hình chữ nhật";
    }
    public void nhapchieudai(){
        System.out.println("chiều dài = ");
        Scanner scanner = new Scanner (System.in);
        dai = scanner.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("chiều rộng = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
    
}
