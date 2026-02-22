package dsa.sorting;

public class HeapSort {
    Order order;

    HeapSort(Order order) {
        this.order = order;
    }

    private boolean isChildBetter(int[] arr, int parent, int child) {
        if (order == Order.ASC) {
            return arr[child] > arr[parent];
        } else {
            return arr[child] < arr[parent];
        }
    }

    private void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;
        if (left < size && isChildBetter(arr, largest, left)) {
            largest = left;
        }
        if (right < size && isChildBetter(arr, largest, right)) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    public void sort(int[] arr) {
        int i, n = arr.length;
        for (i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i); // build heap
        }

        for (i = n - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
    }
}
