package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.resize(10);
        System.out.println(circle);

        System.out.println("------------------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.resize(20);
        System.out.println(rectangle);

        System.out.println("--------------------");
        Square square = new Square();
        System.out.println(square);
        square.resize(30);
        System.out.println(square);

//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle();
//        shapes[1] = new Rectangle();
//        shapes[2] = new Square();
//        for (Shape sh : shapes){
//            System.out.println(sh);
//            sh.resiz
//        }
    }
}
