package sort.algo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args){
		int arr[]=selectionSort(new int[]{2,8,5,7,1,3,10});
		System.out.println(Arrays.toString(arr));
	}

	public static int[] selectionSort(int a[]){
		int min=0; boolean swapRequired=false;
		for (int i=0;i<a.length;i++){
			min=i;
			swapRequired=false;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
					swapRequired=true;
				}
			}
			if(swapRequired==true){
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		return a;
	}

}
