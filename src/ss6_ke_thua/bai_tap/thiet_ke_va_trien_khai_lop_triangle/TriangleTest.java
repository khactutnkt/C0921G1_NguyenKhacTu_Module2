package ss6_ke_thua.bai_tap.thiet_ke_va_trien_khai_lop_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(3,4,5,"blue",false);
        System.out.println(triangle1);
        System.out.println("Chu vi: "+triangle1.getPerimeter());
        System.out.println("Dien tich: "+triangle1.getArea());
    }
}
