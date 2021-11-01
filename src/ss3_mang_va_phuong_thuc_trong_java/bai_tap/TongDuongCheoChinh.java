package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận vuông");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập: ");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i][i];
        }
        System.out.println("Tổng các phần tử trong đường chéo chính: "+sum);
    }
}
