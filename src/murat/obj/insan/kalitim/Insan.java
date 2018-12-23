package murat.obj.insan.kalitim;

public class Insan {
	public String adi;
	public String soyadi;
	public String tcKNo;
	private String gozRengi;
	protected String dna;//kalitimla geciyor, protected. farkli paketten erisilemez.
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Adi : "+adi+" Soyadi : "+soyadi+" TC Kimlik No : "+tcKNo+" Göz Rengi : "+gozRengi;
	}
}
