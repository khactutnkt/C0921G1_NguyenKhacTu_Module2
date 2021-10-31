package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimMaxTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Nhập vào độ dài mảng");
            size = sc.nextInt();
            if (size>20 || size<=0){
                System.out.println("Nhập độ dài mảng lớn hơn 0, nhỏ hơn 20");
            }
        }while (size>20 || size<=0);
        arr = new int[size];
        for (int i=0; i<arr.length; i++){
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập:");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > arr[index]){
                index = i;
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+arr[index]+", tại vị trí "+index);
    }

}
