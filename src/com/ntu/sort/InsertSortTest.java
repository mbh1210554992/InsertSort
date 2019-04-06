package com.ntu.sort;

/**
 * 直接插入法排序：
 * 向有序表中插入记录(在已排序序列中从后往前扫描)，插入位置的确定通过对有序表中元素逐个比较得到的
 * 空间效率：仅用了一个辅助单元
 * 时间复杂度：O(n^2)
 * @author Lenovo
 *
 */
public class InsertSortTest {
	public static void main(String[] args) {
		int[] a={2,5,8,10,3,32,1};
		insertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void insertSort(int[] list){
		//将list[0]作为初始的有序序列
		for(int i=1;i<list.length;i++){
			//代插入的数据，将其复制为哨兵
			int temp=list[i];
			int j;
			//将哨兵插入到有序序列中
			for(j=i-1;j>=0;j--){
				if(list[j]>temp){
					list[j+1]=list[j];
				}else{
					break;
				}
			}
			list[j+1]=temp;
		}
	}
}

