package ss4_lop_va_doi_tuong_trong_java.bai_tap.phuong_trinh_bac_hai;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextDouble();
        System.out.println("Nhập b:");
        b = sc.nextDouble();
        System.out.println("Nhập c:");
        c = sc.nextDouble();
        System.out.println("Phương trình "+a+"x^2 + "+b+"x+ "+c+" = 0");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else if (delta==0){
            System.out.println("Phương trình có nghiệm kép: x = "+quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình có 2 nghiệm \n x1 = "+quadraticEquation.getRoot1()+
                    "\n x2 = "+quadraticEquation.getRoot2());
        }
    }
}
