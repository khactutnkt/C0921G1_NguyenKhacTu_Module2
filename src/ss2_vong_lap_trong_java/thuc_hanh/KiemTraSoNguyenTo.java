package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num<2){
            System.out.println(num + " is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(num)){
                if (num % i == 0){
                    System.out.println(num + " is not a prome");
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(num + " is a prime");
            }else {
                System.out.println(num + " is not a prime");
            }
        }
    }
}
