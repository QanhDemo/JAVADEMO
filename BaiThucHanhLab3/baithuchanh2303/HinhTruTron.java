package BaiThucHanhLab3.baithuchanh2303;

import java.util.Scanner;

public class HinhTruTron {
    float bankinh;
    final float pi = 3.14f;
    float chuviday;
    float dientichday;
    float chieucao;
    float thetich;
   
    void nhapbankinh()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap ban kinh: ");
    bankinh = sc.nextFloat();
}
    void nhapchieucao()
{
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap chieu cao: ");
    chieucao = sc.nextFloat();
}    
    void tinhchuviday()
{
    chuviday = 2 * pi * bankinh;
}
    void tinhdientichday()
{
    dientichday = 2 * bankinh * bankinh;
}
void tinhthetich()
{
    thetich = pi * bankinh * bankinh * chieucao ;
}
void hienthithongtin()
{
    System.out.printf(" bankinh = %f , chieucao = %f , chuviday = %f , dientichday = %f , thetich = %f " ,bankinh,chieucao,chuviday,dientichday,thetich );
}
}
