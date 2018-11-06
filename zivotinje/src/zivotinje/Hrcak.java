package zivotinje;

public class Hrcak extends KucniLjubimac{
	
		private String boje;

		public Hrcak(String naziv, String dlaka, String boje) {
			super(naziv, dlaka);
			this.boje = boje;
		}

		public String getBoje() {
			return boje;
		}

		public void setBoje(String boje) {
			this.boje = boje;
		}

		@Override
		public String tipZabave() {
			// TODO Auto-generated method stub
			return "Hrcak zahteva:" + "igra u terarijumu" + "trcanje po tocku";
		}

		@Override
		public Integer preporucenoVremeZabave() {
			// TODO Auto-generated method stub
			return 120;
		}
		

}
