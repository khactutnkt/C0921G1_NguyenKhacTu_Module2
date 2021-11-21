package ss16_IO_text_file.thuc_hanh.tim_max_va_ghi_ra_file;

import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(path);
        int maxValue = findMax(numbers);
        System.out.println("Nhập đường dẫn file ghi: ");
        String writePath = scanner.nextLine();
        readAndWriteFile.writeFile(writePath, maxValue);
    }
}
