package teretno;

import vozilo.MotornoVozilo;

public class TeretnoVozilo extends MotornoVozilo {
	
	private Integer nosivost;
	private Integer zapremina;
	public static double cena;
	public TeretnoVozilo(String marka, Integer brojPutnika, Integer nosivost, Integer zapremina, double cena) {
		super(marka, brojPutnika, cena);
		this.nosivost = nosivost;
		this.zapremina = zapremina;
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
		System.out.println(" Nosivost " + getNosivost() + " Zapremia " + getZapremina());
	}
	public Integer getNosivost() {
		return nosivost;
	}

	public void setNosivost(Integer nosivost) {
		this.nosivost = nosivost;
	}

	public Integer getZapremina() {
		return zapremina;
	}

	public void setZapremina(Integer zapremina) {
		this.zapremina = zapremina;
	}
	
	@Override
	public Double prodajnaCena() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
