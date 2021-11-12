package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_hop_ly;

import java.util.Comparator;

public class CompareNgaySinh implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        String[] str1 = o1.getNgaySinh().split("/");
        String[] str2 = o2.getNgaySinh().split("/");
        String ngaySinh1 = "";
        String ngaySinh2 = "";
        for (int i = str1.length-1; i >=0; i--) {
            ngaySinh1 += str1[i];
            ngaySinh2 += str2[i];
        }
        return ngaySinh1.compareTo(ngaySinh2);
    }
}
