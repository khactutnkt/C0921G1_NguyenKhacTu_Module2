package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int arr[] = InputArray();
        System.out.println("Mảng vừa nhập:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        ChenPhanTuVaoMang(arr);
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
    public static void ChenPhanTuVaoMang(int[] array){
        int index, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập vào vị trí muốn chèn");
        index = sc.nextInt();
        System.out.println("Nhập vào số muốn chèn");
        number = sc.nextInt();
        if (index<0 || index>=array.length){
            System.out.println("Không chèn được phần tử vào mảng");
        }else {
            array = Arrays.copyOf(array, array.length+1);
            for (int i=array.length-1; i>index; i--){
                array[i] = array[i-1];
            }
            array[index] = number;
            System.out.println("Mảng sau được chèn là");
            for (int j=0; j<array.length; j++){
                System.out.print(array[j]+" ");
            }
        }
    }
}
