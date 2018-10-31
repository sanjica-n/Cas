package vozilo;

public abstract class MotornoVozilo {
	 private String marka;
	 private Integer brojPutnika;
	 private double cena;
	 

	public MotornoVozilo(String marka, Integer brojPutnika, double cena) {
		super();
		this.marka = marka;
		this.brojPutnika = brojPutnika;
		this.cena = cena;
	}
	public abstract Double prodajnaCena();
	
	public void stampajInformacije() {
		System.out.println("Marka vozila je" + getMarka()+ ", broj putnika je" + getBrojPutnika() + " Cena " +getCena());
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public Integer getBrojPutnika() {
		return brojPutnika;
	}
	public void setBrojPutnika(Integer brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}

	
	 
}
