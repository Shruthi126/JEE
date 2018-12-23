package com.java.enumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EnumToTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Days> list= new ArrayList<>();
			list.add(Days.WED);
			list.add(Days.MON);
			TreeSet<Days> treeSet= new TreeSet<>(list);
			System.out.println(" Ordering based ordinal value \n--------------------");
			treeSet.stream().forEach(a->System.out.println(a + " - Ordinal value" +a.ordinal()));
			
			 /*it does sorting in natural order or ordinal of enum 
			  * ie ordinal of an enumeration constant is its position in its enum declaration, where the intial constat is assinged an ordinal of zero
			  * Ordinal cannot be set in code. We can change by variable in enum or by changing its position during declaration.
			*/
			System.out.println("-------------------- \n Ordering based on mass and not ordinal value \n--------------------");
			List<Planet> list2= new ArrayList<Planet>();
			list2.addAll(Arrays.asList(Planet.values()));//Gets all the values of planets
			TreeSet<Planet> treeSet2= new TreeSet<Planet>(new Comparator<Planet>() {
				@Override
				public int compare(Planet p1,Planet p2) {
				
					return (int) (p1.mass-p2.mass);
				}
			});
			treeSet2.addAll(list2);
			treeSet2.stream().forEach(a->System.out.println(a));
			
	}

}
