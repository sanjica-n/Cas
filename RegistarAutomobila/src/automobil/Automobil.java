package automobil;

public class Automobil {	
	private String marka;
	private String tip;
	private Integer brojPutnika;
	private String boja;
	private Double cena;
	private Motor motorAutomobila;
	private Tocak tocakAutomobila;
	


	public Automobil(String marka, String tip, Integer brojPutnika, String boja, Double cena, Motor motorAutomobila, Tocak tocakAutomobila) {
		super();
		this.marka = marka;
		this.tip = tip;
		this.brojPutnika = brojPutnika;
		this.boja = boja;
		this.cena = cena;
		this.motorAutomobila = motorAutomobila;
		this.tocakAutomobila = tocakAutomobila;
	
	}
	
	public String informacijeOAutomobilu() {
	return "Marka : "+marka+"tip"+tip+"broj putnika"+brojPutnika+"boja je "+boja+"cena: "+cena+"motor"+motorAutomobila.informacijeOMotoru()+"tocak"+tocakAutomobila.informacijeOTocku();
	}

	public Motor getMotorAutomobila() {
		return motorAutomobila;
	}

	public void setMotorAutomobila(Motor motorAutomobila) {
		this.motorAutomobila = motorAutomobila;
	}

	public Tocak getTocakAutomobila() {
		return tocakAutomobila;
	}

	public void setTocakAutomobila(Tocak tocakAutomobila) {
		this.tocakAutomobila = tocakAutomobila;
	}

	
		
	}	 

