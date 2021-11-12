package ss11_dsa_stack_queue.bai_tap.chuyen_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Integer number;
        Stack<Integer> stack = new Stack<>();
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân");
        number = scanner.nextInt();
        while (number!=0){
            stack.push(number%2);
            number/=2;
        }
        while (!stack.empty()){
            result += stack.pop();
        }
        System.out.println("Hệ nhị phân: " +result);
    }
}
