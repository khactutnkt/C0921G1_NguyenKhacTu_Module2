package controllers;

import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public void displayMainMenu(){
        int choice;
        System.out.println("ok");
        while (true){
            System.out.println("Menu:\n" +
                    "1.\tEmployee Management\n"+
                    "2.\tCustomer Management\n"+
                    "3.\tFacility Management \n"+
                    "4.\tBooking Management\n"+
                    "5.\tPromotion Management\n"+
                    "6.\tExit\n");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
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
                    managePromotion();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public void manageEmployee(){
        System.out.println("Employee Management\n" +
                "1\tDisplay list employees\n"+
                "2\tAdd new employee\n"+
                "3\tEdit employee \n"+
                "4\tReturn main menu");
        int choiceEmp = Integer.parseInt(scanner.nextLine());
        switch (choiceEmp){
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

    public void manageCustomer(){
        System.out.println("Facility Management\n" +
                "1.\tDisplay list customers\n"+
                "2.\tAdd new customer\n"+
                "3.\tEdit customer\n"+
                "4.\tReturn main menu");
        int choiceCus = Integer.parseInt(scanner.nextLine());
        switch (choiceCus){
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

    public void manageFacility(){
        System.out.println("Customer Management\n" +
                "1\tDisplay list facility\n"+
                "2\tAdd new facility\n"+
                "3\tDisplay list facility maintenance\n"+
                "4\tReturn main menu");
        int choiceFac = Integer.parseInt(scanner.nextLine());
        switch (choiceFac){
            case 1:
                facilityService.displayList();
                break;
            case 2:
                facilityService.addNew();
                break;
        }
    }

    public void manageBooking(){
        System.out.println("Booking Managerment\n" +
                "1.\tAdd new booking\n"+
                "2.\tDisplay list booking\n"+
                "3.\tCreate new constracts\n"+
                "4.\\tDisplay list contracts\"\n"+
                "5.\tEdit contracts\n"+
                "6.\tReturn main menu");
    }

    public void managePromotion(){
        System.out.println("Promotion Management\n" +
                "1.\tDisplay list customers use service\n"+
                "2.\tDisplay list customers get voucher\n"+
                "3.\tReturn main menu");
    }
}
