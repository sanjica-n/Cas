import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import automobil.Automobil;
import automobil.Motor;

public class Aplikacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Automobil> listaAutomobila = new ArrayList<>();
		Motor benzinac16 = new Motor(1600, 120,"benzin");
		
      Automobil ford = new Automobil("Ford", "Fini", 5, "Crna", 100d, benzinac16);
      
      
      //System.out.println(ford.informacijeOAutomobilu());
      listaAutomobila.add(ford);
      listaAutomobila.add(new Automobil("Fiat", "Stilo", 5,"Bela", 200d,benzinac16));
      listaAutomobila.add(new Automobil("Opel", "T", 5,"Crvena", 300d, benzinac16));
      listaAutomobila.add(new Automobil("Yugo", "Kec", 5,"Zuta", 200d, benzinac16));
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
      
      Automobil unetiAutomobil = new Automobil(marka, tip, brojPutnika, boja, cena, benzinac16);
		System.out.println("Uspesno ste dodali automobil " + unetiAutomobil.informacijeOAutomobilu());
       listaAutomobila.add(unetiAutomobil);
      
      
    //Koristimo for petlju kako bismo prikazali sve automobile iz liste
    		System.out.println("***Vozila na lageru: / Lista vozila:***");
    		for (Automobil automobil : listaAutomobila) {
    			System.out.println(automobil.informacijeOAutomobilu());
    }
      
	}   

}
