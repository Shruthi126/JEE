package hash.table;

import java.util.Arrays;

//https://stackoverflow.com/questions/15437345/java-a-prime-number-or-a-power-of-two-as-hashmap-size

public class HashTable {

	private int size=0;//counter for the elements
	private int maxSize;
	private String[] hashArray;
	
	public HashTable(int noOfSlots){
		if(isPrime(noOfSlots)){
			maxSize=noOfSlots;	
		}else{
			 maxSize=getNextPrime(noOfSlots);
		}
		hashArray= new String[maxSize];
		System.out.println("User input size :"+noOfSlots);
		System.out.println("User input size :"+maxSize);
		
	}

	private int getNextPrime(int number) {
		for(int i=number;true;i++){
			if(isPrime(i))
				return i;
		}
	}

	private boolean isPrime(int noOfSlots) {
		    //int sqrRoot=(int)Math.ceil(Math.sqrt(new Double(noOfSlots)));
			//for (int i=2; i<sqrRoot; i++) Instead of finding sqrt and all mess find the square and check if it is less than no of slots 
			for (int i=2; i*i<noOfSlots; i++)
		        if (noOfSlots%i == 0) 
		            return false;
		
		return true;	
	}
	
	
	private int hashFunc1(String word){
		int hashVal=word.hashCode();
		hashVal= hashVal % maxSize;
		
		if(hashVal<0) //Java implementation of hashCode can return negative value
			hashVal+=maxSize;
		
		return hashVal;
	}
	
	private int hashFunc2(String word){
		int hashVal=hashFunc1(word);	
		return 3-hashVal%3; //Choosing three why? the number should be less than array max size and a prime number
	}
	//Collision is avoided using double hashing. One more way is separate chaining where linkedlist is used
	public void insert(String word){
		int hashVal=hashFunc1(word);
		int stepSize=hashFunc2(word);
		
		while(hashArray[hashVal]!=null){
			hashVal+=stepSize;
			hashVal= hashVal % maxSize;// I had not put this first. Was getting Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
			System.out.println("intermediate index: "+hashVal);
		}
		System.out.println("final index: "+hashVal);
		hashArray[hashVal]=word;
		size++;
	}
	
	public String find(String word){
		int hashVal=hashFunc1(word);
		int stepSize=hashFunc2(word);
		
		while(hashArray[hashVal]!=null){
			if( hashArray[hashVal].equals(word)){
				System.out.println("final index: "+hashVal);
				return hashArray[hashVal];
			}
			hashVal+=stepSize;
			hashVal= hashVal % maxSize;
		}
		
		return hashArray[hashVal];
	}
	
	public void printData(){
		Arrays.asList(hashArray).stream().forEach(System.out::println);
	}
}
