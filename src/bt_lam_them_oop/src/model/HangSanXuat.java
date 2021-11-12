package model;

public class HangSanXuat {
    private String maHangSX;
    private String tenHangSX;
    private String tenQuocGia;

    public HangSanXuat(String maHangSX, String tenHangSX, String tenQuocGia) {
        this.maHangSX = maHangSX;
        this.tenHangSX = tenHangSX;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }
}
