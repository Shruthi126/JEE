package map;

import static java.util.Collections.reverseOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapValuesSorting {
	public static void main(String args[]){
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("S","1");
		map.put("r","3");
		map.put("t","5");
		map.put("n","2");
		map.put("p","8");
		map.put("*","8");
		map.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		System.out.println("Sorted based on value");
		Map<String, String> sortedmap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
															  collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		sortedmap.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		System.out.println("Sorted based on value in reverse value( for this import static java.util.Collections.reverseOrder;)");
		sortedmap=map.entrySet().stream().sorted(reverseOrder(Map.Entry.comparingByValue())).
				  collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		sortedmap.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		System.out.println("Sorted based on keys by default");
		Map<String, String> treeMap = new TreeMap<>(map);
		
		treeMap.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		System.out.println("Sorted based on keys reverse using comparator ");
		Map<String, Integer> treeMap2 = new TreeMap<>(new Comparator<String>() {
			public int compare(String s1, String s2){
				return s2.compareTo(s1);
			}
		});
		treeMap2.put("S",1);
		treeMap2.put("r",3);
		treeMap2.put("t",5);
		treeMap2.put("n",6);
		treeMap2.put("p",9);
		treeMap2.put("*",4);
	
		treeMap2.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		//------------------------------Sorting based on values Manual--------------------------
		System.out.println("Sorted based on values Manual ");

		Set<Entry<String,String>> set= map.entrySet();
		List<Entry<String,String>> list=new ArrayList<Entry<String,String>>(set);
		//Collections.sort supports only list implementations
		Collections.sort(list,new Comparator<Entry<String,String>>() {

			@Override
			public int compare(Entry<String, String> arg0,
					Entry<String, String> arg1) {
			return Integer.valueOf(arg0.getValue()).compareTo(Integer.valueOf(arg1.getValue()));
				
			}
			
		});
		
		LinkedHashMap<String, String> sortedLinkedMap= new LinkedHashMap<>();
		for(Entry<String,String> entry:list)
			sortedLinkedMap.put(entry.getKey(), entry.getValue());
		sortedLinkedMap.entrySet().stream().forEach(a->System.out.println("Key "+a.getKey()+" Value "+a.getValue()));
		
		
		
		
	}

}
