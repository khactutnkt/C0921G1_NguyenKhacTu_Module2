package validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DateValidation {
    Scanner scanner = new Scanner(System.in);

    public String nhapNgaySinh(){
        String ngaySinh;
        do {
            System.out.println("Nhập ngày sinh theo định dạng 'DD/MM/YYYY'");
            ngaySinh = scanner.nextLine();
        }while (!Pattern.matches("^(0[1-9]|[12][\\d]|3[01])/(0[1-9]|1[0-2])/(19[2-9][\\d]|200[0-3])$", ngaySinh));
        return ngaySinh;
    }

    public String nhapNgayBooking(){
        String date;
        do {
            System.out.println("Nhập ngày theo định dạng 'DD/MM/YYYY', YYYY là 2021 hoặc 2022");
            date = scanner.nextLine();
        }while (!Pattern.matches("^(0[1-9]|[12][\\d]|3[01])/(0[1-9]|1[0-2])/(202[12])$", date));
        return date;
    }
}
