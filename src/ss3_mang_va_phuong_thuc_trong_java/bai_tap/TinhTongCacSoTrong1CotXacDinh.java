package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoTrong1CotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr;
        System.out.println("Nhập vào số dòng");
        int m = sc.nextInt();
        System.out.println("Nhập vào số cột");
        int n = sc.nextInt();
        arr = new double[m][n];
        System.out.println("Nhập vào các phần tử mảng");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        TinhTong1Cot(arr);
    }
    public static void TinhTong1Cot(double[][] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào vị trí cột muốn tính tổng");
        int n = sc.nextInt();
        double sum=0;
        for (int i=0; i<array.length; i++){
            sum += array[i][n];
        }
        System.out.println("Tổng các phần tử của cột "+n+" là: "+sum);
    }
}
