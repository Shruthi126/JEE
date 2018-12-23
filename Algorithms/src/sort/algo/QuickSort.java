package sort.algo;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]={20,8,5,7,1,3,19,0};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(end<=start)
			return;
		int point=partition(arr,start,end);
		quickSort(arr, start, point-1);
		quickSort(arr, point+1, end);

	}

	private static int partition(int[] arr, int start, int end) {
		int j=start-1;/// Pointer to traverse and then swap if lesser than pivot. I had given this as j=-1 in a wrong manner
		int temp;
		int pivot=arr[end]; 
		for(int i=start;i<=end-1;i++){// Remember to go till end-1, as pivot will swapped at last
			if(arr[i]<=pivot){
				temp=arr[i];
				arr[i]=arr[++j];
				arr[j]=temp;
			}
		}
		temp=arr[end];
		arr[end]=arr[++j];
		arr[j]=temp;
		return j;
	}

}
