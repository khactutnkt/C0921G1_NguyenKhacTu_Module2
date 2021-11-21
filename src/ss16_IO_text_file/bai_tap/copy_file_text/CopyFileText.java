package ss16_IO_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static final String SOURCE_FILE = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\source.txt";
    public static final String TARGET_FILE = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\target.txt";
    public static String readFile(FileReader fileReader){
        int i=0;
        String result = "";
        try {
            while ((i = fileReader.read()) != -1){
                result += (char) i;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void writeFile(FileWriter fileWriter, String result){
        try {
            fileWriter.write(result);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        File fileSource = new File(SOURCE_FILE);
        File fileTarget = new File(TARGET_FILE);
        String result;
        try {
            FileReader fileReader = new FileReader(fileSource);
            FileWriter fileWriter = new FileWriter(fileTarget);
            result = readFile(fileReader);
            writeFile(fileWriter, result);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
