package services;

import models.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    static LinkedList<Customer> customerList = new LinkedList<>();
    {
        customerList.add(new Customer("Tu", "21/01/1998", "nam", "197415142", "0969854784", "tu@gmail.com",
                "KH001", "Diamond", "đà nẵng"));
        customerList.add(new Customer("Nguye", "01/01/1995", "nam", "19742547", "0969854784", "tu@gmail.com",
                "KH002", "Platinium", "sài gòn"));
        customerList.add(new Customer("Nhi", "16/06/1998", "nữ", "1974111154", "0969854784", "tu@gmail.com",
                "KH003", "Gold", "quảng trị"));
    }
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
    }
}
