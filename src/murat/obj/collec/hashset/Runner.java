package murat.obj.collec.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		Set<Integer> liste = new HashSet<Integer>();
		liste.add(3);
		liste.add(5);
		liste.add(-1);
		Iterator it = liste.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println();
		System.out.println();

		Map<Integer,String> iller = new HashMap<Integer,String>();
		iller.put(1,"Adana");
		iller.put(2, "Adiyaman");
		iller.put(3, "Afyon");
		iller.put(4, "Agri");
		iller.put(5, "Amasya");
		iller.put(6, "Ankara");
		System.out.println(iller.size());
		//for icinde dondurmeye calis. iller.foreach ya da entry set
		for (Entry<Integer,String> temp : iller.entrySet()) 
		{
			System.out.println(temp.getKey()+" = "+temp.getValue());
		}
	}
}
