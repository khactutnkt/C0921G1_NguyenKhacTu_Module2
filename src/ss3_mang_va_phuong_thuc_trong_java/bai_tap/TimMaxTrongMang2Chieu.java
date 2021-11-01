package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Nhập vào số hàng");
        m = sc.nextInt();
        System.out.println("Nhập vào số cột");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Mảng 2 chiều kích thước "+m+"x"+n);
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+TimMaxTrongMang2Chieu(arr));
    }
    public static int TimMaxTrongMang2Chieu(int[][] array){
        int max=array[0][0];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
