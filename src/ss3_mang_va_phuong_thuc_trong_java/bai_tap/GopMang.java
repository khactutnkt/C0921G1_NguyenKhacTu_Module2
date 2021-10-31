package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        System.out.println("Nhập mảng 1");
        int arr1[] = InputArray();
        System.out.println("\nNhập mảng 2");
        int arr2[] = InputArray();
        System.out.println("Mảng 1 vừa nhập:");
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println("\nMảng 2 vừa nhập:");
        for (int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] +" ");
        }
        int[] arr3 = Gop2Mang(arr1, arr2);
        System.out.println("\nMảng gộp từ 2 mảng đã nhập là:");
        for (int i=0; i<arr3.length; i++){
            System.out.print(arr3[i] +" ");
        }
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
    public static int[] Gop2Mang(int[] array1, int[] array2){
        int[] arr = new int[array1.length+array2.length];
        for (int i=0; i<array1.length; i++){
            arr[i] = array1[i];
        }
        for (int j=array1.length; j<arr.length; j++){
            arr[j] = array2[j-array1.length];
        }
        return arr;
    }
}
