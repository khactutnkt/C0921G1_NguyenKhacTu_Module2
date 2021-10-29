package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height;
        System.out.println("Nhập vào cân nặng:");
        weight = sc.nextDouble();
        System.out.println("Nhập vào chiều cao");
        height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("normal");
        }else if (bmi < 30){
            System.out.println("overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
