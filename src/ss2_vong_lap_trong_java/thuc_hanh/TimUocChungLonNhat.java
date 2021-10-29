package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhập vào số nguyên thứ nhất");
        a = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            if (a==b){
                System.out.println("Không có ước chung lớn nhất");
            }else if (a==0){
                System.out.println(b+" là ước chung lớn nhất");
            }else {
                System.out.println(a+" là ước chung lớn nhất");
            }
        }else {
            int a1 = a, b1 = b;
            while (a1!=b1){
                if (a1>b1){
                    a1 = a1 - b1;
                }else {
                    b1 = b1 - a1;
                }
            }
            System.out.println(a1+" là ước chung lớn nhất của "+a+" và "+b);
        }
    }
}
