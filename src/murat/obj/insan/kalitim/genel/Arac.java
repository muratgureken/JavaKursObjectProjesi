package murat.obj.insan.kalitim.genel;

public class Arac {
	
	static {
		System.out.println("arac static blok calisti");
	}
	static int hiz3;
	public String marka;
	public String model;
	
	public static void setHiz(int gelenhiz){
		hiz3 = gelenhiz; //gelen hiz da static oluyor
		//static metot icerisinde marka degiskenine deger atayamazsin, static degisken degil
	}
}
