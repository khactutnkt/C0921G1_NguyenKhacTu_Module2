package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arrayList_linkedList;

public class Product {
    private String name;
    private String id;
    private int price;
    public Product(){}

    public Product(String name, String id, int quantity) {
        this.name = name;
        this.id = id;
        this.price = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", quantity=" + price +
                '}';
    }
}