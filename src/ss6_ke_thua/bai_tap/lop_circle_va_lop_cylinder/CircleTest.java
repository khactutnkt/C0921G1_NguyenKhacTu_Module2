package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5, "red");
        System.out.println(circle);
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeter: "+circle.getPerimeter());
    }
}
