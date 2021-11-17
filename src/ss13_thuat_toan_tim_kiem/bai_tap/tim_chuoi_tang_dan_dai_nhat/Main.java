package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_dai_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = scanner.nextLine();
        LinkedList<Character> result = new LinkedList<>();
        LinkedList<Character> subString;
        for (int i = 0; i < string.length(); i++) {
            subString = new LinkedList<>();
            subString.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(j) > subString.getLast()){
                    subString.add(string.charAt(j));
                }
            }
            if (subString.size() > result.size()){
                result = subString;
            }
        }
        System.out.print("Chuỗi tăng dần dài nhất: ");
        for (Character c : result){
            System.out.print(c);
        }
    }
}
