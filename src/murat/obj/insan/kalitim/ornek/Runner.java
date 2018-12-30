package murat.obj.insan.kalitim.ornek;

import murat.obj.insan.kalitim.genel.Araba;

public class Runner {

	public static void main(String[] args) {
		Arac[] araclar = {new UstuAcikAraba(), new BinekAraba(), new SporAraba(), new Arabam(), new Arac()};
	
		for (Arac arac : araclar) {
			arac.YakitAl();
			arac.Calis();
		}
	}
}