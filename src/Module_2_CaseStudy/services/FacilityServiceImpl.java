package services;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import validate.FacilityValidation;
import write_read_file.WriteReadFile;

import java.util.*;

public class FacilityServiceImpl implements FacilityService{
    static final String VILLA_FILE_PATH = "src\\data\\villa";
    static final String HOUSE_FILE_PATH = "src\\data\\house";
    static final String ROOM_FILE_PATH = "src\\data\\room";
    static final String COMMA = ",";
    static List<Facility> listMaintenance = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
    {
        facilityMap = convertStringToFacility();
//        Facility facility10 = new House("SVHO-0004","House", 90, 1200,
//                2, "Week", "Superior", 2 );
//        facilityMap.put(facility10, 3);
    }

    static List<String> stringList;


    @Override
    public void displayList() {
        for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()){
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
        if (facilityMap.containsKey(villa)){
            facilityMap.put(villa, facilityMap.get(villa));
        }else {
            facilityMap.put(villa,0);
        }        stringList = convertFacilityToString(villa);
        WriteReadFile.writeFile(VILLA_FILE_PATH, stringList, true);
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
        if (facilityMap.containsKey(room)){
            facilityMap.put(room, facilityMap.get(room));
        }else {
            facilityMap.put(room,0);
        }        stringList = convertFacilityToString(room);
        WriteReadFile.writeFile(ROOM_FILE_PATH, stringList, true);
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
        if (facilityMap.containsKey(house)){
            facilityMap.put(house, facilityMap.get(house));
        }else {
            facilityMap.put(house,0);
        }        stringList = convertFacilityToString(house);
        WriteReadFile.writeFile(HOUSE_FILE_PATH, stringList, true);
    }
    @Override
    public void displayListMaintenance() {
        System.out.println("Danh sách dịch vụ cần bảo trì");
        for (Facility facility : listMaintenance) {
            System.out.println(facility);
        }
    }

    public Map<Facility, Integer> convertStringToFacility(){
        List<Villa> villaList = new ArrayList<>();
        List<String> stringVillaList = WriteReadFile.readFile(VILLA_FILE_PATH);
        List<String> stringHouseList = WriteReadFile.readFile(HOUSE_FILE_PATH);
        List<String> stringRoomList = WriteReadFile.readFile(ROOM_FILE_PATH);
        String[] arr;
        for (String line : stringVillaList) {
            arr = line.split(COMMA);
            Facility villa = new Villa(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]),arr[5],arr[6],Double.parseDouble(arr[7]),Integer.parseInt(arr[8]));
            if (facilityMap.containsKey(villa)){
                facilityMap.put(villa, facilityMap.get(villa));
            }else {
                facilityMap.put(villa,0);
            }
        }
        for (String line : stringHouseList) {
            arr = line.split(COMMA);
            Facility house = new House(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7]));
            if (facilityMap.containsKey(house)){
                facilityMap.put(house, facilityMap.get(house));
            }else {
                facilityMap.put(house,0);
            }
        }
        for (String line : stringRoomList) {
            arr = line.split(COMMA);
            Facility room = new Room(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),
                    Integer.parseInt(arr[4]),arr[5],arr[6]);
            if (facilityMap.containsKey(room)){
                facilityMap.put(room, facilityMap.get(room));
            }else {
                facilityMap.put(room,0);
            }
        }
        return facilityMap;
    }

    public List<String> convertFacilityToString(Facility facility){
        List<String> string = new ArrayList<>();
        if (facility instanceof Villa){
            Villa villa = (Villa) facility;
            string.add(villa.getMaDichVu() + COMMA + villa.getTenDichVu() + COMMA + villa.getDienTichSuDung() +
                        COMMA + villa.getChiPhiThue() + COMMA + villa.getSoLuongNguoi() + COMMA + villa.getKieuThue() +
                        COMMA + villa.getTieuChuanPhong() + COMMA + villa.getDienTichHoBoi() + COMMA + villa.getSoTang());
        }else if (facility instanceof Room){
            Room room = (Room) facility;
            string.add(room.getMaDichVu() + COMMA + room.getTenDichVu() + COMMA + room.getDienTichSuDung() +
                        COMMA + room.getChiPhiThue() + COMMA + room.getSoLuongNguoi() + COMMA + room.getKieuThue() +
                        COMMA + room.getDichVuDiKem());
        }else {
            House house = (House) facility;
            string.add(house.getMaDichVu() + COMMA + house.getTenDichVu() + COMMA + house.getDienTichSuDung() +
                        COMMA + house.getChiPhiThue() + COMMA + house.getSoLuongNguoi() + COMMA + house.getKieuThue() +
                        COMMA + house.getTieuChuanPhong() + COMMA + house.getSoTang());
        }
        return string;
    }

}
