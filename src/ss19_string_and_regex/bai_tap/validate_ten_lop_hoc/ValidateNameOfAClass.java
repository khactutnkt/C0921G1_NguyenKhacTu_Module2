package ss19_string_and_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNameOfAClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        do {
            System.out.println("Nhập vào tên lớp học:");
            className = scanner.nextLine();
        }while (!Pattern.matches("^[CAP]([\\d]{4})[GHIKLM]$", className));
        System.out.println("Tên lớp học: "+className);

    }


}
