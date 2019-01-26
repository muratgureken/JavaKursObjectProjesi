package murat.obj.generics;

import murat.obj.siralama.Siralanabilir;

public class KisitlaListesi<T extends Siralanabilir> {

	public T hesapla(T temp)
	{
		Integer a=0;
		temp.veriYaz();
		return temp;
	}
}
