package ss7_abstract_class_and_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Rectangle extends ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth()*(percent+100)/100);
        this.setHeight(this.getHeight()*(percent+100)/100);
    }
}
