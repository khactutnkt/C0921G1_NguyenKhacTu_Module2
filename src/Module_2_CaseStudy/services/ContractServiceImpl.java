package services;

import models.Booking;
import models.Contract;
import write_read_file.WriteReadFile;

import java.util.*;

public class ContractServiceImpl implements ContactService{
    static final String CONTRACT_FILE_PATH = "src\\data\\contract";
    private static final String COMMA = ",";
    static List<Contract> contractList = new ArrayList<>();
    {
        contractList = convertStringToContract();
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayList() {
        System.out.println("Danh sách contracts:");
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void addNew() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        bookingQueue.addAll(BookingServiceImpl.bookingSet);
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.remove();
            for (Contract c : contractList) {
                if (!(booking.getMaBooking().equals(c.getMaBooking()))){
                    Contract contract = new Contract();
                    System.out.println("Tạo hợp đồng cho booking: ");
                    System.out.println(booking);
                    System.out.println("Nhập vào số hợp đồng");
                    contract.setSoHopDong(scanner.nextLine());
                    contract.setMaBooking(booking.getMaBooking());
                    System.out.println("Nhập vào số tiền đặt trước");
                    contract.setSoTienDatTruoc(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Nhập vào tổng số tiền thanh toán");
                    contract.setTongTienThanhToan(Double.parseDouble(scanner.nextLine()));
                    contract.setMaKhachHang(booking.getMaKhachHang());
                    contractList.add(contract);
                }
            }
            List<String> stringList = convertContractToString();
            WriteReadFile.writeFile(CONTRACT_FILE_PATH, stringList, false);
        }
    }

    public List<Contract> convertStringToContract() {
        List<Contract> contractList = new ArrayList<>();
        List<String> stringList = WriteReadFile.readFile(CONTRACT_FILE_PATH);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(COMMA);
            Contract contract = new Contract(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), arr[4]);
            contractList.add(contract);

        }
        return contractList;
    }

    public List<String> convertContractToString() {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.getSoHopDong() + COMMA + contract.getMaBooking() + COMMA +
                    contract.getSoTienDatTruoc() + COMMA + contract.getTongTienThanhToan() + COMMA +
                    contract.getMaKhachHang());
        }
        return stringList;
    }
}
