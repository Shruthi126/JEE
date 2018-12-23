package sort.algo;

import java.util.Arrays;

public class MergeInPlace {
	
	private static int tempArray[];// an array used for merging

	public static void main(String ashg[]){
		int arr[]={2,8,5};
		tempArray=new int[arr.length];
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
		mergeInPlace(array,start,mid,end);
	}

	private static void mergeInPlace(int[] array, int start, int mid, int end) {
		int i=start;
		int j=mid+1;
		//Partially sorted array is copied every time merge is called
		for(int k=0;k<array.length;k++){
			tempArray[k]=array[k];
		}
		//Comparison is done in temp array instead of creating arrays every time merge is called
		for(int k=start;k<=end;k++){
			if(i>mid){   //if i has crossed mid ie left array elements are over, copy remaining right elements
				array[k]=tempArray[j++];
			}else if(j>end){  //if j has reached end ie right array elements are over, copy remaining left  elements
				array[k]=tempArray[i++];
			}else if(tempArray[j]<tempArray[i]){ //this is same as core logic of previous merge 
				array[k]=tempArray[j++];
			}else{
				array[k]=tempArray[i++];
			}
		}
		
		
	}
		 
		 
}
