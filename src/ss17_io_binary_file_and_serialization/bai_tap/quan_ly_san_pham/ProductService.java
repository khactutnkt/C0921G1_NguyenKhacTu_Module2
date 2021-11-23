package ss17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    public void addProduct() {
        System.out.println("Enter the id");
        String id = scanner.nextLine();
        System.out.println("Enter the name of product");
        String name = scanner.nextLine();
        System.out.println("Enter the brand of product");
        String brand = scanner.nextLine();
        System.out.println("Enter the price");
        double price = scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("Enter the description of product");
        String desc = scanner.nextLine();
        productList.add(new Product(id, name, brand, price, desc));
    }

    public void displayProduct() {
        for (Product li : productList) {
            System.out.println(li);
        }
    }

    public void searchProduct() {
        System.out.println("Enter the name of product");
        String input = scanner.nextLine();
        for (Product li : productList) {
            if (li.getName().toLowerCase().contains(input)) {
                System.out.println(li);
            }
        }
    }

    public static final String FILE_NHI_PHAN = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\ss17_io_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham\\productNhiPhan";

    public void writeFile() {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_NHI_PHAN);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Product li : productList) {
                objectOutputStream.writeObject(li);
            }
            System.out.println("Write Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        File file = new File(FILE_NHI_PHAN);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static final String FILE_CSV = "D:\\Codegym\\C0921G1_NguyenKhacTu_Module2\\src\\ss17_io_binary_file_and_serialization\\bai_tap\\quan_ly_san_pham\\products";
    final String COMMA = ",";

    public void writeFileCSV() {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(FILE_CSV);
            fileWriter = new FileWriter(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product li : productList) {
                bufferedWriter.write(li.getId() + COMMA + li.getName() + COMMA + li.getBrand() + COMMA + li.getPrice() + COMMA + li.getDescriptions());
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
