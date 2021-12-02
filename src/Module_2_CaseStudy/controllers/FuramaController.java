package controllers;

import services.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    BookingServiceImpl bookingService = new BookingServiceImpl();
    ContractServiceImpl contractService = new ContractServiceImpl();
    PromotionServiceImpl promotionService = new PromotionServiceImpl();

    public void displayMainMenu() {
        while (true) {
            try {
                int choice;
                System.out.println("ok");
                while (true) {
                    System.out.println("Menu:\n" +
                            "1.\tEmployee Management\n" +
                            "2.\tCustomer Management\n" +
                            "3.\tFacility Management \n" +
                            "4.\tBooking Management\n" +
                            "5.\tContract Management\n" +
                            "6.\tPromotion Management\n" +
                            "7.\tExit\n");
                    choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            manageEmployee();
                            break;
                        case 2:
                            manageCustomer();
                            break;
                        case 3:
                            manageFacility();
                            break;
                        case 4:
                            manageBooking();
                            break;
                        case 5:
                            manageContract();
                            break;
                        case 6:
                            managePromotion();
                            break;
                        case 7:
                            System.exit(0);
                        default:
                            System.out.println("Lỗi. Yêu cầu chọn theo menu");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi. Yêu cầu chọn theo menu");
            }
        }
    }

    public void manageEmployee() {
        System.out.println("Employee Management\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee \n" +
                "4\tReturn main menu");
        int choiceEmp = Integer.parseInt(scanner.nextLine());
        switch (choiceEmp) {
            case 1:
                employeeService.displayList();
                break;
            case 2:
                employeeService.addNew();
                break;
            case 3:
                employeeService.editEmployee();
                break;
            case 4:
                break;
        }
    }

    public void manageCustomer() {
        System.out.println("Facility Management\n" +
                "1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tReturn main menu");
        int choiceCus = Integer.parseInt(scanner.nextLine());
        switch (choiceCus) {
            case 1:
                customerService.displayList();
                break;
            case 2:
                customerService.addNew();
                break;
            case 3:
                customerService.editCustomer();
                break;
            case 4:
                break;
        }
    }

    public void manageFacility() {
        System.out.println("Customer Management\n" +
                "1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tReturn main menu");
        int choiceFac = Integer.parseInt(scanner.nextLine());
        switch (choiceFac) {
            case 1:
                facilityService.displayList();
                break;
            case 2:
                facilityService.addNew();
                break;
            case 3:
                facilityService.displayListMaintenance();
                break;
            case 4:
                break;
        }
    }

    public void manageBooking() {
        System.out.println("Booking Management\n" +
                "1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu");
        int choiceBooking = Integer.parseInt(scanner.nextLine());
        switch (choiceBooking) {
            case 1:
                bookingService.addNew();
                break;
            case 2:
                bookingService.displayList();
                break;
            case 3:
                bookingService.createNewContracts();
                break;
            case 4:
                bookingService.displayListContracts();
                break;
            case 5:
                bookingService.editContracts();
                break;
            case 6:
                break;
        }

    }

    public void manageContract(){
        System.out.println("Customer Management\n" +
                "1\tDisplay list contracts\n" +
                "2\tAdd new contract\n" +
                "3\tReturn main menu");
        int choiceContract = Integer.parseInt(scanner.nextLine());
        switch (choiceContract) {
            case 1:
                contractService.displayList();
                break;
            case 2:
                contractService.addNew();
                break;
            case 3:
                break;
        }
    }

    public void managePromotion() {
        System.out.println("Promotion Management\n" +
                "1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu");
        int choicePromotion = Integer.parseInt(scanner.nextLine());
        switch (choicePromotion) {
            case 1:
                promotionService.displayCustomerUsedPromotionService();
                break;
            case 2:
                promotionService.getVoucher();
                break;
            case 3:
                break;
        }
    }
}
