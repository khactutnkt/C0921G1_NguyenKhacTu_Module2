package ss17_io_binary_file_and_serialization.bai_tap.quan_ly_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String brand;
    private double price;
    private String descriptions;

    public Product() {
    }

    public Product(String id, String name, String brand, double price, String descriptions) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.descriptions = descriptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + id + '\'' +
                ", productName='" + name + '\'' +
                ", productBrand='" + brand + '\'' +
                ", productPrice=" + price +
                ", productDescription='" + descriptions + '\'' +
                '}';
    }
}
