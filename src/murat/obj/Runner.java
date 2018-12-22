package murat.obj;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arac temp = new Arac();
		temp.koltuk = true;
		temp.setTekerlekSayisi(4);
		
		Arac temp1 = new Arac();
		temp1.koltuk = true;
		temp1.setTekerlekSayisi(4);
		
		System.out.println(temp.getTekerlekSayisi());;

		temp = temp1;//clone
		temp1.setTekerlekSayisi(5);
		
		System.out.println(temp.getTekerlekSayisi());;
	}

}
