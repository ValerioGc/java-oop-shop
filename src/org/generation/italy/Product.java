package org.generation.italy;

import java.util.Random;

public class Product {
	
	int code;
	String name;
	String description;
	int price;
	char eur = '\u20ac';
	int tax = 20;
	
	public Product(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;	
	}
// Random code generator
	public int getRndCode() {
		Random rnd = new Random();
		int code = rnd.nextInt(89999) + 10000;
		return code;
	}
// Taxes price calculator 
	public float afterTaxesPrice() {
		float taxPrices = this.price + ((this.price * 20) / 100); 
		return taxPrices;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + name + "\nCodice: " + getRndCode() +
				"\nDescrizione: " + description + "\nPrezzo: " + 
				price + " " + eur + "\nPrezzo con IVA: " + afterTaxesPrice() + " " + eur;
	}
	
}
