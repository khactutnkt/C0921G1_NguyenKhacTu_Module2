package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuatNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi");
        int tienGui = sc.nextInt();
        System.out.println("Nhập vào tỉ lệ lãi suất năm");
        float laiSuat = sc.nextFloat();
        System.out.println("Nhập vào số tháng vay tiền");
        int soThangVay = sc.nextInt();
        double tienLai = 0;
        int i = 0;
        while (i<soThangVay){
            tienLai += tienGui *laiSuat/12;
            tienGui += tienLai;
            i++;
        }
        System.out.println("Tiền lãi sau "+soThangVay+" tháng là: "+laiSuat);
    }
}
