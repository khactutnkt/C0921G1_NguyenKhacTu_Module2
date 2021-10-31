package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "12312";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ký tự muốn kiểm tra");
        char x = sc.next().charAt(0);
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==x){
                count++;
            }
        }
        System.out.println("Có "+count+" ký tự "+x+" xuất hiện trong chuỗi "+str);
    }
}
