package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_strategy;

import java.util.List;

public class MergeSort implements SortStrategy {

    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Merge sort");
    }
}
