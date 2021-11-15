package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan_dai_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = scanner.nextLine();
        String result = string.charAt(0)+"";
        String tempString =result;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) >= string.charAt(i-1)){
                tempString += string.charAt(i);
            }else {
                if (result.length()<=tempString.length()){
                    result = tempString;
                }
                tempString = string.charAt(i)+"";
            }
        }
        if (result.length()<=tempString.length()){
            result = tempString;
        }
        System.out.println("Chuỗi tăng dần dài nhất: "+result);
    }
}
