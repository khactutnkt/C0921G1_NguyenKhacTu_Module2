package ss16_IO_text_file.bai_tap.doc_file_cvs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String SOURCE_FILE = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\ss16_IO_text_file\\bai_tap\\doc_file_cvs\\country";
    static List<Country> countryList = new ArrayList<>();
    public static void readLine(){
        BufferedReader bufferedReader = null;
        File file = new File(SOURCE_FILE);
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null){
                temp = line.split(",");
                Country country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readLine();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
