package murat.obj.insan.kalitim.soyut;

public abstract class Cizim {
	
	//class'i extend eden class'larin, ust class'in fonksiyonunu doldurmasi gerekiyorsa, abstract class icerisinde abstract metot tanimlanabilir. 
	//bu class'i extend eden alt class'lar bu class icerisindeki abstract metodu degistirmek zorunda kalir.
	public void ciz() {
		System.out.println("cizim calisti.");
	}
	
	public abstract void lineciz(int x, int y);
}
