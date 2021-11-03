package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 2.5, "blue");
        System.out.println(cylinder);
        System.out.println("Area: ");
        System.out.println("Perimeter: "+cylinder.getPerimeter());
        System.out.println("Thể tích: "+cylinder.getTheTich());
    }
}
