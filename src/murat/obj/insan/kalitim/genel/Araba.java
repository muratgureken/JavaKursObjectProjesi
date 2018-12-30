package murat.obj.insan.kalitim.genel;

public class Araba {
	//static blok ilklendirme amacli kullaniliyor. degisken final olarak tanimlanirsa degistirilemez.
	static {
		System.out.println("burada");
		int hiz = 1;//sadece static icerisinde tanimli degiskenlere baska yerden ulasamayiz.
	}
	
	public Araba() {
		System.out.println("araba calisti 1");
	}
	
	public Araba(int hiz1) {
		System.out.println("araba calisti 2");
		System.out.println(hiz1);
	}
}
