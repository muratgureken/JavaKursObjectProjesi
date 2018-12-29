package murat.obj.insan.kalitim.arayuz;

public class Runner {

	public static void main(String[] args) {
		Isci temp = new Isci("Murat");
		temp.Calis();
		temp.Dinlen();
		temp.MolaVer(10);
		temp.YemekYe();
		
		Robot r = new Robot();
		r.Calis();
		r.Dinlen();
		
		/*Calisabilir calis = new Isci();
		calis.Calis();*/

		//object tipinde array olusturursak 
		Object[] calis3 = {new Isci("Hasan"),new Robot()};
		Isci isci1 = (Isci)calis3[0];
		isci1.Calis();
		isci1.Dinlen();
		
		//farkli bir casting
		((Isci)calis3[0]).Dinlen();
		
		//farkli tipteki objeleri tek bir array'de tutmak icin Calisabilir interface tipinde array tutuyoruz.
		Calisabilir[] calis2 = {new Isci("Hasan"),new Robot()};
		calis2[0].Calis();
		calis2[1].Calis();
		Isci deneme = (Isci)calis2[0];//array'deki elemani cast ederek alabiliriz.
		deneme.MolaVer(15);
		

	}

}
