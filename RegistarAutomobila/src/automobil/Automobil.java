package automobil;

public class Automobil {	
	private String marka;
	private String tip;
	private Integer brojPutnika;
	private String boja;
	private Double cena;
	


	public Automobil(String marka, String tip, Integer brojPutnika, String boja, Double cena) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnika = brojPutnika;
		this.boja = boja;
		this.cena = cena;
	
	}
	
	public String informacijeOAutomobilu() {
	return "Marka : "+marka+"tip"+tip+"broj putnika"+brojPutnika+"boja je"+boja+"cena: "+cena;
	}	 
}
