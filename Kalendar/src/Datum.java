
public class Datum {

	  private Integer dan;
	  private Integer mesec;
	  private Integer godina;
	   
	  public Datum (Integer dan, Integer mesec, Integer godina) {
		   this.dan = 01;
		   this.mesec = 01;
		   this.godina = 2010;
		   
	   }
	   
	   public String datum () {
		   return dan+"."+mesec+"."+godina;
	   }
				   		   
	   
	   
	  
	   /*public Datum () {
		   this.dan = 01;
		   this.mesec = 01;
		   this.godina = 2010;
		   }*/
	   public Datum() {
		   this(01, 01, 2010)
	   }
}
