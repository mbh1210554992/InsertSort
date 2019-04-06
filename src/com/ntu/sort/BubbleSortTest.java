package com.ntu.sort;
/**
 * 冒泡排序
 * @author Lenovo
 *
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] list={23,74,22,1,6,89,46,72};
		bubbleSort(list);
		for(int temp:list){
			System.out.println(temp);
		}
	}
	
	public static void bubbleSort(int[] list){
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length-i-1;j++){ //此处要注意数组越绝问题
				if(list[j]>list[j+1]){
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
	}
}
