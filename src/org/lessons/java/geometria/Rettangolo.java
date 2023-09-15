package org.lessons.java.geometria;

//Nel progetto java-oop-geometria creare 
//un package `org.lessons.java.geometria` 
//in cui inserire le seguenti classi:
//1. Classe `Rettangolo` caratterizzata da 
//2 attributi interi: 
//	- base
//	- altezza
//Definire un costruttore con parametri. 
//Definire inoltre 2 metodi: 
//	- calcolaArea
//	- calcolaPerimetro
//I due metodi restituiscono rispettivamente 
//l'area e il perimetro del rettangolo.

public class Rettangolo {

	public int base;
	public int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public Rettangolo() {
		// TODO Auto-generated constructor stub
	}

	int calcolaPerimetro() {
		
		return (base + altezza) * 2;
	}
	
	int calcolaArea() {
		
		return (base * altezza);
	}
	
}
