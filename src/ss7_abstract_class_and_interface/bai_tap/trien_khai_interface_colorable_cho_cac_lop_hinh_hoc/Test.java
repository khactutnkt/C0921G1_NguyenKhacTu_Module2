package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle1();
        shapes[1] = new Rectangle1(2,2);
        shapes[2] = new Square1(2.5);
        for (Shape sh : shapes){
            System.out.println(sh);
            System.out.println("Area: "+sh.getArea());

            if (sh instanceof Square1){
                Colorable colorable = (Square1) sh;
                colorable.howToColor();
            }
            System.out.println("---------------------------");
        }
    }
}
