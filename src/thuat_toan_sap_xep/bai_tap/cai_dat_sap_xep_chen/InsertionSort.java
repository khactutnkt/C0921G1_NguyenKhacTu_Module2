package thuat_toan_sap_xep.bai_tap.cai_dat_sap_xep_chen;

public class InsertionSort {
    static int[] list = {1,8,4,2,10,-9,15,11};

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i-1; j >= 0 && list[j] > currentElement; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Danh sách đã được sắp xếp: ");
        for (int x : list){
            System.out.print(x + "\t");
        }
    }
}
