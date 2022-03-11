package Array
list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraylist {
	
	public static void main(String[] args) {
		
			
			
			ArrayList al=new ArrayList();
			
			
			al.add("Sachin"); 
			al.add(11);
			al.add('S');
			al.add(100);
			al.add(null);
			al.add(null);
			al.add(null);
			
			System.out.println(al);
		
			System.out.println(al.size());
			
			System.out.println(al.isEmpty());
			
			System.out.println(al.contains(100));
			System.out.println(al.get(5));
			
			
			//add/insert info in between arraylist   --> right shift operation
			System.out.println(al);
			al.add(4,400);
			System.out.println(al);
					
			//remove/delete info in between arraylist   --> left shift operation
			al.remove(4);
			System.out.println(al);
				
			//update/ modify 
			al.set(0, "RAHUL");		
			al.set(5, "xyz");
			System.out.println(al);		
			System.out.println("---------print arraylist data using iterator cursor------------");
			
			Iterator itr = al.iterator();		
			while(itr.hasNext())    //TRUE  true   false
			{
				System.out.println(itr.next());
			}
			
			System.out.println("---------print arraylist data using ListIterator cursor------------");
			
			ListIterator litr = al.listIterator();
			while(litr.hasNext())
			{
				System.out.println(litr.next());
			}
			

			System.out.println("---------print arraylist data using for loop------------");
			
			for(int i=0; i<=al.size()-1; i++)
			{
				System.out.println(al.get(i));
			}
			
					
			System.out.println("---------print arraylist data using foreach loop------------");
					
			for(Object s1:al) 
			{
				System.out.println(s1);
			}
			

	}

	
}
