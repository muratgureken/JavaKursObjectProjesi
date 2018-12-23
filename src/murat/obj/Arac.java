package murat.obj;

public class Arac {
	private int tekerlekSayisi;
	public boolean koltuk;
	private String surucuAdi;
	
	public Arac() {
		// TODO Auto-generated constructor stub
	}

	public Arac(int tekerlekSayisi){
		this.tekerlekSayisi = tekerlekSayisi;
	}
	
	public void setSurucuAdi(String surucuAdi) {
		this.surucuAdi = surucuAdi;
	}

	//overload
	public void setSurucuAdi(String surucuAdi, String surucuSoyadi) {		
		this.surucuAdi = surucuAdi+" "+surucuSoyadi;
	}
	
	public String getSurucuAdi() {
		return surucuAdi;
	}
	
	//degiskene herkesin direk ulasmamasi icin (tekerlekSayisi) get ve set fonksiyonlari yazilir.
	//bu durumda degiskeni hemen degistiremiyorsun, set fonksiyonu icerisinde bir kontrol koyabilirsin.
	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}
	
	public int getTekerlekSayisi() {
		return tekerlekSayisi;//baska bir tekerlek sayisi olmadigi icin this.tekerlekSayisi ile ayni anlamda
	}
}
