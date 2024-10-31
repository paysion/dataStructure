package ch4_sortAlgorithms;

public class SortManage {


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, n - 1);

        System.out.println("快速排序结果: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

}
