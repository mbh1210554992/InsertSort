package com.ntu.sort;

/**
 * 快速排序
 *      时间复杂度：O(nlogn)
 *      空间复杂度: O(logn)
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] a = {2,1,5,9,10,15,3,100,2,0};
        sort(a,0,a.length-1);

        for(int temp : a){
            System.out.print(temp+" ,");
        }
    }

    public static void sort(int[] arr,int leftBound, int ringhtBound){
        if(leftBound >= ringhtBound){
            return;
        }
        quickSort(arr,leftBound,ringhtBound);
    }

    public static void quickSort(int[] arr,int leftBound, int rightBound){
        int left = leftBound;
        int right = rightBound-1;
        int index = arr[rightBound];
        while(left <= right){
            while(left <= right && arr[left] <= index) left++;
            while(left <= right && arr[right] > index) right--;

            if(left < right){
                swap(arr,left,right);
            }
        }

        swap(arr,left,rightBound);
        sort(arr,0,left-1);
        sort(arr,left+1,rightBound);
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
}
