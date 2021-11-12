package model;

public abstract class Vehicle {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String tenChuSoHuu;

    public Vehicle(){}

    public Vehicle(String bienKiemSoat, String hangSanXuat, int namSanXuat, String tenChuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.tenChuSoHuu = tenChuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTenChuSoHuu() {
        return tenChuSoHuu;
    }

    public void setTenChuSoHuu(String tenChuSoHuu) {
        this.tenChuSoHuu = tenChuSoHuu;
    }

    @Override
    public String toString() {
        return "model.Vehicle{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", tenChuSoHuu='" + tenChuSoHuu + '\'' +
                '}';
    }
}
