package murat.obj.insan.kalitim.yapici;

public class Araba extends BinekArac{
	public Araba() {
		super(4);
		System.out.println("5");
	}
	public Araba(int hiz) {
		this();//this(): parametre almayan kendi constructor'ini cagiriyor. 
		System.out.println("6");
	}

}
