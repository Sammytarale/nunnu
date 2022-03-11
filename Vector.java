package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Vector {
	
	
	public static void main(String[] args) {
		Vector vv=new Vector;
		.add("Sammy");
		al.add(101);
		al.add("Shaymrao");
		al.add("Satish");
		al.add(null);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		//add
		al.add(0, "Sachin");
		System.out.println(al);
		
		//remove
		al.remove(0);
		System.out.println(al);
		
		//update /modify
		al.set(0, "Sabhyasachi");
		al.set(1, "element");
		System.out.println(al);
		
		
		System.out.println("_______________________Print arraylist data with iterater cursor");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Iterator sa=al.iterator();
		while(sa.hasNext()) {
			System.out.println(sa.next());
		}
		
		System.out.println("_________________________Print arraylist using list iterater cursor");
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("+__________________________Print arraylist using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("___________print arraylist using for each loop");
		
		for(Object ss:al) {
			System.out.println(ss);
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
