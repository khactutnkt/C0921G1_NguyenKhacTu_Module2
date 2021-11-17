package thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_chen;

import java.util.Scanner;

public class InsertionSortStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortStep(list);
    }
    public static void insertionSortStep(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i-1; j >=0 && list[j] > currentElement ; j--) {
                System.out.println("Dịch "+list[j]+" sang vị trí thứ "+(j+1));
                list[j+1] = list[j];
            }
            System.out.println("Chèn "+currentElement+" vào vị trí thứ "+(j+1)+" trong danh sách");
            list[j+1] = currentElement;

            System.out.print("List after the  " + i + "' sort: ");
            for (j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
