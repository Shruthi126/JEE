package sort.algo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String ashg[]){
		int arr[]={2,8,5,7,1,3,0,0};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void mergeSort(int array[],int start,int end) {
		if(end<=start){
			return;
		}

		int mid= (start+end)/2;
		mergeSort(array,start,mid);
		mergeSort(array,mid+1,end);
		merge(array,start,mid,end);
	}

	private static void merge(int[] array, int start, int mid, int end) {
		/*How to find left and right arraysize
		endPoint-startPoint+2*/
		final int leftArrSize= mid-start+2;
		final int rightArrSize=end-mid+1;//  (end-(mid+1) +2) is equal to (end-mid+1)			
		int[] leftArr=new int[leftArrSize];
		int[] rightArr=new int[rightArrSize];//Creating new arrays

		for(int i=0,j=start;i<leftArrSize-1&&j<=mid;i++,j++){
			leftArr[i]=array[j];
		}

		for(int i=0,j=mid+1;i<rightArrSize-1&&j<=end;i++,j++){
			rightArr[i]=array[j];
		}
		leftArr[leftArrSize-1]=Integer.MAX_VALUE;//Assign max value possible
		rightArr[rightArrSize-1]=Integer.MAX_VALUE;

		for(int i=0,j=0,k=start;k<=end;k++){
			if(leftArr[i]<rightArr[j]){
				array[k]=leftArr[i++];
			}else{
				array[k]=rightArr[j++];
			}
		}
	}



}
