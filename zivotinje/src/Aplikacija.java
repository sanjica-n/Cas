import osoba.Vlasnik;
import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinje.Ribice;

public class Aplikacija {

	public static void main(String[] args) {
		Vlasnik vlasnik = new Vlasnik();
		Kuce ker = new Kuce ("Zuca", "tacno", "DODZ", "netacno");
		KucniLjubimac ribica = new Ribice ("Milunka", "netacno", true);
				
				
		vlasnik.setaj(ker);
		//vlasnik.setaj(setnja);
		
        vlasnik.brigaOZivotinjama(ker);
        vlasnik.brigaOZivotinjama(ribica);
	}

}
