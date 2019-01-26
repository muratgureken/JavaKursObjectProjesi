package murat.obj.siralama;

public class Canta implements Siralanabilir{
	private int fiyat;
	private String marka;
	static int maksBoy=0;
	
	public Canta(int fiyat, String marka) {
		this.marka = marka;
		this.fiyat = fiyat;
		if(marka.length()>maksBoy)
		{
			maksBoy = marka.length();
		}
	}

	@Override
	public int karsilastir(Object temp) {
		Canta c = (Canta)temp;
		
		if(this.fiyat>c.fiyat)
		{
			return -1;
		}
		if(this.fiyat<c.fiyat)
		{
			return 1;
		}		
		else
			return 0;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	@Override
	public void veriYaz() {
		int bosluk = (maksBoy+5)-getMarka().length();
		System.out.print(getMarka());
		for(int i=0;i<bosluk;i++)
		{
			System.out.print(" ");
		}
		System.out.print(": "+getFiyat());	
		System.out.println();
	}
	
}
