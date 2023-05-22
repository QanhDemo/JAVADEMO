package BaiThucHanhLab3.baithuchanh1404;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float bankinh;

    public hinhtron(){
        ten = "hình tròn";
    }
    public void nhapbankinh(){
        System.out.println("bán kính = ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
}
