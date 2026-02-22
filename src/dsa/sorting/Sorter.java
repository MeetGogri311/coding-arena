package dsa.sorting;

public class Sorter {
    public static void heapSort(int[] arr, Order order) {
        (new HeapSort(order)).sort(arr);
    }
}
