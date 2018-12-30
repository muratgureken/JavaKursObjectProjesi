package murat.obj.insan.kalitim.yapici;

public class Runner {

	public static void main(String[] args) {
		new Araba(2); //extend edildigi ust class constructor'lari da cagrilir. 
		new Araba();
		new BinekArac();
		new BinekArac(6);
	}

}
