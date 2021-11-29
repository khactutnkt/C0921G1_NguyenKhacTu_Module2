package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;

import javax.xml.ws.Service;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> maps = new LinkedHashMap<>();
    {
        Facility facility1 = new Villa("villa1", 100, 1500,
                2, "theo ngày", "A", 30, 1 );

        Facility facility2 = new Villa("villa2", 150, 2000,
                3, "theo ngày", "A", 35, 2 );
//
//        Facility facility3 = new Villa("villa3", 200, 2500,
//                4, "theo ngày", "A", 40, 2 );

        Facility facility4 = new Room("room1", 30, 800,
                1, "theo ngày", "hồ bơi");

        Facility facility5 = new Room("room2", 40, 900,
                1, "theo ngày", "hồ bơi");

//        Facility facility6 = new Room("room3", 50, 1000,
//                2, "theo ngày", "hồ bơi");

        Facility facility7 = new House("house1", 80, 1200,
                2, "theo ngày", "A", 2 );

        Facility facility8 = new House("house2", 90, 1200,
                2, "theo ngày", "A", 2 );
//
//        Facility facility9 = new House("house3", 100, 1500,
//                3, "theo ngày", "A", 2 );

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

    public void addNewVilla(){
        System.out.println("Nhập vào tên dchj vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập vào diện tích thuê: ");
        int dienTichThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chi phí thuê: ");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng người: ");
        int soLuongNguoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập vào tiêu chuẩn phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập vào diện tích hồ bơi: ");
        int dienTichHoBoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(tenDichVu, dienTichThue, chiPhiThue, soLuongNguoi,
                kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
        maps.put(villa, 0);
    }

    public void addNewRoom(){
        System.out.println("Nhập vào tên dchj vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập vào diện tích thuê: ");
        int dienTichThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chi phí thuê: ");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng người: ");
        int soLuongNguoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập vào dịch vụ đi kèm: ");
        String dichVuDiKem = scanner.nextLine();
        Room room = new Room(tenDichVu, dienTichThue, chiPhiThue, soLuongNguoi, kieuThue, dichVuDiKem);
        maps.put(room, 0);

    }

    public void addNewHouse(){
        System.out.println("Nhập vào tên dchj vụ: ");
        String tenDichVu = scanner.nextLine();
        System.out.println("Nhập vào diện tích thuê: ");
        int dienTichThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chi phí thuê: ");
        int chiPhiThue = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng người: ");
        int soLuongNguoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào kiểu thuê: ");
        String kieuThue = scanner.nextLine();
        System.out.println("Nhập vào tiêu chuẩn phòng : ");
        String tieuChuanPhong = scanner.nextLine();
        System.out.println("Nhập vào số tầng: ");
        int soTang = Integer.parseInt(scanner.nextLine());
        House house = new House(tenDichVu, dienTichThue, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, soTang);
        maps.put(house, 0);
    }
    @Override
    public void displayListMaintenance() {

    }

    @Override
    public void editFacility() {
//        System.out.println("Nhập vào tên dịch vụ muốn chỉnh sửa");
//        String tenDichVu = scanner.nextLine();
//

    }

    @Override
    public void deleteFacility() {

    }


}
