package murat.obj.collec.comparator;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import javafx.print.Collation;
import murat.obj.arraylist.YeniListe;

public class Runner {

	public static void main(String[] args) {
		List liste = new ArrayList(); //ArrayList'in ust atalarindan biri list'mis demek ki. aralarinda bir bag var ki esitleyebiliyoruz.
		List yeniliste = new YeniListe();
		liste.add("Murat");
		liste.add("Emel");
		liste.add("Ünzile");
		liste.add("Fatma");
		liste.add("Çetin");
		Collator tr = Collator.getInstance(new Locale("TR", "TR"));
		Collections.sort(liste, tr); //sort icerisinde Turkce harflerin kullanilmasini istedik 
		System.out.println(liste);
		boolean durum=false;
		int a;
		a = durum?3:2;
	}

}
