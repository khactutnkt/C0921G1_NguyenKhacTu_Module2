package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setXY(1.5f,2.2f);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setXYZ(1,1,1);
        System.out.println(point2D);
    }
}
