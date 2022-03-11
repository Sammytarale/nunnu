package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylist1 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Sachin"); 
		al.add(11);
		al.add('S');
		al.add(100);
		al.add(null);
		al.add(null);
		al.add(null);
		
		//add/insert info in between arraylist     right shift operation
		al.add(3, "Shyam");
		System.out.println(al);
		
		//remove/delete between arraylist  left shift opeartion
		al.remove(3);
		System.out.println(al);
		
		//update/modify
		
		al.set(0, 458);
		al.set(1, "Nunnu");
		System.out.println(al);
		
		System.out.println("_________Print Arraylist data using iterater cursor_____________");
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("__________Print ArrayList data Using ListIterater Cursor______________");
		
		ListIterator litr=al.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		
		System.out.println("_____________Print ArrrayList data using for loop___________");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("__________Print arraylist data using for each loop");
		
		for(Object a1:al) {
			System.out.println(a1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
