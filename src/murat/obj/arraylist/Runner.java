package murat.obj.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List liste = new ArrayList(); //ArrayList'in ust atalarindan biri list'mis demek ki. aralarinda bir bag var ki esitleyebiliyoruz.
		List yeniliste = new YeniListe();
		liste.add("Murat");
		liste.add("Emel");
		liste.add(3);
		liste.add(3.14);
		float pi=3.142f;
		liste.add(pi);
		System.out.println(yeniliste.getClass());
		System.out.println(liste.getClass());
		liste.add(true);
		liste.add(10_000_000_000L);
		yeniliste.add("Deneme");
		liste.add(yeniliste);
		
		for (Object temp : liste) {
			System.out.println(temp.toString());
		}
	}
}
