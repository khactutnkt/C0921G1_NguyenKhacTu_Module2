package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the yewr:");
        year = sc.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " là năm nhuận");
                }else {
                    System.out.println(year + " không phải là năm nhuận");
                }
            }else {
                System.out.println(year + " là năm nhuận");
            }
        }else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
