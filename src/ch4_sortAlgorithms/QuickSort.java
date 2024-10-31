package ch4_sortAlgorithms;


import java.util.Arrays;

public class QuickSort {


    // 一趟划分
    public int partition(int[] array, int low , int high ){

        int i = low;
        int j = high;
        // 以第一个元素为基点
        int tmp = array[i];
        while (i < j) {
            // 从右向左扫描，找到array中第一个小于tmp的值
            while (j > i && array[j] >= tmp) {
                j--;
            }
            // 找到该值,替换R[i]
            array[i] = array[j];
            // 从左到右扫描,找到array中第一个大于tmp的值
            while (i < j && array[i] <= tmp) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = tmp;
        System.out.println(Arrays.toString(array));
        return i;
    }

    public void quickSort(int[] array, int low, int high){
        int i;
        if (low < high) {
            i = partition(array, low, high);
            // 对左边进行递归排序
            quickSort(array,low,i-1);
            // 对右区间进行递归排序
            quickSort(array,i+1,high);
        }
    }


}
