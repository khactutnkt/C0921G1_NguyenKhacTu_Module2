package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter the width");
                    int width = input.nextInt();
                    System.out.println("Enter the height");
                    int height = input.nextInt();
                    for (int i = 0; i<height; i++){
                        for (int j = 0; j<width; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter the size");
                    int size = input2.nextInt();
                    System.out.println("The corner is square at: top-left");
                    for (int i=0; i<size; i++){
                        for (int j=0; j<=i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at: top-right");
                    for (int i=1; i<=size; i++){
                        for (int j=1; j<=size; j++){
                            if (i+j>size){
                                System.out.print(" * ");
                            }else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at:  botton-left");
                    for (int i=0; i<size; i++){
                        for (int j=0; j<size-i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at: botton-right");
                    for (int i=1; i<=size; i++){
                        for (int j=1; j<=size; j++){
                            if (j>=i){
                                System.out.print(" * ");
                            }else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Enter the size");
                    int size2 = input3.nextInt();
                    for (int i=1; i<=size2; i++){
                        for (int j=1; j<2*size2; j++){
                            if (Math.abs(size2-j)<i){
                                System.out.print(" * ");
                            }else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}
