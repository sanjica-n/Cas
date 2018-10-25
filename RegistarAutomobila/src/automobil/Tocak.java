package automobil;

public class Tocak {
	private Integer sirina;
	private Integer precnik;
    private TipGume tipGume;
    private TipFelne tipFelne;
    private String dozvoljenaBrzinaGume;
    


	public Tocak(Integer sirina, Integer precnik, TipGume tipGume, TipFelne tipFelne, String dozvoljenaBrzinaGume) {
		super();
		this.sirina = sirina;
		this.precnik = precnik;
		this.tipGume = TipGume.ZIMSKE;
		this.tipFelne = TipFelne.ALUMINIJUMSKA;
		this.dozvoljenaBrzinaGume = dozvoljenaBrzinaGume;
	}
    
    public String informacijeOTocku() {
    	return "Sirina "+sirina+"Precnik "+precnik+"Tip Gume "+tipGume+"Tip Felne "+tipFelne+"Dozvoljena Brzina Gume"+dozvoljenaBrzinaGume;
    }
    
   public void stampajInformacijeOTocku() {
	   System.out.println("Sirina");
   }
}
