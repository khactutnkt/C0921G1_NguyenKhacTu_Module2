package services;

import models.Booking;
import models.Customer;

import java.util.*;

public class PromotionServiceImpl {
    Scanner scanner = new Scanner(System.in);
    List<Customer> customerList = CustomerServiceImpl.customerList;
    Set<Booking> bookingSet = BookingServiceImpl.bookingSet;

    public void displayCustomerUsedPromotionService(){
        Set<Customer> customers = new HashSet<>();
        System.out.println("Nhập vào năm sử dụng voucher");
        int year = Integer.parseInt(scanner.nextLine());
        for (Booking booking : bookingSet) {
            String[] ngayBooking = booking.getNgayBatDau().split("/");
            if (year == Integer.parseInt(ngayBooking[2])){
                for (Customer customer : customerList) {
                    if (booking.getMaKhachHang().equals(customer.getMaKhachHang())){
                        customers.add(customer);
                    }
                }
            }
        }
        System.out.println("Danh sách khách hàng sử dụng voucher");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void getVoucher(){
    }
}
