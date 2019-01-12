package murat.obj.reflection;

public class Runner {

	public static void main(String[] args) {
		int a = 5;
		Integer b = a; //Integer.valueOf(a); //autoboxing
		a = b;
		
		Object[] dizi = {1,2};
		a = (int)dizi[0]; //atama
		b = (int)dizi[0]; //autoboxing
		a = (Integer)dizi[0]; //boxing
		b = (Integer)dizi[0]; //atama
	}
}
