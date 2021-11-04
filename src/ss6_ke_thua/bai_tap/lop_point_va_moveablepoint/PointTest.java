package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(1,2);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint.setXY(1,3);
        moveablePoint.setSpeed(3,4);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
