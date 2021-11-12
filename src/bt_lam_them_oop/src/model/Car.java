package model;

public class Car extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public Car(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car(String bienKiemSoat, String hangSanXuat, int namSanXuat, String tenChuSoHuu, String kieuXe, int soChoNgoi) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "model.Car{" +
                super.toString()+
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
