package bai_tap_cuoi_tuan_candidate.service;

import bai_tap_cuoi_tuan_candidate.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternImpl implements CandidateServices {
    static List<Intern> internList = new ArrayList<>();
    static {
        internList.add(new Intern("ex01", "Nguyen", "Nghia",2002, "Da Nang",
                "033858585","nguyennghia@gmail.com",2,"DTVT", 8, "BKDN" ));
        internList.add(new Intern("ex01", "Le", "Linh",2002, "Hue",
                "033858585","lelinhh@gmail.com",2,"DTVT", 8, "BKDN" ));
        internList.add(new Intern("ex01", "Nguyen", "An",2001, "Da Nang",
                "033858585","nguyenan@gmail.com",2,"DTVT", 9, "BKDN" ));
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Intern intern : internList) {
            System.out.println(intern);
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
        int cadidateType = 2;
        System.out.println("Enter majors:");
        String majors = scanner.nextLine();
        System.out.println("Enter semester:");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter university:");
        String university = scanner.nextLine();
        Intern intern = new Intern(id, firstName, lastName, birthDate, address, phone, email,
                cadidateType, majors, semester, university);
        internList.add(intern);
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id ứng viên muốn cập nhật");
        String id = scanner.nextLine();
        Boolean flag = true;
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getId().equals(id)){
                System.out.println("Enter first name:");
                internList.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter last name:");
                internList.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birth date:");
                internList.get(i).setBirthDate(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter address:");
                internList.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone:");
                internList.get(i).setPhone(scanner.nextLine());
                System.out.println("Enter email:");
                internList.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter majors:");
                internList.get(i).setMajors(scanner.nextLine());
                System.out.println("Enter semester:");
                internList.get(i).setSemester(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter university:");
                internList.get(i).setUniversity(scanner.nextLine());
                flag = flag;
            }
        }
        if (flag){
            System.out.println("Id không tồn tại");
        }
    }

    @Override
    public void search(String name) {
        for (Intern intern : internList) {
            if (intern.getFirstName().toLowerCase().contains(name.toLowerCase()) || intern.getLastName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(intern.getFirstName() + " " + intern.getLastName() + " || " +intern.getBirthDate() +
                        " || " + intern.getAddress() + " || " + intern.getPhone() + " || "+ intern.getEmail());
            }
        }
    }
}
