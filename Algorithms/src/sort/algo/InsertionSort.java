package sort.algo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]=insertionSort(new int[]{2,8,5,7,1,3,10});
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] insertionSort(int a[]){
		
		for(int i=1;i<a.length;i++){
			int num= a[i]; //element in unsorted section chosen
			int j=i-1;
			for(;j>=0 && num<a[j];j--){ //j starts with last value in the sorted area
				 	a[j+1]=a[j];
			}
			a[j+1]=num;
		}
		
		return a;
	}

}
