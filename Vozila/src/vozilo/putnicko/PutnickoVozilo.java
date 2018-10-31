package vozilo.putnicko;

import utilis.Formateri;
import vozilo.MotornoVozilo;

public class PutnickoVozilo extends MotornoVozilo{

	private Boolean kabriolet;
	private Integer brojVrata;
	private Double cena;
	
	public PutnickoVozilo(String marka, Integer brojPutnika, Boolean kabriolet, Integer brojVrata, Double cena) {
		super(marka, brojPutnika, cena);
		this.kabriolet = kabriolet;
		this.brojVrata = brojVrata;
		this.cena = cena;
	}
	
@Override
public void stampajInformacije() {
	// TODO Auto-generated method stub
	super.stampajInformacije();
	System.out.println(" Tip Vozila je putnicko, kabriolet " + Formateri.format(getKabriolet()) + " broj vrata " + getBrojVrata() + " Cena " + prodajnaCena());
}

	public Boolean getKabriolet() {
		return kabriolet;
	}

	public void setKabriolet(Boolean kabriolet) {
		this.kabriolet = kabriolet;
	}

	public Integer getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(Integer brojVrata) {
		this.brojVrata = brojVrata;
	}

	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return null;
	}
          
	 
}
