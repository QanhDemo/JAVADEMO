package BaiThucHanhLab3.baithuchanh1404;

import java.util.Scanner;

public class hinhtru extends hinhtron{
    public float chieucao;
    public hinhtru(){
        ten = "hình trụ";
    }
    public void nhapchieucao(){
        nhapbankinh();

        System.out.println("chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
}
