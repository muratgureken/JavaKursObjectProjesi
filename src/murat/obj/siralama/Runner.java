package murat.obj.siralama;

public class Runner {

	public static void main(String[] args) {
		Araba a1 = new Araba(2000, "Toyota");
		Araba a2 = new Araba(2019, "bmw");
		Araba a3 = new Araba(2018, "mercedes");
		Araba a4 = new Araba(2009, "ford");
		Araba a5 = new Araba(2011, "porche");
		
		Canta c1 = new Canta(1000, "Channel");
		Canta c2 = new Canta(1500, "MichaelKors");
		Canta c3 = new Canta(2000, "Dior");
		Canta c4 = new Canta(1200, "Versace");
		Canta c5 = new Canta(200, "Pazardan");
		
		Siralanabilir[] temp = {a1,a2,a3,a4,a5};
		System.out.println("ARABALAR");
		sirala(temp);
		Siralanabilir[] temp1 = {c1,c2,c3,c4,c5};
		System.out.println();
		System.out.println("CANTALAR");
		sirala(temp1);
	}
	
	public static void sirala(Siralanabilir[] temp)
	{
		Siralanabilir deger;
		
		for(int i=0;i<temp.length;i++)
		{
			for(int j=i+1;j<temp.length;j++)
			{
				if(temp[j].karsilastir(temp[i])==1)
				{
					deger = temp[j];
					temp[j] = temp[i];
					temp[i] = deger;
				}
			}
		}
		
		for (Siralanabilir siralanabilir : temp) {
			siralanabilir.veriYaz();
		}
	}

}
