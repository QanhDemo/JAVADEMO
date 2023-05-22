package BaiThucHanhLab3.baithuchanh1404;

import BaiThucHanhLab3.baithuchanh1404.hinhchunhat;
import BaiThucHanhLab3.baithuchanh1404.hinhtron;
import BaiThucHanhLab3.baithuchanh1404.hinhtru;
import BaiThucHanhLab3.baithuchanh1404.hinhvuong;

public class MainClass {
    public static void main(String[] srgs){
        hinhtron ht = new hinhtron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();

        hinhtru htt = new hinhtru();
        htt.xuatten();
        htt.nhapchieucao();
        htt.tinhthetich();
        htt.inthetich();

        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();

        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
    
}
