import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import automobil.Automobil;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Automobil> listaAutomobila = new ArrayList<>();
		
		
		
		
		
      Automobil ford = new Automobil("Ford", "Fini", 5, "Crna", 100d);
      
      //System.out.println(ford.informacijeOAutomobilu());
      listaAutomobila.add(ford);
      listaAutomobila.add(new Automobil("Fiat", "Stilo", 5,"Bela", 200d));
      listaAutomobila.add(new Automobil("Opel", "T", 5,"Crvena", 300d));
      listaAutomobila.add(new Automobil("Yugo", "Kec", 5,"Zuta", 200d));
      System.out.println("Unesite zeljeno vozilo");
      Scanner input = new Scanner(System.in);
      System.out.println("Unesite tip vozila");
      String tip = input.next();
      System.out.println("Unesite marku");
      String marka = input.next();
      System.out.println("Unesite broj Putnika");
      Integer brojPutnika = input.nextInt();
      System.out.println("Unesite boju");
      String boja = input.next();
      System.out.println("Unesite cenu");
      Double cena = input.nextDouble();
      
      
      
      for(Automobil automobil : listaAutomobila) {
    	  System.out.println(automobil.informacijeOAutomobilu());
      }
	}   

}
