package murat.obj.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Runner1 {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<Integer>();
		liste.add(1);
		liste.add(null);
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		List<Integer> liste1 = new ArrayList<Integer>();
		List<Integer> liste2 = new ArrayList<Integer>();
		liste1.add(1);
		liste1.add(2);
		liste1.add(3);
		liste1.add(4);
		liste2.add(5);
		liste2.add(6);
		liste2.add(7);
		liste2.add(8);
		
		int sayi;

		System.out.println("Liste 1:");
		for(int i=0;i<liste1.size();i++)
		{
			System.out.print(liste1.get(i)+" ");
		}
		System.out.println();
		System.out.println("Liste 2:");

		for(int i=0;i<liste1.size();i++)
		{
			System.out.print(liste2.get(i)+" ");
		}
		System.out.println();

		for (int i = 0; i < liste1.size(); i++) {
			sayi = liste1.get(i);
			liste1.set(i, liste2.get(liste1.size()-i-1));
			liste2.set(liste1.size()-i-1, sayi);
		}
		
		System.out.println("Liste 1:");
		for(int i=0;i<liste1.size();i++)
		{
			System.out.print(liste1.get(i)+" ");
		}
		System.out.println();
		System.out.println("Liste 2:");

		for(int i=0;i<liste1.size();i++)
		{
			System.out.print(liste2.get(i)+" ");
		}
		System.out.println();

	}

}
