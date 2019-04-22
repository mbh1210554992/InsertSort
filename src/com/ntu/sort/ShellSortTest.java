package com.ntu.sort;
/**
 * 希尔排序（缩小增量排序）
 * 先将数组按照增量来分成多个子序列，每个子序列进行插入排序
 * 增量依次减少，最后为1
 * @author Lenovo
 *
 */
public class ShellSortTest {
	public static void main(String[] args) {
		int[] a={2,5,9,8,7,6,5,4};
		shellSort(a);
		for(int temp:a){
			System.out.println(temp);
		}
		
	}
	public static void shellSort(int[] target){
		
		int temp;
		//h为增量
		for(int h=target.length/2;h>0;h=h/2){
			//相当于直接插入排序
			for(int i=h;i<target.length;i++){
				temp=target[i];
				int j;
				for(j=i-h;j>=0;j-=h){
					if(temp<target[j]){
						target[j+h]=target[j];
					}else break;
				}
				target[j+h]=temp;
			}
		}
	}
	
}
