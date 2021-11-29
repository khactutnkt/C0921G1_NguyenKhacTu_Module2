package models;

public class Room extends Facility{
    private String dichVuDiKem;

    public Room(String tenDichVu, int dienTichThue, int chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuDiKem) {
        super(tenDichVu, dienTichThue, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                '}';
    }
}
