package murat.obj.insan.kalitim.genel;

public class Runner {

	public static void main(String[] args) {
		
		Arac.hiz3=100; //static degiskene, instance yaratmadan da deger atanabilir.
		
		Arac temp = new Arac();
		/*temp.hiz = 100;*/ //hiz static oldugu icin uretilen diger arac khizi da 100 olacak.
		temp.model = "2018";
		temp.marka = "Toyota";
		
		Arac temp1 = new Arac();
		temp1.model = "2019";
		temp1.marka = "Honda";
		System.out.println(temp1.hiz3+" "+temp1.marka+" "+temp1.model);
		System.out.println(temp.hiz3+" "+temp.marka+" "+temp.model);
		temp1.hiz3 = 50;
		System.out.println(temp1.hiz3+" "+temp1.marka+" "+temp1.model);
		System.out.println(temp.hiz3+" "+temp.marka+" "+temp.model);
		
		Arac temp2 = new Arac();
		Araba araba = new Araba();
		Araba araba1 = new Araba(5);
	}

}
