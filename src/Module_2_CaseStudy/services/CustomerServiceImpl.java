package services;

import models.Customer;
import write_read_file.WriteReadFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    static final String CUSTOMER_FILE_PATH = "src\\data\\customer";
    static final String COMMA = ",";
    static List<Customer> customerList = new LinkedList<>();
    {
        customerList = convertStringToCustomer();
//        customerList.add(new Customer("Tu", "21/01/1998", "nam", "197415142",
//                "0969854784", "tu@gmail.com", "KH001", "Diamond", "đà nẵng"));
//        customerList.add(new Customer("Nguye", "01/01/1995", "nam", "19742547",
//                "0969854784", "tu@gmail.com", "KH002", "Platinium", "sài gòn"));
//        customerList.add(new Customer("Nhi", "16/06/1998", "nữ", "1974111154",
//                "0969854784", "tu@gmail.com", "KH003", "Gold", "quảng trị"));
    }

    List<String> stringList;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
        System.out.println("Danh sách khách hàng:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên khách hàng:");
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

        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = scanner.nextLine();

        System.out.println("Nhập loại khách:");
        String loaiKhach = scanner.nextLine();

        System.out.println("Nhập địa chỉ khách hàng");
        String diaChi = scanner.nextLine();

        Customer customer = new Customer(hoTen,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maKhachHang,loaiKhach,diaChi);
        customerList.add(customer);
        stringList = convertCustomerToString();
        WriteReadFile.writeFile(CUSTOMER_FILE_PATH, stringList, true);

    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập vào mã khách hàng muốn sửa");
        String maKhachHang = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang().equals(maKhachHang)){
                System.out.println("Nhập tên khách hàng:");
                String hoTen = scanner.nextLine();
                customerList.get(i).setHoTen(hoTen);

                System.out.println("Nhập ngày sinh:");
                String ngaySinh = scanner.nextLine();
                customerList.get(i).setNgaySinh(ngaySinh);

                System.out.println("Nhập giới tính:");
                String gioiTinh = scanner.nextLine();
                customerList.get(i).setGioiTinh(gioiTinh);

                System.out.println("Nhập số CMND:");
                String soCMND = scanner.nextLine();
                customerList.get(i).setSoCMND(soCMND);

                System.out.println("Nhập số điện thoại:");
                String soDienThoai = scanner.nextLine();
                customerList.get(i).setSoDienThoai(soDienThoai);

                System.out.println("Nhập email:");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);

                System.out.println("Nhập loại khách:");
                String loaiKhach = scanner.nextLine();
                customerList.get(i).setLoaiKhach(loaiKhach);

                System.out.println("Nhập địa chỉ khách hàng:");
                String diaChi = scanner.nextLine();
                customerList.get(i).setDiaChi(diaChi);
            }
        }
        stringList = convertCustomerToString();
        WriteReadFile.writeFile(CUSTOMER_FILE_PATH, stringList, false);
    }

    public List<Customer> convertStringToCustomer(){
        List<String> stringList = WriteReadFile.readFile(CUSTOMER_FILE_PATH);
        List<Customer> customerList = new ArrayList<>();
        String[] customerArray;
        for (String line : stringList){
            customerArray = line.split(",");
            customerList.add(new Customer(customerArray[0],customerArray[1],customerArray[2],customerArray[3],customerArray[4],
                    customerArray[5],customerArray[6],customerArray[7],customerArray[8]));
        }
        return customerList;
    }
    public List<String> convertCustomerToString(){
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getHoTen() + COMMA + customer.getNgaySinh() + COMMA + customer.getGioiTinh() + COMMA +
                    customer.getSoCMND() + COMMA + customer.getSoDienThoai() + COMMA + customer.getEmail() + COMMA +
                    customer.getMaKhachHang() + COMMA + customer.getLoaiKhach() + COMMA + customer.getDiaChi());
        }
        return stringList;
    }
}
