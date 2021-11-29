package models;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House(String tenDichVu, int dienTichThue, int chiPhiThue, int soLuongNguoi,
                 String kieuThue, String tieuChuanPhong, int soTang) {
        super(tenDichVu, dienTichThue, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
