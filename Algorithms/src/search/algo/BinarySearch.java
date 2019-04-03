package search.algo;

public class BinarySearch {

	public static void main(String args[]){
			int a[]={2,5,7,9,10,25,36,38,40};
			System.out.println(binarySearch(a, 10));
			System.out.println(binarySearchRR(a,0,a.length-1, 5));
	}

	public static int binarySearch(int a[], int key){
		int p=0,q=a.length-1;
		int r=0;

		while(p<=q){
			r=Math.floorDiv(p+q, 2);
			if(key==a[r])
				return r;
			else if(key>a[r])
				p=r+1;
			else 
				q=r-1;	
			
		}
		return -1;
		
	}
	
	public static int binarySearchRR(int a[], int p,int q ,int key){
	
			int r=Math.floorDiv(p+q, 2);
			if(p>q)//base condition
				return -1;
			else if(key==a[r])
				return r;
			else if(key>a[r])
				return binarySearchRR(a,r+1,q,key);
			else 
				return binarySearchRR(a,p,r-1,key);
			
			
		
		
	}

}
