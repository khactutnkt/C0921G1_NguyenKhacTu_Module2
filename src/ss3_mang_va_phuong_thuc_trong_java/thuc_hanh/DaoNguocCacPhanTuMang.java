package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào độ dài mảng:");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Nhập độ dài mảng không quá 20. Nhập lại:");
            }
        }while (size>20);
        arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Mảng vùa nhập vào là:");
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        for (int j=0; j<arr.length/2; j++){
            int temp = arr[j];
            arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;
        }
        System.out.println("\nMảng sau khi đảo ngược là");
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
