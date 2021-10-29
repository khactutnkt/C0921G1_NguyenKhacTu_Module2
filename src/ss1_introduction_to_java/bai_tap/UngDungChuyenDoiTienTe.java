package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        double usd, vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD");
        usd = sc.nextDouble();
        vnd = usd * rate;
        System.out.println("VND: "+vnd);
    }
}
