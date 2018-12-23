package hash.table;

public class CheckHashTable {

	public static void main(String[] args) {
		HashTable hashtable = new HashTable(12);
		hashtable.insert("We");
		hashtable.insert("will");
		hashtable.insert("rock");
		hashtable.insert("you");
		hashtable.insert("!");
		hashtable.insert("We");
		hashtable.insert("will");
		hashtable.insert("rock");
		hashtable.insert("you");
		hashtable.insert("!");
		 /*If we try to add more data it will go to infinite loop as our hash table doesn't resize automatically and every 
		 block will be filleds
	    hashtable.insert("We");  
		hashtable.insert("will");
		hashtable.insert("rock");
		hashtable.insert("you");
		hashtable.insert("!");*/
		hashtable.printData();
	}

}
