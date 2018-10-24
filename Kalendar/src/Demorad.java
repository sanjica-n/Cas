

public class Demorad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Datum d =new Datum();
       d.proveriDatum();
       System.out.println(d.datum());
       
       Datum d2 = new Datum(23,10,2018);
       System.out.println(d2.datum());
       System.out.println(d2.proveriDatum());
       
       
	}

}
  