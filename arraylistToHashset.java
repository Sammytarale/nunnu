package Arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class arraylistToHashset {

	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("a");
		al.add("b");
		al.add(150);
		al.add("syam");
		al.add("Satish");
		System.out.println(al);
		
		
		HashSet hs=new HashSet(al);
		
		System.out.println(hs);
		
	}
}
