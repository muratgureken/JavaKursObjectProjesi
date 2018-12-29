package murat.obj.insan.kalitim.genel;

public class Runner {

	public static void main(String[] args) {
		Arac.hiz=100; //static degiskene, instance yaratmadan da deger atanabilir.
		
		Arac temp = new Arac();
		/*temp.hiz = 100;*/ //hiz static oldugu icin uretilen diger arac khizi da 100 olacak.
		temp.model = "2018";
		temp.marka = "Toyota";
		
		Arac temp1 = new Arac();
		temp1.model = "2019";
		temp1.marka = "Honda";
		System.out.println(temp1.hiz+" "+temp1.marka+" "+temp1.model);
		System.out.println(temp.hiz+" "+temp.marka+" "+temp.model);
		temp1.hiz = 50;
		System.out.println(temp1.hiz+" "+temp1.marka+" "+temp1.model);
		System.out.println(temp.hiz+" "+temp.marka+" "+temp.model);
	}

}
