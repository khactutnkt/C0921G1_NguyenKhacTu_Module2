package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalTriangleException();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        while (true) {
            System.out.println("cạnh 1:");
            a = Double.parseDouble(scanner.nextLine());
            System.out.println("cạnh 2:");
            b = Double.parseDouble(scanner.nextLine());
            System.out.println("cạnh 3:");
            c = Double.parseDouble(scanner.nextLine());
            try {
                Triangle triangle = new Triangle(a,b,c);
                System.out.println("Tam giác có độ dài: "+a+", "+b+", "+c);
                System.exit(0);
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        }
    }
}
