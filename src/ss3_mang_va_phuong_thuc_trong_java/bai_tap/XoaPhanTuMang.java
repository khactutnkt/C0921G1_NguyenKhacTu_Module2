package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int arr[] = InputArray();
        System.out.println("Mảng vừa nhập:");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        XoaPhanTuMang(arr);
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
    public static void XoaPhanTuMang(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập vào số muốn xóa khỏi mảng");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i=0; i<array.length; i++){
            if (array[i] == num){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("Không có số "+num+" trong mảng");
        }else {
            int i=0;
            do {
                if (array[i]==num){
                    for (int j=i; j<array.length-1; j++){
                        array[j]=array[j+1];
                    }
                    array[array.length-1] = 0;
                    i--;
                }
                i++;
            }while (i<array.length);
            System.out.println("Mảng sau khi xóa là ");
            for (int j=0; j<array.length; j++){
                System.out.print(array[j]+"\t");
            }
        }

    }
}
