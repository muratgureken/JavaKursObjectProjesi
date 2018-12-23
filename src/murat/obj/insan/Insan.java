package murat.obj.insan;

public class Insan {
	public String adi;
	public String soyadi;
	private Insan anne;//soyagaci yapabilmek icin
	public Insan baba;
	public int yas;
	
	public Insan getAnne() {
		return anne;
	}
	public void setAnne(Insan anne) {
		this.anne = anne;
	}
	
}
