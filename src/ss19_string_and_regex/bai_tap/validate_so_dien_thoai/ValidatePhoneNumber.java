package ss19_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber = scanner.nextLine();
        }while (!Pattern.matches("^\\([\\d]{2}\\)-\\([0]([\\d]{9})\\)$", phoneNumber));
        System.out.println("Số điện thoại: "+phoneNumber);
    }
}
