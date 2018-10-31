package vozilo.putnicko;


public class Autobus extends PutnickoVozilo {
	
	private Boolean zglobni;
	private Integer brojStajacihMesta;
    private Double cena;
	
	public Autobus(String marka, Integer brojPutnika, Boolean kabriolet, Integer brojVrata, Boolean zglobni,
			Integer brojStajacihMesta, Double cena) {
		super(marka, brojPutnika, kabriolet, brojVrata, cena);
		this.zglobni = zglobni;
		this.brojStajacihMesta = brojStajacihMesta;
		this.cena = cena;
	}

public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

@Override
public void stampajInformacije() {
	// TODO Auto-generated method stub
	super.stampajInformacije();
	System.out.println(" Zglobni " +getZglobni() + " Broj Stajacih Mesta: " +getBrojStajacihMesta() + " Cena " + prodajnaCena());
}
	public Boolean getZglobni() {
		return zglobni;
	}


	public void setZglobni(Boolean zglobni) {
		this.zglobni = zglobni;
	}


	public Integer getBrojStajacihMesta() {
		return brojStajacihMesta;
	}


	public void setBrojStajacihMesta(Integer brojStajacihMesta) {
		this.brojStajacihMesta = brojStajacihMesta;
	}
	

	
}
