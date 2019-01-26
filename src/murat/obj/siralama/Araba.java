package murat.obj.siralama;

public class Araba implements Siralanabilir{
	private int model;
	private String marka;
	static int maksBoy=0;
	
	public Araba(int model, String marka) {
		
		this.marka = marka;
		this.model = model;
		
		if(marka.length()>maksBoy)
		{
			maksBoy = marka.length();
		}
	}

	@Override
	public int karsilastir(Object temp) {
		Araba c = (Araba)temp;
		
		if(this.model>c.model)
		{
			return -1;
		}
		if(this.model<c.model)
		{
			return 1;
		}		
		else
			return 0;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
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
		System.out.print(": "+getModel());	
		System.out.println();
	}
	
}
