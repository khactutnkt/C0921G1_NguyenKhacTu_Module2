package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import validate.FacilityValidation;

import javax.xml.ws.Service;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> maps = new LinkedHashMap<>();
    {
        Facility facility1 = new Villa("SVVL-0001","Villa", 100, 1500,
                2, "Day", "Standard", 30, 1 );

        Facility facility2 = new Villa("SVVL-0002","Villa", 150, 2000,
                3, "Day", "Superior", 35, 2 );

        Facility facility4 = new Room("SVRO-0001","Room", 30, 800,
                1, "Day", "hồ bơi");

        Facility facility5 = new Room("SVRO-0002","Room", 40, 900,
                1, "Day", "hồ bơi");

        Facility facility7 = new House("SVHO-0001","House", 80, 1200,
                2, "Week", "Standard", 2 );

        Facility facility8 = new House("SVHO-0002","House", 90, 1200,
                2, "Week", "Superior", 2 );

        maps.put(facility1,0);
        maps.put(facility4,0);
        maps.put(facility7,0);

    }
    @Override
    public void displayList() {
        for (Map.Entry<Facility, Integer> entry : maps.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Add new Facility \n" +
                "1.\tAdd New Villa\n"+
                "2.\tAdd New House\n"+
                "3.\tAdd New Room\n"+
                "4.\tBack to menu");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                System.exit(0);
        }
    }

    FacilityValidation facilityValidation = new FacilityValidation();
    public void addNewVilla(){
        String maDichVu = facilityValidation.nhapMaVilla();
        String tenDichVu = facilityValidation.nhapTenDichVu();
        double dienTichSuDung = facilityValidation.nhapDienTichSuDung();
        double chiPhiThue = facilityValidation.nhapChiPhiThue();
        int soLuongNguoi = facilityValidation.nhapSoLuongNguoi();
        String kieuThue = facilityValidation.nhapKieuThue();
        String tieuChuanPhong = facilityValidation.nhapTieuChuanPhong();
        double dienTichHoBoi = facilityValidation.nhapDienTichHoBoi();
        int soTang = facilityValidation.nhapSoTang();

        Villa villa = new Villa(maDichVu,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi,
                kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        maps.put(villa, 0);
    }

    public void addNewRoom(){
        String maDichVu = facilityValidation.nhapMaRoom();
        String tenDichVu = facilityValidation.nhapTenDichVu();
        double dienTichSuDung = facilityValidation.nhapDienTichSuDung();
        double chiPhiThue = facilityValidation.nhapChiPhiThue();
        int soLuongNguoi = facilityValidation.nhapSoLuongNguoi();
        String kieuThue = facilityValidation.nhapKieuThue();
        System.out.println("Nhập vào dịch vụ đi kèm: ");
        String dichVuDiKem = scanner.nextLine();

        Room room = new Room(maDichVu,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, dichVuDiKem);
        maps.put(room, 0);

    }

    public void addNewHouse(){
        String maDichVu = facilityValidation.nhapMaHouse();
        String tenDichVu = facilityValidation.nhapTenDichVu();
        double dienTichSuDung = facilityValidation.nhapDienTichSuDung();
        double chiPhiThue = facilityValidation.nhapChiPhiThue();
        int soLuongNguoi = facilityValidation.nhapSoLuongNguoi();
        String kieuThue = facilityValidation.nhapKieuThue();
        String tieuChuanPhong = facilityValidation.nhapTieuChuanPhong();
        int soTang = facilityValidation.nhapSoTang();
        House house = new House(maDichVu,tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
        maps.put(house, 0);
    }
    @Override
    public void displayListMaintenance() {

    }

    @Override
    public void editFacility() {

    }

    @Override
    public void deleteFacility() {

    }


}
