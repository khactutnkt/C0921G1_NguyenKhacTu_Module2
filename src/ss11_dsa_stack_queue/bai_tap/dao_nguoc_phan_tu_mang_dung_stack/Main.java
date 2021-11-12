package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_mang_dung_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        Stack<Integer> stack = new Stack<>();
        for (int x : arr){
            stack.push(x);
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = stack.pop();
        }
        for (int x : arr){
            System.out.print(x +"\t");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String words = scanner.nextLine();
        Stack<String> wStack = new Stack<>();
        System.out.println(words);
        String[] arrStr = words.split(" ");
        for (String s : arrStr) {
            wStack.push(s);
        }
        String result = "";
        for (int i = 0; i < arrStr.length; i++) {
            result += wStack.pop()+" ";
        }
        System.out.println(result);
    }
}
