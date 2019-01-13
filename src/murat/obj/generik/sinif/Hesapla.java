package murat.obj.generik.sinif;

public class Hesapla<T> {
	public Object[] dizi;
	T degisken;

	public Hesapla(T temp, int boy) {
		degisken = temp;
		System.out.println(temp.getClass()+" gelen veri:"+temp.toString());
		dizi = new Object[boy];
	}
	
	public void ekle(T gelenveri, int indis)
	{
		//gelenveri = (T)dizi[0];
		dizi[indis] = gelenveri;
	}
	
	public T cikar()
	{		
		return (T)dizi[0];
	}
	
	public void terscevir()
	{

		for(int i=0;i<(dizi.length)/2;i++)
		{
			T sayi;
			sayi = (T)dizi[i];
			dizi[i] = dizi[(dizi.length)-i-1];
			dizi[(dizi.length)-i-1] = sayi;
		}
	}
	
	public void yazdir()
	{
		for (int j = 0; j < dizi.length; j++) {
			System.out.print(dizi[j]+" ");
		}

		System.out.println();
	}
	
	public T getir(int indis)
	{
		return (T)dizi[indis];
	}
	
	public Boolean icerir(T aranan)
	{
		Boolean durum=false;
		
		for (int i = 0; i < dizi.length; i++) {
			if(aranan.equals(dizi[i]))
			{
				durum = true;
				break;
			}
		}
		return durum;
	}
	
	@Override
	public String toString() {
		String sonuc="";
		for (int i = 0; i < dizi.length; i++) {
			sonuc = sonuc+dizi[i]+" ";
		}
		return sonuc;
	}
}
