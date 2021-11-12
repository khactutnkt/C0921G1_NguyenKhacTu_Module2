package service;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleServiceImpl implements VehicleService{
    static ArrayList<Car> carsList = new ArrayList<Car>();
    static ArrayList<Truck> trucksList = new ArrayList<Truck>();
    static ArrayList<Bicycle> bicyclesList = new ArrayList<Bicycle>();
    static ArrayList<HangSanXuat> hangSanXuats = new ArrayList<HangSanXuat>();

    {
        hangSanXuats.add(new HangSanXuat("HSX-001","Yamaha","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-002","Honda","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-003","Dongfeng","Trung Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004","Huyndai","Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-005","Ford","Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Toyota","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-007","Hino","Nhật Bản"));

        trucksList.add(new Truck("43C-012.34","Huyndai",
                2019,"Nguyễn Văn A",3));
        trucksList.add(new Truck("43C-47.678","Dongfeng",
                2020 ,"Nguyễn Văn B",9));
        trucksList.add(new Truck("43C-45.235","Hino",
                2021,"Nguyễn Văn C",12));

        carsList.add(new Car("43A-212.56","Toyota",
                2019,"Nguyễn Văn A","du lịch",5));
        carsList.add(new Car("43B-453.88","Huyndai",
                2020,"Nguyễn Văn B","xe khách",45));
        carsList.add(new Car("43B-453.89","Ford",
                2021,"Nguyễn Văn C","xe khách",16));

        bicyclesList.add(new Bicycle("43-K1-678.56","Yamaha",
                2019,"Nguyễn Văn A",100));
        bicyclesList.add(new Bicycle("43-H1-345.89","Honda",
                2019,"Nguyễn Văn B",150));
        bicyclesList.add(new Bicycle("43-AK-765.23","Yamaha",
                2021,"Nguyễn Văn C",125));

    }
    Scanner scanner = new Scanner(System.in);

    public String chonHangSanXuat(){
        System.out.println("Chọn hãng sản xuất, nhập số thứ tự để chọn: \n"+
                "1. HSX-001,Yamaha,Nhật Bản\n" +
                "2. HSX-002,Honda,Nhật Bản\n" +
                "3. HSX-003, Dongfeng,Trung Quốc\n" +
                "4. HSX-004, Huyndai,Hàn Quốc\n" +
                "5. HSX-005, Ford,Mỹ\n" +
                "6. HSX-006, Toyota,Nhật Bản\n" +
                "7. HSX-006, Hino,Nhật Bản");
        int choice = Integer.parseInt(scanner.nextLine());
        return hangSanXuats.get(choice-1).getTenHangSX();
    }

    @Override
    public void addVehicle(int choiceAdd) {
        System.out.println("Nhập vào BKS:");
        String bienKiemSoat = scanner.nextLine();
        String hangSanXuat = chonHangSanXuat();
        System.out.println("Nhập vào năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên chủ sở hữu:");
        String tenChuSoHuu = scanner.nextLine();
        switch (choiceAdd){
            case 1:
                System.out.println("Nhập vào trọng tải:");
                int trongTai = Integer.parseInt(scanner.nextLine());
                Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu, trongTai);
                trucksList.add(truck);
                break;
            case 2:
                System.out.println("Nhập vào số chỗ ngồi:");
                int soChoNgoi = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào kiểu xe:");
                String kieuXe = scanner.nextLine();
                Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu, kieuXe, soChoNgoi);
                carsList.add(car);
                break;
            case 3:
                System.out.println("Nhập vào công suất:");
                int congSuat = Integer.parseInt(scanner.nextLine());
                Bicycle bicycle = new Bicycle(bienKiemSoat, hangSanXuat, namSanXuat, tenChuSoHuu, congSuat);
                bicyclesList.add(bicycle);
                break;
        }

    }

    @Override
    public void displayVehicle(int choiceDisplay) {
        switch (choiceDisplay){
            case 1:
                disPlayTruck();
                break;
            case 2:
                disPlayCar();
                break;
            case 3:
                disPlayBicycle();
                break;
        }
    }
    public void disPlayTruck(){
        for (Truck truck : trucksList) {
            System.out.println(truck.toString());
        }
    }
    public void disPlayCar(){
        for (Car car : carsList) {
            System.out.println(car.toString());
        }
    }
    public void disPlayBicycle(){
        for (Bicycle bicycle : bicyclesList) {
            System.out.println(bicycle.toString());
        }
    }

    @Override
    public void deleteVehicle() {
        boolean flag = false;
        System.out.println("Nhập vào biển kiểm soát");
        String bienKS = scanner.nextLine();

        for (int i = 0; i <trucksList.size(); i++) {
            if (trucksList.get(i).getBienKiemSoat().equals(bienKS)){
                System.out.println("Nhập vào 'yes' để xóa, nhập 'no' để quay lại");
                String confirm = scanner.nextLine();
                if (confirm.equals("yes")){
                    trucksList.remove(i);
                    flag = true;
                    System.out.println("Đã xóa thành công");
                }else if (confirm.equals("no")){
                    break;
                }
            }
        }
        for (int i = 0; i <carsList.size(); i++) {
            if (carsList.get(i).getBienKiemSoat().equals(bienKS)){
                System.out.println("Nhập vào 'yes' để xóa, nhập 'no' để quay lại");
                String confirm = scanner.nextLine();
                if (confirm.equals("yes")){
                    carsList.remove(i);
                    flag = true;
                    System.out.println("Đã xóa thành công");
                }else if (confirm.equals("no")){
                    break;
                }
            }
        }
        for (int i = 0; i <bicyclesList.size(); i++) {
            if (bicyclesList.get(i).getBienKiemSoat().equals(bienKS)){
                System.out.println("Nhập vào 'yes' để xóa, nhập 'no' để quay lại");
                String confirm = scanner.nextLine();
                if (confirm.equals("yes")){
                    bicyclesList.remove(i);
                    flag = true;
                    System.out.println("Đã xóa thành công");
                }else if (confirm.equals("no")){
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy biển kiểm soát bạn muốn xóa");
        }
    }

}
