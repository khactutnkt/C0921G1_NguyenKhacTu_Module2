package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_moi_tu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String string = scanner.nextLine();
        demSoLanXuatHienCuaTu(string);
    }

    public static void demSoLanXuatHienCuaTu(String string){
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] arr = string.toLowerCase().split(" ");
        for (String element : arr) {
            if (!"".equals(element)) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1);
                }
                else {
                    map.put(element, 1);
                }
            }
        }
        System.out.println("Số lần xuất hiện của mỗi từ trong chuỗi: ");
        for (String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
