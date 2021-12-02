package services;

import models.Booking;
import models.Contract;
import models.Customer;
import models.Facility;
import validate.DateValidation;
import write_read_file.WriteReadFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static final String BOOKING_FILE_PATH = "src\\data\\booking";
    static final String COMMA = ",";
    static List<Contract> contractList = new ArrayList<>();
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    {
        bookingSet = convertStringToBooking();

//        bookingSet.add(new Booking("BK01", "20/10/2021", "25/10/2021",
//                "KH001", "Villa", "SVVL-5555"));
//        bookingSet.add(new Booking("BK02", "15/11/2021", "29/11/2021",
//                "KH002", "House", "SVHO-0001"));
//        bookingSet.add(new Booking("BK02", "15/11/2020", "29/11/2020",
//                "KH002", "House", "SVHO-0001"));
    }

    Scanner scanner = new Scanner(System.in);
    DateValidation dateValidation = new DateValidation();


    @Override
    public void displayList() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập vào mã booking");
        String maBooking = scanner.nextLine();
        System.out.println("Nhập vào ngày bắt Đầu");
        String ngayBatDau = dateValidation.nhapNgayBooking();
        System.out.println("Nhập vào ngày kết thúc");
        String ngayKetThuc = dateValidation.nhapNgayBooking();
        System.out.println("Nhập vào mã khách hàng");
        String maKhachHang = nhapMaKhachHang();
        Facility dichVu = chonDichVu();
        String tenDichVu = dichVu.getTenDichVu();
        String maDichVu = dichVu.getMaDichVu();
        Booking booking = new Booking(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, maDichVu);
        bookingSet.add(booking);

        if (checkBookingMonth(booking)) {
            FacilityServiceImpl.facilityMap.put(dichVu, FacilityServiceImpl.facilityMap.get(dichVu) + 1);
            if (FacilityServiceImpl.facilityMap.get(dichVu) == 5) {
                FacilityServiceImpl.listMaintenance.add(dichVu);
            }
        }

        List<String> stringList = convertBookingToString();
        WriteReadFile.writeFile(BOOKING_FILE_PATH, stringList, false);
    }

    public String nhapMaKhachHang() {
        String maKhachHang;
        List<Customer> customerList = CustomerServiceImpl.customerList;
        System.out.println("Danh sách khách hàng:");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("Chọn mã khách hàng");
        maKhachHang = scanner.nextLine();
        return maKhachHang;
    }

    public Facility chonDichVu() {
        String[] dichVu = new String[2];
        int choice;
        Set<Facility> facilitySet = FacilityServiceImpl.facilityMap.keySet();
        List<Facility> facilities = new ArrayList<>(facilitySet);
        System.out.println("Danh sách dịch vụ");
        for (int i = 0; i < facilities.size(); i++) {
            System.out.println((i + 1) + ". " + facilities.get(i));
        }
        System.out.println("Chọn dịch vụ theo số thứ tự trên danh sách");
        choice = Integer.parseInt(scanner.nextLine());
        Facility fac = facilities.get(choice - 1);


        return fac;
    }

    public boolean checkBookingMonth(Booking booking) {
        Calendar calendar = Calendar.getInstance();
        String thangHienTai = Integer.toString(calendar.get(Calendar.MONTH) + 1);
        String namHienTai = Integer.toString(calendar.get(Calendar.YEAR));
        String[] ngayBooking = booking.getNgayBatDau().split("/");
        return ngayBooking[1].equals(thangHienTai) && ngayBooking[2].equals(namHienTai);
    }

    @Override
    public void createNewContracts() {
//        Queue<Booking> bookingQueue = new LinkedList<>();
//        bookingQueue.addAll(bookingSet);
//        Booking booking = bookingQueue.remove();
//        Contract contract = new Contract();
//        System.out.println("Tạo hợp đồng cho booking: ");
//        System.out.println(booking);
//        System.out.println("Nhập vào số hợp đồng");
//        contract.setSoHopDong(scanner.nextLine());
//        contract.setMaBooking(booking.getMaBooking());
//        System.out.println("Nhập vào số tiền đặt trước");
//        contract.setSoTienDatTruoc(Double.parseDouble(scanner.nextLine()));
//        System.out.println("Nhập vào tổng số tiền thanh toán");
//        contract.setTongTienThanhToan(Double.parseDouble(scanner.nextLine()));
//        contract.setMaKhachHang(booking.getMaKhachHang());
//        contractList.add(contract);
    }

    @Override
    public void displayListContracts() {
//        System.out.println("Danh sách contracts:");
//        for (Contract contract : contractList) {
//            System.out.println(contract);
//        }
    }

    @Override
    public void editContracts() {

    }

    public Set<Booking> convertStringToBooking() {
        Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        List<String> stringList = WriteReadFile.readFile(BOOKING_FILE_PATH);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(COMMA);
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingSet.add(booking);

        }
        return bookingSet;
    }

    public List<String> convertBookingToString() {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingSet) {
            stringList.add(booking.getMaBooking() + COMMA + booking.getNgayBatDau() + COMMA +
                    booking.getNgayKetThuc() + COMMA + booking.getMaKhachHang() + COMMA +
                    booking.getTenDichVu() + COMMA + booking.getMaDichVu());
        }
        return stringList;
    }
}
