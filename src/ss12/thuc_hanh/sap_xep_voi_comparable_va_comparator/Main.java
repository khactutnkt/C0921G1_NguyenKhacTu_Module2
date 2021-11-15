package ss12.thuc_hanh.sap_xep_voi_comparable_va_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien", 30, "HT");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT" );
        Student student4 = new Student("Tung", 38, "HT" );
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        System.out.println("so sánh theo tên:");
        Collections.sort(lists);
        for (Student student : lists) {
            System.out.println(student);
        }
        System.out.println("so sánh theo tuổi:");
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        for (Student student : lists) {
            System.out.println(student);
        }
    }
}
