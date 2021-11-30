package validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FacilityValidation {
    Scanner scanner = new Scanner(System.in);

    public String nhapMaVilla(){
        String maVilla;
        do {
            System.out.println("Nhập vào mã dịch vụ villa, yêu cầu định dạng 'SVVL-XXXX' với XXXX là các số 0-9");
            maVilla = scanner.nextLine();
        }while (!Pattern.matches("^SVVL-[\\d]{4}$", maVilla));
        return maVilla;
    }

    public String nhapMaHouse(){
        String maHouse;
        do {
            System.out.println("Nhập vào mã dịch vụ house, yêu cầu định dạng 'SVHO-XXXX' với XXXX là các số 0-9");
            maHouse = scanner.nextLine();
        }while (!Pattern.matches("^SVHO-[\\d]{4}$", maHouse));
        return maHouse;
    }

    public String nhapMaRoom(){
        String maRoom;
        do {
            System.out.println("Nhập vào mã dịch vụ villa, yêu cầu định dạng 'SVRO-XXXX' với XXXX là các số 0-9");
            maRoom = scanner.nextLine();
        }while (!Pattern.matches("^SVRO-[\\d]{4}$", maRoom));
        return maRoom;
    }

    public String nhapTenDichVu() {
        String tenDichVu;
        do {
            System.out.println("Nhập vào tên dịch vụ \n" +
                    "Yêu cầu: Ký tự đầu viết hoa, các ký tự sau viết thường");
            tenDichVu = scanner.nextLine();
        } while (!Pattern.matches("^([A-Z])([a-z]*)$", tenDichVu));
        return tenDichVu;
    }

    public double nhapDienTichSuDung() {
        String string;
        do {
            System.out.println("Nhập vào diện tích sử dụng, yêu cầu lớn hơn 30 mét vuông");
            string = scanner.nextLine();
        } while (!Pattern.matches("^30(.[\\d]*[1-9]+)$|^(3[1-9]|[4-9][\\d])(.[\\d]+)?$|^[1-9][\\d]{2,}(.[\\d]+)?$", string));
        return Double.parseDouble(string);
    }

    public double nhapDienTichHoBoi() {
        String string;
        do {
            System.out.println("Nhập vào diện tích hồ bơi, yêu cầu lớn hơn 30 mét vuông");
            string = scanner.nextLine();
        } while (!Pattern.matches("^30(.[\\d]*[1-9]+)$|^(3[1-9]|[4-9][\\d])(.[\\d]+)?$|^[1-9][\\d]{2,}(.[\\d]+)?$", string));
        return Double.parseDouble(string);

    }

    public double nhapChiPhiThue() {
        String string;
        do {
            System.out.println("Nhập vào chi phí thuê, yêu cầu là số dương");
            string = scanner.nextLine();
        } while (!Pattern.matches("^0(.[\\d]*[1-9])$|^[1-9][\\d]*(.[\\d]+)?$", string));
        return Double.parseDouble(string);
    }

    public int nhapSoLuongNguoi() {
        String string;
        do {
            System.out.println("Nhập vào số lượng người tối đa, yêu cầu lớn hơn 0 và nhỏ hơn 20");
            string = scanner.nextLine();
        } while (!Pattern.matches("^[1-9]$|^[1][\\d]$", string));
        return Integer.parseInt(string);
    }

    public int nhapSoTang() {
        String string;
        do {
            System.out.println("Nhập vào số tầng, yêu cầu lớn hơn 0");
            string = scanner.nextLine();
        } while (!Pattern.matches("^[1-9][\\d]*$", string));
        return Integer.parseInt(string);
    }

    public String nhapKieuThue() {
        String kieuThue;
        do {
            System.out.println("Nhập vào kiểu thuê \n" +
                    "Yêu cầu: Ký tự đầu viết hoa, các ký tự sau viết thường");
            kieuThue = scanner.nextLine();
        } while (!Pattern.matches("^([A-Z])([a-z]*)$", kieuThue));
        return kieuThue;
    }

    public String nhapTieuChuanPhong() {
        String tieuChuanPhong;
        do {
            System.out.println("Nhập vào tiêu chuẩn phòng \n" +
                    "Yêu cầu: Ký tự đầu viết hoa, các ký tự sau viết thường");
            tieuChuanPhong = scanner.nextLine();
        } while (!Pattern.matches("^([A-Z])([a-z]*)$", tieuChuanPhong));
        return tieuChuanPhong;
    }
}
