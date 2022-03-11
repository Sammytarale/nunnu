package Arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	
	
	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		
		hs.add("Saatya");
		hs.add(543);
		
		hs.add(0.1254f);
		hs.add("Sammy");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("sammy"));
		System.out.println(hs.isEmpty());
		hs.remove(0123);
		
		System.out.println(hs);
		
		System.out.println("_________________Print using iterater");
		
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("______________Print using foreach");
		for(Object s:hs) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
