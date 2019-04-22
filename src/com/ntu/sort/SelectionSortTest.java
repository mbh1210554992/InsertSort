package com.ntu.sort;
/**
 * 选择排序
 * 先进行一轮比较，得到最小记录，该记录与第一个记录交换位置；
 * 对除第一个记录以外的其他记录进行第二轮比较，并与第二个数交换，以此类推
 * @author Lenovo
 *
 */
public class SelectionSortTest {
	public static void main(String[] args) {
		int[] a={5,4,9,10,20,3,1};
		selectionSort(a);
		for(int temp:a){
			System.out.println(temp);
		}
	}
	public static void selectionSort(int[] target){
		int temp=0; //用来记录最小的数
		int flag=0;//记录最小的数的位置
		for(int i=0;i<target.length;i++){
			flag=i;
			temp=target[i];
			for(int j=i+1;j<target.length;j++){
				if(target[j]<temp){
					temp=target[j];
					flag=j;
				}
			}
			if(flag!=i){
				target[flag]=target[i];
				target[i]=temp;  
				
			}
		}
	}
}
