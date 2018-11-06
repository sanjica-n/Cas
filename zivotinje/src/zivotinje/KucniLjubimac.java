package zivotinje;

import zivotinjeBriga.BrigaOZivotinjama;

public abstract class KucniLjubimac implements BrigaOZivotinjama{

	     private String naziv;
	     private String dlaka;
	     
		public KucniLjubimac(String naziv, String dlaka) {
			super();
			this.naziv = naziv;
			this.dlaka = dlaka;
			
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public String getDlaka() {
			return dlaka;
		}

		public void setDlaka(String dlaka) {
			this.dlaka = dlaka;
		}
	     
	     
}
