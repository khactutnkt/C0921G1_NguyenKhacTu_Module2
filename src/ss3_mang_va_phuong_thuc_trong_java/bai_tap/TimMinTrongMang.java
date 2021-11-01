package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] args) {
        int[] arr = InputArray();
        System.out.println("Mảng vừa nhập:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("\nSố nhỏ nhất trong mảng là: "+arr[minValue(arr)]);
    }
    public static int[] InputArray(){
        int n;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào độ dài mảng");
            n = sc.nextInt();
        }while (n<=0 || n>20);
        array = new int[n];
        for (int i=0; i<array.length; i++){
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static int minValue(int[] arr){
        int index=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }
}
