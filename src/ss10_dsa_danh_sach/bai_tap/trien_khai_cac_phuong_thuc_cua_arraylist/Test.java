package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(0,1);
        listInteger.add(1,2);
        listInteger.add(2,3);
        listInteger.add(3,4);
        listInteger.add(4,5);
//        listInteger.add(5,6);
listInteger.clear();

        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));;
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
        System.out.println(listInteger.get(4));
        System.out.println(listInteger.get(5));

        System.out.println("size: "+listInteger.getSize());

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("nguyen");
        arrayList.clone();
//        System.out.println(listInteger.contains(2));
//        System.out.println(listInteger.indexOf(2));
//        System.out.println(listInteger.indexOf(0));
//        listInteger.remove(1);
//        System.out.println(listInteger.get(0));
//        System.out.println(listInteger.get(1));;
//        System.out.println(listInteger.get(2));
//        System.out.println("size: "+listInteger.getSize());
//        System.out.println(listInteger.contains(1));
//        System.out.println(listInteger.contains(2));
//        System.out.println(listInteger.get(0));
//        System.out.println(listInteger.get(1));;
//        System.out.println(listInteger.get(2));
    }
}
