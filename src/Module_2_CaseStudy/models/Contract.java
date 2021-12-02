package models;

import java.util.Objects;

public class Contract {
    private String soHopDong;
    private String maBooking;
    private double soTienDatTruoc;
    private double tongTienThanhToan;
    private String maKhachHang;

    public Contract() {
    }

    public Contract(String soHopDong, String maBooking, double soTienDatTruoc, double tongTienThanhToan, String maKhachHang) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienDatTruoc = soTienDatTruoc;
        this.tongTienThanhToan = tongTienThanhToan;
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
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

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", maBooking='" + maBooking + '\'' +
                ", soTienDatTruoc=" + soTienDatTruoc +
                ", tongTienThanhToan=" + tongTienThanhToan +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return soHopDong == contract.soHopDong &&
                Objects.equals(maBooking, contract.maBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soHopDong, maBooking);
    }
}
