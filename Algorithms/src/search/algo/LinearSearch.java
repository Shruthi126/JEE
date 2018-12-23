package search.algo;

public class LinearSearch {
	
	public static void main(String args[]){
		int a[]={2,5,7,9,10,25,36,38,40};
		System.out.println(linearSearchRR(a,0, 25));
		
	}
	
	public static int linearSearch(int a[], int key){
		for (int j=0;j<a.length;j++){
			if(key==a[j])
				return j;
		}
		return -1;
	}
	
	public static int linearSearchRR(int a[], int index,int key){
		if(index>=a.length)//base case
			return -1;
		else if(key==a[index])
			return index;
		else 
			return linearSearchRR(a, index+1, key);
	}
}
