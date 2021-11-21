package bai_tap_cuoi_tuan_candidate.controllers;

import bai_tap_cuoi_tuan_candidate.service.ExperienceImpl;
import bai_tap_cuoi_tuan_candidate.service.FresherImpl;
import bai_tap_cuoi_tuan_candidate.service.InternImpl;

import java.util.Scanner;

public class CandidateManager {
    ExperienceImpl experience = new ExperienceImpl();
    FresherImpl fresher = new FresherImpl();
    InternImpl intern = new InternImpl();
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        int choice = 0;
        while (true){
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    experienceManager();
                    break;
                case 2:
                    fresherManager();
                    break;
                case 3:
                    internManager();
                    break;
                case 4:
                    searchCandidate();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public void experienceManager(){
        int choice2 = 0;
        while (choice2!=4){
            System.out.println("Experience Candidate Manager");
            System.out.println("1. display");
            System.out.println("2. add");
            System.out.println("3. edit");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng:");
            choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2){
                case 1:
                    experience.display();
                    break;
                case 2:
                    String check = "yes";
                    while ("yes".equals(check)){
                        experience.add();
                        System.out.println("Nhập 'yes' để tiếp tục thêm mới, nhập 'no' để dừng");
                        check = scanner.nextLine();
                    }
                    experience.display();
                    break;
                case 3:
                    experience.edit();
                    break;
                case 4:
                    break;
            }
        }
    }

    public void fresherManager(){
        int choice2 = 0;
        while (choice2!=4){
            System.out.println("Fresher Candidate Manager");
            System.out.println("1. display");
            System.out.println("2. add");
            System.out.println("3. edit");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng:");
            choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2){
                case 1:
                    fresher.display();
                    break;
                case 2:
                    String check = "yes";
                    while ("yes".equals(check)){
                        fresher.add();
                        System.out.println("Nhập 'yes' để tiếp tục thêm mới, nhập 'no' để dừng");
                        check = scanner.nextLine();
                    }
                    fresher.display();
                    break;
                case 3:
                    fresher.edit();
                    break;
                case 4:
                    break;
            }
        }
    }

    public void internManager(){
        int choice2 = 0;
        while (choice2!=4){
            System.out.println("Intern Candidate Manager");
            System.out.println("1. display");
            System.out.println("2. add");
            System.out.println("3. edit");
            System.out.println("4. Exit");
            System.out.println("Chọn chức năng:");
            choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2){
                case 1:
                    intern.display();
                    break;
                case 2:
                    String check = "yes";
                    while ("yes".equals(check)){
                        intern.add();
                        System.out.println("Nhập 'yes' để tiếp tục thêm mới, nhập 'no' để dừng");
                        check = scanner.nextLine();
                    }
                    intern.display();
                    break;
                case 3:
                    intern.edit();
                    break;
                case 4:
                    break;
            }
        }
    }

    public void searchCandidate(){
        System.out.println("Nhập vào tên muốn tìm kiếm:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào loại ứng viên (0, 1 hoặc 2):");
        int candidateType = Integer.parseInt(scanner.nextLine());
        switch (candidateType){
            case 0:
                experience.search(name);
                break;
            case 1:
                fresher.search(name);
                break;
            case 2:
                intern.search(name);
                break;

        }
    }
}
