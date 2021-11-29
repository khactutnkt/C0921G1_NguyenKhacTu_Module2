package models;

public class Contract {
    private int soHopDong;
    private Booking booking;
    private double soTienDatTruoc;
    private double tongTienThanhToan;
    private Customer customer;

    public Contract() {
    }

    public Contract(int soHopDong, Booking maBooking, double soTienDatTruoc,
                    double tongTienThanhToan, Customer maKhachHangl) {
        this.soHopDong = soHopDong;
        this.booking = maBooking;
        this.soTienDatTruoc = soTienDatTruoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.customer = maKhachHangl;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getSoTienDatTruoc() {
        return soTienDatTruoc;
    }

    public void setSoTienDatTruoc(double soTienDatTruoc) {
        this.soTienDatTruoc = soTienDatTruoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", maBooking='" + booking + '\'' +
                ", soTienDatTruoc=" + soTienDatTruoc +
                ", tongTienThanhToan=" + tongTienThanhToan +
                ", maKhachHangl='" + customer + '\'' +
                '}';
    }
}
