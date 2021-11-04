package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square1 extends ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square implements Colorable {
    public Square1(double side){
        super(side);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
