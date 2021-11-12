package controller;

import service.VehicleService;
import service.VehicleServiceImpl;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    VehicleService vehicleService = new VehicleServiceImpl();
    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Thêm mới phương tiện \n" +
                    "2. Hiển thị phương tiện \n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Chọn loại muốn thêm: \n" +
                            "1. Thêm xe tải \n"+
                            "1. Thêm xe ô tô \n"+
                            "1. Thêm xe máy");
                    int choiceAdd = Integer.parseInt(scanner.nextLine());
                    vehicleService.addVehicle(choiceAdd);
                    break;
                case 2:
                    System.out.println("Chọn loại muốn hiển thị: \n" +
                            "1. Hiển thị xe tải \n"+
                            "1. Hiển thị xe ô tô \n"+
                            "1. Hiển thị xe máy");
                    int choiceDisplay = Integer.parseInt(scanner.nextLine());
                    vehicleService.displayVehicle(choiceDisplay);
                    break;
                case 3:
                    vehicleService.deleteVehicle();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
