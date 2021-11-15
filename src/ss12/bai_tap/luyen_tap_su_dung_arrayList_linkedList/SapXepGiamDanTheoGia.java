package ss12.bai_tap.luyen_tap_su_dung_arrayList_linkedList;

import java.util.Comparator;

public class SapXepGiamDanTheoGia implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
