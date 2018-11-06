package osoba;

import zivotinje.Kuce;
import zivotinje.KucniLjubimac;
import zivotinjeBriga.BrigaOZivotinjama;
import zivotinjeBriga.Setnja;

public class Vlasnik {

	public void setaj(Setnja setnja) {
		Kuce kuce = (Kuce) setnja;
		System.out.println("Setam " + kuce.getNaziv() + setnjaPreporucenoVremeZabave() + " minuta dnevno ");
		
	}
	private String setnjaPreporucenoVremeZabave() {
		
		return null;
	}
	public void brigaOZivotinjama(BrigaOZivotinjama oZivotinjama) {
		KucniLjubimac kl = (KucniLjubimac) oZivotinjama;
		System.out.println(" Brinem se na sledeci nacin ");
		System.out.println(oZivotinjama.tipZabave());
		System.out.println(" Najmanje " + oZivotinjama.preporucenoVremeZabave()+ " minuta dnevno ");
		
	}
}
