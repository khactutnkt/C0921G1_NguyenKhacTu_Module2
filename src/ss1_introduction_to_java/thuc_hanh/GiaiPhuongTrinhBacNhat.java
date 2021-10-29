package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("a: ");
        a = sc.nextDouble();
        System.out.println("b: ");
        b = sc.nextDouble();
        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            double result = -b/a;
            System.out.println("Phương trình có nghiệm x = " + result);

        }
    }
}
