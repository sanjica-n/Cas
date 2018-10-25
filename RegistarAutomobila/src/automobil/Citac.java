package automobil;

import java.util.Scanner;

public class Citac {
 public static Tocak unesiTocak() {
	 
	 System.out.println("***Unesite tocak: ");
	 Scanner input = new Scanner (System.in);
	 System.out.println("***Unesite sirinu: ");
	 Integer sirina = input.nextInt();
	 Scanner input1 = new Scanner (System.in);
	 System.out.println("***Unesite precnik: ");
	 Integer precnik = input1.nextInt();
	 System.out.println("***Unesite tip gume: (ZIMSKE/LETNJE):");
	 String pomString = input.next();
	 TipGume tipGume = TipGume.valueOf(pomString);
	 System.out.println("***Unesite tip felne: (ALUMINIJUMSKA):");
	 pomString = input.next();
	 TipFelne felne = TipFelne.valueOf(pomString);
	 System.out.println("***Unesite max brzinu gume:");
	 String dozvoljenaBrzinaGume = input.next();
	 Tocak t = new Tocak(sirina, precnik,tipGume, felne, dozvoljenaBrzinaGume);
	 
	  
	 Tocak t1 = new Tocak(null, null, null, null, null);
	 return t1;
 }
}
