package models;

import java.util.Objects;

public abstract class Facility {
    private String tenDichVu;
    private double dienTichThue;
    private int chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;

    public Facility(String tenDichVu, int dienTichThue, int chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichThue = dienTichThue;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichThue() {
        return dienTichThue;
    }

    public void setDienTichThue(double dienTichThue) {
        this.dienTichThue = dienTichThue;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichThue=" + dienTichThue +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoi=" + soLuongNguoi +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return tenDichVu.equals(facility.tenDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenDichVu);
    }
}
