package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        ArrayList<Employee> arrayListOutput = new ArrayList<>();
            arrayList.add(new Employee("Nguyễn văn A", "nam", "21/10/2000"));
            arrayList.add(new Employee("Nguyễn văn B", "nam", "11/11/1998"));
            arrayList.add(new Employee("Nguyễn Hiền", "nữ", "21/01/2001"));
            arrayList.add(new Employee("Nguyễn văn A", "nam", "21/10/2000"));
            arrayList.add(new Employee("nguyễn Thu Hiền", "nữ", "16/06/1998"));
            arrayList.add(new Employee("Nguyễn Thảo Nhi", "nữ", "10/10/1998"));
            arrayList.add(new Employee("Nguyễn văn C", "nam", "21/10/2002"));

        Collections.sort(arrayList, new CompareNgaySinh());
        for (Employee e : arrayList) {
            System.out.println(e);
        }
        Queue<Employee> nam = new LinkedList<>();
        Queue<Employee> nu = new LinkedList<>();

        for (Employee employee : arrayList){
            if (employee.getGioiTinh().equals("nam")){
                nam.add(employee);
            }else {
                nu.add(employee);
            }
        }
        while (!nu.isEmpty()){
            arrayListOutput.add(nu.poll());
        }
        while (!nam.isEmpty()){
            arrayListOutput.add(nam.poll());
        }
        System.out.println("Sau khi tổ chức lại dữ liệu");
        for (Employee e : arrayListOutput) {
            System.out.println(e);
        }
    }




}
