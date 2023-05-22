package BaiThucHanhLab2;
  
import java.util.Scanner;

public class Bai6 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int so,a = 1;
long giaithua = 1;

    do {
        System.out.println("nhap so nguyen duong bat ky: ");
        so = scanner.nextInt();

    }while (so <= 0);
    while (a <= so){
        giaithua *= a;
        a++;
    }
    System.out.println(so + "! = " + giaithua);
}
}
