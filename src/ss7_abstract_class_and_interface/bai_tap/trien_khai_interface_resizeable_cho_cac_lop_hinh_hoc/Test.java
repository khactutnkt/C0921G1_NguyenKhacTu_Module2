package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(4,3);
        shapes[2] = new Square();
        for (Shape sh : shapes){
            if (sh instanceof Circle){
                Circle shape = (Circle) sh;
                System.out.println("Area before: "+shape.getArea());
                shape.resize(Math.random()*99 + 1);
                System.out.println("Area after: "+shape.getArea());
            }else if (sh instanceof Rectangle){
                Rectangle shape = (Rectangle) sh;
                System.out.println("Area before: "+shape.getArea());
                shape.resize(Math.random()*99 + 1);
                System.out.println("Area after: "+shape.getArea());
            }else if (sh instanceof Square){
                Square shape = (Square) sh;
                System.out.println("Area before: "+shape.getArea());
                shape.resize(Math.random()*99 + 1);
                System.out.println("Area after: "+shape.getArea());
            }
            System.out.println(sh+"\n----------------------------");
        }
    }
}
