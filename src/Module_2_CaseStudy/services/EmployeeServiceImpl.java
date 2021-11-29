package services;

import models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    static ArrayList<Employee> employeeList = new ArrayList<>();
    {
        employeeList.add(new Employee("Khắc Từ", "21/01/1998", "Nam", "1234567",
                "033564564", "tu@gmail.com", "NV001", "Đại học", "NV kinh doanh", 10000));
        employeeList.add(new Employee("Văn An", "11/11/2000", "Nam", "1457756",
                "037467555", "tu@gmail.com", "NV002", "Đại học", "NV kinh doanh", 10000));
        employeeList.add(new Employee("Nguyễn Nguyên", "16/07/1999", "Nam", "1234567",
                "033564564", "tu@gmail.com", "NV003", "Đại học", "NV kinh doanh", 10000));
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void displayList() {
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên nhân viên:");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập ngày sinh:");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();

        System.out.println("Nhập số CMND:");
        String soCMND = scanner.nextLine();

        System.out.println("Nhập số điện thoại:");
        String soDienThoai = scanner.nextLine();

        System.out.println("Nhập email:");
        String email = scanner.nextLine();

        System.out.println("Nhập mã nhân viên:");
        String maNhanVien = scanner.nextLine();

        System.out.println("Nhập trình độ nhân viên:");
        String trinhDo = scanner.nextLine();

        System.out.println("Nhập vị trí nhân viên:");
        String viTri = scanner.nextLine();

        System.out.println("Nhập lương của nhân viên:");
        double luong = Double.parseDouble(scanner.nextLine());
        Employee newEmployee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNhanVien,trinhDo,viTri,luong);
        employeeList.add(newEmployee);
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập mã nhân viên muốn xóa khỏi danh sách:");
        String maNhanVien = scanner.nextLine();
        for (int i=0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(maNhanVien)){
                System.out.println("Nhập tên nhân viên:");
                String hoTen = scanner.nextLine();
                employeeList.get(i).setHoTen(hoTen);

                System.out.println("Nhập ngày sinh:");
                String ngaySinh = scanner.nextLine();
                employeeList.get(i).setNgaySinh(ngaySinh);

                System.out.println("Nhập giới tính:");
                String gioiTinh = scanner.nextLine();
                employeeList.get(i).setGioiTinh(gioiTinh);

                System.out.println("Nhập số CMND:");
                String soCMND = scanner.nextLine();
                employeeList.get(i).setSoCMND(soCMND);

                System.out.println("Nhập số điện thoại:");
                String soDienThoai = scanner.nextLine();
                employeeList.get(i).setSoDienThoai(soDienThoai);

                System.out.println("Nhập email:");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);

                System.out.println("Nhập trình độ nhân viên:");
                String trinhDo = scanner.nextLine();
                employeeList.get(i).setTrinhDo(trinhDo);

                System.out.println("Nhập vị trí nhân viên:");
                String viTri = scanner.nextLine();
                employeeList.get(i).setViTri(viTri);

                System.out.println("Nhập lương của nhân viên:");
                double luong = Double.parseDouble(scanner.nextLine());
                employeeList.get(i).setLuong(luong);
            }
        }
    }
}
