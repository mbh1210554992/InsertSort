package com.ntu.sort;
/**
 * 折半插入排序
 * @author Lenovo
 *
 */
public class BInsertSortTest {
	public static void main(String[] args) {
		int[] list={10,25,32,5,58,64,78,2};
		BInsertSort(list);
		for(int m:list){
			System.out.println(m);
		}
	}
	
	public static void BInsertSort(int[] list){
		//对顺序表做折半插入排序
		int low,high,m;
		for(int i=1;i<list.length;i++){
			int temp=list[i];  
			low=0;
			high=i-1;
			while(low<=high){
				m=(low+high)>>1;   //折半(向右移一位，比除号效率更高)
				if(temp<list[m]){
					high=m-1;
				}else{
					low=m+1;
				}
			}
			for(int j=i-1;j>=high+1;j--){   //把比temp大的元素后移一位
				list[j+1]=list[j];
			}
			list[high+1]=temp;    //将元素按顺序插入相应的顺序中
		}
	}
}

