package murat.obj.insan.kalitim.arayuz;

public class Isci implements Calisabilir, Insan{

	private String isciAdi;
	
	public Isci(String isciAdi) {
		this.isciAdi = isciAdi;
	}
	
	@Override
	public void Calis() {
		System.out.println(isciAdi+ " çalýþýyor.");
	}

	@Override
	public void Dinlen() {
		System.out.println(isciAdi+ " dinleniyor.");
		
	}

	@Override
	public void YemekYe() {
		System.out.println(isciAdi+ " yemek yiyor.");
		
	}

	@Override
	public void MolaVer(int zaman) {
		System.out.println(isciAdi+ " "+zaman + " dakika mola verdi.");
		
	}

}
