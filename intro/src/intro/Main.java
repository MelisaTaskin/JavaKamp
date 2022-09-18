package intro;

import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
		
	System.out.println("Hello world!");
	
	String ortaMetin = "ilginizi çekebilir";
	String altMetin = "vade süresi";
	System.out.println(ortaMetin);
	System.out.println(altMetin);
	
	int vade = 12 ; 
	double dolarDun = 18.25;
	double dolarBugun = 18.30;
	
	boolean dolarDustuMu = false ; 
	
	String okYonu = "d";
	okYonu = "down.svg";
	
	if (dolarDun>dolarBugun) {
		okYonu = "down.svg";

		
		System.out.println(okYonu);
		
	} else if(dolarDun<dolarBugun) {
		okYonu="up.svg";
		System.out.println(okYonu);
		
	}
	
	else {
		okYonu="equal.svg";
		System.out.println(okYonu);
	
	}
	String [] krediler = {"hızlı kredi ","maaşını halkbanktan","mutlu emekli "};	
	
	System.out.println(krediler[0]);
	System.out.println(krediler[1]);

	System.out.println(krediler[2]);
	
    for (int i = 0; i < krediler.length; i++) {
    	
    	System.out.println(krediler[i]);
    	
    	
    	
    	
	 
	
}

	
	
	
	
	
	
		
		
		
		

	}

}
