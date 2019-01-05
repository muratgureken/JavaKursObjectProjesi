package murat.obj.insan.kalitim.genel;

public class Runner2 {

	public static void main(String[] args) {
		Arac.hiz3 = 3;
		Arac temp = new Arac();
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
		
		Arac temp3 = new Arac();
		temp.setHiz(30);
		Arac.setHiz(45);
		System.out.println(Arac.hiz3);
		System.out.println(temp.hiz3);
		
		Arac arac = new Arac();
		System.out.println(arac.hiz3);
		

	}

}
