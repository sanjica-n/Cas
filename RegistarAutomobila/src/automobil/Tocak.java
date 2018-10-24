package automobil;

public class Tocak {
	private Integer sirina;
	private Integer precnik;
    private String tipGume;
    private String tipFelne;
    private String dozvoljenaBrzinaGume;
    
	public Tocak(Integer sirina, Integer precnik, String tipGume, String tipFelne, String dozvoljenaBrzinaGume) {
		super();
		this.sirina = sirina;
		this.precnik = precnik;
		this.tipGume = tipGume;
		this.tipFelne = tipFelne;
		this.dozvoljenaBrzinaGume = dozvoljenaBrzinaGume;
	}
    
    public String informacijeOTocku() {
    	return "Sirina "+sirina+"Precnik "+precnik+"Tip Gume "+tipGume+"Tip Felne "+tipFelne+"Dozvoljena Brzina Gume"+dozvoljenaBrzinaGume;
    }
    
   public void stampajInformacijeOTocku() {
	   System.out.println("Sirina");
   }
}
