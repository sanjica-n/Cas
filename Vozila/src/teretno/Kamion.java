package teretno;



public class Kamion extends TeretnoVozilo {

	public Kamion(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, double cena) {
		super(marka, brojPutnika, nosivost, zapremina, cena);
	    
	}
	
	@Override
	public void stampajInformacije() {
		// TODO Auto-generated method stub
		super.stampajInformacije();
		System.out.println(" Kamion ima nosivost " + getNosivost() + "Prodajna Cena " + prodajnaCena());
		
	}

	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return null;
	}


}
