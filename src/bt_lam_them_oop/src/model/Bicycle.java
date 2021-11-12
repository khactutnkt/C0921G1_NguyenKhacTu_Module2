package model;

public class Bicycle extends Vehicle {
    private int congSuat;

    public Bicycle(int congSuat) {
        this.congSuat = congSuat;
    }

    public Bicycle(String bienKiemSoat, String hangSanXuat, int namSanXuat, String tenChuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "model.Bicycle{" +
                super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
}
