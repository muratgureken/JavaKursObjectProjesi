package murat.obj.insan;

import murat.obj.insan.kalitim.Ogretmen;

public class Runner {

	public static void main(String[] args) {

		Insan ben = new Insan();
		ben.adi = "Murat";
		ben.soyadi = "Gureken";
		//class icerisindeki private objeye ulasma
		ben.setAnne(new Insan());
		ben.getAnne().adi = "Emel";
		//class icerisindeki public objeye ulasma
		ben.baba = new Insan();
		ben.getAnne().getAnne().adi = "Fehime";
		ben.baba.adi = "Erol";
		ben.baba.baba.adi = "Turan";
		
		Ogretmen o = new Ogretmen();
		//o.dna bu alana erisilemez, baska pakette protected tanimlandi.
	}
}
