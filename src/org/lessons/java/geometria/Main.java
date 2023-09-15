package org.lessons.java.geometria;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
//	2. Creare una classe `Main` contenente 
//	il metodo `main()`, nel quale chiedete 
//	all’utente di inserire da console i valori 
//	di *base* e *altezza* con cui istanziare 
//	almeno 3 Rettangoli in 3 diverse variabili, 
//	stampare poi a video i lati, l'area e 
//	il perimetro di ogniuno.
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
			
		Rettangolo MyRettangolo1 = new Rettangolo();
			
		System.out.print("Base per dimensione del rettangolo 1: ");
		MyRettangolo1.base = sc.nextInt();
			
		System.out.print("Altezza per dimensione rettangolo 1: ");
		MyRettangolo1.altezza = sc.nextInt();
		
		//----------------------------------------//
		
		Rettangolo MyRettangolo2 = new Rettangolo();
		
		System.out.print("Base per dimensione rettangolo 2: ");
		MyRettangolo2.base = sc.nextInt();
			
		System.out.print("Altezza per dimensione rettangolo 2: ");
		MyRettangolo2.altezza = sc.nextInt();
		
		//----------------------------------------//
		
		Rettangolo MyRettangolo3 = new Rettangolo();
				
		System.out.print("Base per dimensione rettangolo 3: ");
		MyRettangolo3.base = sc.nextInt();
					
		System.out.print("Altezza per dimensione rettangolo 3: ");
		MyRettangolo3.altezza = sc.nextInt();
			
		
		sc.close();
		
		System.out.println("Il Perimetro del rettangolo 1 è " + MyRettangolo1.calcolaPerimetro() + " e la sua area è " + MyRettangolo1.calcolaArea());
		
		System.out.println("Il Perimetro del rettangolo 2 è " + MyRettangolo2.calcolaPerimetro() + " e la sua area è " + MyRettangolo2.calcolaArea());
		
		System.out.println("Il Perimetro del rettangolo 3 è " + MyRettangolo3.calcolaPerimetro() + " e la sua area è " + MyRettangolo3.calcolaArea());
	}
	
}
