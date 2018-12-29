package murat.obj.insan.kalitim.gecbaglama;

public class Runner {

	public static void main(String[] args) {
		Arac[] araclar = {new Araba(),new Motosiklet(),new Araba()};
		
		//foreach
		//late binding: for daha calismadan hangi metodun calisacagini bilemiyor.
		for (Arac arac : araclar) {
			arac.Calis();
			arac.YakitAl();
			System.out.println("-------------------------");
		}
	}

}
