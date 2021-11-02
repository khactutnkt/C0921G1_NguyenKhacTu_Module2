package ss4_lop_va_doi_tuong_trong_java.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle:\n"+rectangle.display());
        System.out.println("Area: "+rectangle.getArea());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
    }
}
