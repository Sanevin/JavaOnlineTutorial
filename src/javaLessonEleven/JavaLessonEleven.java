package javaLessonEleven;

import java.util.*;

public class JavaLessonEleven {
	
	public static void main(String[] args){
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("Mohamed Alami");
		names.add("Oliver Miller");
		
		names.add(2, "Jack Ryan");
		names.set(0,  "John Adams");
		names.remove(3);
		for(int i = 0; i < names.size(); i++){
			
			System.out.println(names.get(i));
			
		}
		
		System.out.println(names);
		
		for (String i : names){
			
			System.out.println(i);
		}
		
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext())
		{
			
			System.out.println(indivItems.next());
			
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here");
			
		}
		if(names.containsAll(nameCopy))
		{
		
			System.out.println("Everything in nameCopy is in Names!");
			
		}
	}

}
