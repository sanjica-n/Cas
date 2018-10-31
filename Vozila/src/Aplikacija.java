import teretno.Kamion;
import teretno.TeretnoVozilo;
import vozilo.MotornoVozilo;
import vozilo.putnicko.Autobus;
import vozilo.putnicko.PutnickoVozilo;
import java.lang.*;

public class Aplikacija {

	public static void main(String[] args) {
		
		MotornoVozilo punto = new PutnickoVozilo(" Fiat ", 4, false, 3, 100d);
		punto.stampajInformacije();
       
		MotornoVozilo fap = new TeretnoVozilo(null, 500, 30, null, 100d );
		fap.stampajInformacije();
		
		MotornoVozilo ikarbus = new Autobus("Ikar", 5, false, 5,  true, 5,  100d );
		ikarbus.stampajInformacije();
		
		MotornoVozilo kam = new Kamion("Drfs", 10, 400, 40, 100d);
		kam.stampajInformacije();
	}

}
