package bai_tap_cuoi_tuan_candidate.service;

import bai_tap_cuoi_tuan_candidate.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceImpl implements CandidateServices {
    static List<Experience> experienceList = new ArrayList<>();
    public static final String EXPERIENCE_FILE = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\" +
            "bai_tap_cuoi_tuan_candidate\\file_candidate_list\\experienceListFile";
    static {
        experienceList.add(new Experience("ex01", "Nguyen", "An", 1998, "Da Nang",
                "033858585","nguyenminh@gmail.com",0,3,"java"));
        experienceList.add(new Experience("ex02", "Nguyen", "Hien", 1998, "Da Nang",
                "033858585","nguyenhien@gmail.com",0,2,"c++"));
        experienceList.add(new Experience("ex03", "Nguyen", "Trang", 1998, "Da Nang",
                "033858585","nguyentrangg@gmail.com",0,2,"java"));

    }
    Scanner scanner = new Scanner(System.in);

//    public void writeExperienceFile(List<Experience> experienceList){
//        File file = new File(EXPERIENCE_FILE);
//        FileWriter fileWriter;
//        BufferedWriter bufferedWriter = null;
//        for (Experience exp : experienceList) {
//            try {
//                fileWriter = new FileWriter(file, true);
//                bufferedWriter = new BufferedWriter(fileWriter);
//                bufferedWriter.write(exp.getId() + "," + exp.getFirstName() + "," + exp.getLastName() + "," +
//                        exp.getBirthDate() + "," + exp.getAddress() + "," + exp.getPhone() + "," +
//                        exp.getEmail() + "," + exp.getCandidateType() + "," + exp.getExpInYear() + "," +exp.getProSkill() +"\n");
//                bufferedWriter.flush();
//            }catch (IOException e){
//                e.printStackTrace();
//            }finally {
//                try {
//                    if (bufferedWriter != null) {
//                        bufferedWriter.close();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }

    @Override
    public void display() {
        for (Experience experience : experienceList){
            System.out.println(experience);
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
        int cadidateType = 0;
        System.out.println("Enter expInYear:");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter graduation proSkill:");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(id, firstName, lastName, birthDate,
                address, phone, email, cadidateType,expInYear, proSkill);
        experienceList.add(experience);
//        writeExperienceFile(experienceList);

    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id ứng viên muốn cập nhật");
        String id = scanner.nextLine();
        Boolean flag = true;
        for (int i = 0; i < experienceList.size(); i++) {
            if (experienceList.get(i).getId().equals(id)){
                System.out.println("Enter first name:");
                experienceList.get(i).setFirstName(scanner.nextLine());
                System.out.println("Enter last name:");
                experienceList.get(i).setLastName(scanner.nextLine());
                System.out.println("Enter birth date:");
                experienceList.get(i).setBirthDate(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter address:");
                experienceList.get(i).setAddress(scanner.nextLine());
                System.out.println("Enter phone:");
                experienceList.get(i).setPhone(scanner.nextLine());
                System.out.println("Enter email:");
                experienceList.get(i).setEmail(scanner.nextLine());
                System.out.println("Enter expInYear:");
                experienceList.get(i).setExpInYear(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter graduation proSkill:");
                experienceList.get(i).setProSkill(scanner.nextLine());
                flag = flag;
            }
        }
        if (flag){
            System.out.println("Id không tồn tại");
        }
    }

    @Override
    public void search(String name) {
        for (Experience exp : experienceList) {
            if (exp.getFirstName().toLowerCase().contains(name.toLowerCase()) || exp.getLastName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(exp.getFirstName() + " " + exp.getLastName() + " || " +exp.getBirthDate() +
                        " || " + exp.getAddress() + " || " + exp.getPhone() + " || "+ exp.getEmail());
            }
        }
    }
}
