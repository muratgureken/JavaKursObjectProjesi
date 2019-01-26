package murat.obj.generics;

public class KisitlamaListesi<T extends Comparable<T> > /*kisitlama koyuyoruz, orn. input string olamaz.*/{
	public T hesapla(T temp)
	{
		T deger=null;
		temp.compareTo(deger);
		return temp;
	}
	
	public <U extends Integer > U hesapla(U temp)//icinde sadece Integer alan baska bir generic type urettik
	{
		return temp;
	}
}
