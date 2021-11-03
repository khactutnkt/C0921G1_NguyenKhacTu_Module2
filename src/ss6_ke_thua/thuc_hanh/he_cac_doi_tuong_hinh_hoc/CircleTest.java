package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(1.75);
        System.out.println(circle);

        circle = new Circle(17.5, "yellow", false);
        System.out.println(circle);
    }
}
