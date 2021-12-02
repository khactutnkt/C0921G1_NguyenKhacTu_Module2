package services;

import models.Employee;
import write_read_file.WriteReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
    static final String EMPLOYEE_FILE_PATH = "src\\data\\employee";
    static final String COMMA = ",";

    static List<Employee> employeeList = new ArrayList<>();

    {
        employeeList = convertStringToEmployee();
//        employeeList.add(new Employee("Khắc Từ", "21/01/1998", "Nam", "1234567",
//                "033564564", "tu@gmail.com", "NV001", "Cao đẳng", "Lễ tân", 10000));
//        employeeList.add(new Employee("Văn An", "11/11/2000", "Nam", "1457756",
//                "037467555", "tu@gmail.com", "NV002", "Đại học", "Quản lý", 10000));
//        employeeList.add(new Employee("Nguyễn Nguyên", "16/07/1999", "Nam", "1234567",
//                "033564564", "tu@gmail.com", "NV003", "Trung cấp", "Phục vụ", 10000));

    }

    List<String> stringList;
    String[] trinhDoStrings = {"Trung cấp", "Cao đẳng", "Đại học", "Sau đại học"};
    String[] viTriStrings = {"Lễ tân", "Phục vụ", "Chuyên viên", "Giám sát", "Quản lý", "Giám đốc"};

    Scanner scanner = new Scanner(System.in);

    public String nhapTrinhDo(){
        String trinhDo = null;
        System.out.println("Chọn trình độ nhân viên:\n" +
                "1.\tTrung cấp\n"+
                "2.\tCao đẳng\n"+
                "3.\tĐại học \n"+
                "4.\tSau đại học\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                trinhDo = "Trung cấp";
                break;
            case 2:
                trinhDo = "Cao đẳng";
                break;
            case 3:
                trinhDo = "Đại học";
                break;
            case 4:
                trinhDo = "Sau đại học";
                break;
        }
        return trinhDo;
    }

    public String nhapViTri(){
        String viTri = null;
        System.out.println("Chọn vị trí nhân viên:\n" +
                "1.\tLễ tânt\n"+
                "2.\tPhục vụ\n"+
                "3.\tChuyên viên \n"+
                "4.\tGiám sát\n"+
                "5.\tQuản lý\n"+
                "6.\tGiám đốc\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                viTri = "Lễ tân";
                break;
            case 2:
                viTri = "Phục vụ";
                break;
            case 3:
                viTri = "Chuyên viên";
                break;
            case 4:
                viTri = "Giám sát";
                break;
            case 5:
                viTri = "Quản lý";
                break;
            case 6:
                viTri = "Giám đốc";
                break;
        }
        return viTri;
    }
    
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

        String trinhDo = nhapTrinhDo();

        String viTri = nhapViTri();

        System.out.println("Nhập lương của nhân viên:");
        double luong = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNhanVien,trinhDo,viTri,luong);

        employeeList.add(newEmployee);
        stringList = convertEmployeeToString();
        WriteReadFile.writeFile(EMPLOYEE_FILE_PATH, stringList, false);
    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập mã nhân viên muốn cập nhật thông tin:");
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

                String trinhDo = nhapTrinhDo();
                employeeList.get(i).setTrinhDo(trinhDo);

                String viTri = nhapViTri();
                employeeList.get(i).setViTri(viTri);

                System.out.println("Nhập lương của nhân viên:");
                double luong = Double.parseDouble(scanner.nextLine());
                employeeList.get(i).setLuong(luong);

            }
        }
        stringList = convertEmployeeToString();
        WriteReadFile.writeFile(EMPLOYEE_FILE_PATH, stringList, false);
    }



    public List<Employee> convertStringToEmployee(){
        List<String> stringList = WriteReadFile.readFile(EMPLOYEE_FILE_PATH);
        List<Employee> employeeList = new ArrayList<>();
        String[] employeeArray;
        for (String line : stringList) {
            employeeArray = line.split(",");
            employeeList.add(new Employee(employeeArray[0],employeeArray[1],employeeArray[2],employeeArray[3],employeeArray[4],
                    employeeArray[5],employeeArray[6],employeeArray[7],employeeArray[8],Double.parseDouble(employeeArray[9])));
        }
        return employeeList;
    }

    public List<String> convertEmployeeToString(){
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getHoTen()+COMMA+employee.getNgaySinh()+COMMA+employee.getGioiTinh()+COMMA+
                    employee.getSoCMND()+COMMA+employee.getSoDienThoai()+COMMA+employee.getEmail()+COMMA+
                    employee.getMaNhanVien()+COMMA+employee.getTrinhDo()+COMMA+employee.getViTri()+COMMA+employee.getLuong());
        }
        return stringList;
    }
}
