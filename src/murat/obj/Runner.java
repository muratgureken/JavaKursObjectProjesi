package murat.obj;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arac temp = new Arac();
		temp.koltuk = true;
		temp.setTekerlekSayisi(4);
		temp.setSurucuAdi("Murat");
		System.out.println(temp.getSurucuAdi());
		temp.setSurucuAdi("Murat","Gureken");
		System.out.println(temp.getSurucuAdi());
		
		Arac temp1 = new Arac();
		temp1.koltuk = true;
		temp1.setTekerlekSayisi(4);
		
		System.out.println(temp.getTekerlekSayisi());

		temp = temp1;//clone
		temp1.setTekerlekSayisi(5);
		
		System.out.println(temp.getTekerlekSayisi());
		
		Arac temp2 = new Arac(2);
		
		System.out.println(temp1.getClass());
		System.out.println("toString "+temp1.toString());
	}

}
