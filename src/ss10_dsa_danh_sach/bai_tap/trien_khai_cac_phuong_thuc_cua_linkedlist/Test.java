package ss10_dsa_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.printList();
        myLinkedList.addFirst("nguyen");
        myLinkedList.addFirst("khac");
        myLinkedList.addFirst("tu");
        myLinkedList.addFirst("sinh");
        myLinkedList.add(2,"vien");
        myLinkedList.add(5,"16DT2");
        myLinkedList.printList();
        System.out.println("----------");

        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.remove("tu"));
        System.out.println(myLinkedList.contains(17));
        System.out.println(myLinkedList.indexOf(555));
        System.out.println(myLinkedList.get(5));
        myLinkedList.add(0,11);
        myLinkedList.remove(0);
        System.out.println("----------------------");
        myLinkedList.printList();
    }
}
