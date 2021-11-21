package bai_tap_cuoi_tuan_candidate.service;

import bai_tap_cuoi_tuan_candidate.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherImpl implements CandidateServices {
    static List<Fresher> fresherList = new ArrayList<>();
    static {
        fresherList.add(new Fresher("fr01", "Nguyen", "Minh", 1998, "Da Nang",
                "033858585","nguyenminh@gmail.com",1,2020,"gioi","BKDN"));
        fresherList.add(new Fresher("fr02", "Le", "Tran", 1997, "Da Nang",
                "0333333333","letran@gmail.com",1,2020,"gioi","BKDN"));

        fresherList.add(new Fresher("fr01", "Nguyen", "Nhan", 1998, "Da Nang",
                "0344444444","nguyennhan@gmail.com",1,2019,"kha","BKDN"));
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Fresher fresher : fresherList){
            System.out.println(fresher);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter Candidate Id:");
        String id = scanner.nextLine();
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter birth date:");
        int birthDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        int cadidateType = 1;
        System.out.println("Enter graduation date:");
        int graduation_date = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter graduation rank:");
        String graduation_rank = scanner.nextLine();
        System.out.println("Enter education:");
        String education = scanner.nextLine();
        Fresher fresher = new Fresher(id, firstName, lastName, birthDate,
                address, phone, email, cadidateType, graduation_date, graduation_rank,education);
        fresherList.add(fresher);
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id ứng viên muốn cập nhật");
        String id = scanner.nextLine();
        Boolean flag = true;
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getId().equals(id)){
                System.out.println("Enter first name:");
                fresherList.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter last name:");
                fresherList.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birth date:");
                fresherList.get(i).setBirthDate(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter address:");
                fresherList.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone:");
                fresherList.get(i).setPhone(scanner.nextLine());
                System.out.println("Enter email:");
                fresherList.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter graduation date:");
                fresherList.get(i).setGraduation_date(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter graduation rank:");
                fresherList.get(i).setGraduation_rank(scanner.nextLine());
                System.out.println("Enter education:");
                fresherList.get(i).setEducation(scanner.nextLine());
                flag = flag;
            }
        }
        if (flag){
            System.out.println("Id không tồn tại");
        }
    }

    @Override
    public void search(String name) {
        for (Fresher fresher : fresherList) {
            if (fresher.getFirstName().toLowerCase().contains(name.toLowerCase()) || fresher.getLastName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(fresher.getFirstName() + " " + fresher.getLastName() + " || " +fresher.getBirthDate() +
                        " || " + fresher.getAddress() + " || " + fresher.getPhone() + " || "+ fresher.getEmail());
            }
        }
    }
}
