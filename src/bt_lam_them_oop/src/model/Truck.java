package model;

public class Truck extends Vehicle {
    private int trongTai;

    public Truck(int trongTai){
        this.trongTai = trongTai;
    }

    public Truck(String bienKiemSoat, String hangSanXuat, int namSanXuat, String tenChuSoHuu, int trongTai) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "model.Truck{" +
                super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
