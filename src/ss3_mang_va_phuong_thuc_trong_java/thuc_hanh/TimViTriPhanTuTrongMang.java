package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimViTriPhanTuTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String nameInput = sc.nextLine();
        boolean isExist = false;
        for (int i=0; i<students.length; i++){
            if (students[i].equals(nameInput)){
                System.out.println("Position of the students in the list " + nameInput + " is: "+i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found" + nameInput + " in the list.");
        }
    }
}
