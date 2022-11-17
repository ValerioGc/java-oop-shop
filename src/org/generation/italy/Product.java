package org.generation.italy;

import java.util.Random;

public class Product {
	
	int code;
	String name;
	String description;
	int price;
	int tax;
	char eur = '\u20ac';
	
	public Product(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;	
		this.tax = 20;
	}
// Random code generator
	public int getRndCode() {
		Random rnd = new Random();
		int code = rnd.nextInt(89999) + 10000;
		return code;
	}
// Price Calculator 
	public int getPrice() {
		return price;
	}
// Price + Taxes calculator 
	public double afterTaxesPrice() {
		double taxPrices = ((double)this.price) + ((((double)this.price) * 20) / 100); 
		return taxPrices;
	}
@Override
	public String toString() {
		return  "Nome: " + name + 
				"\nCodice: " + getRndCode() +
				"\nDescrizione: " + description + 
				"\nPrezzo: " + getPrice() + " " + eur +
				"\nPrezzo con Iva: " + afterTaxesPrice() + " " + eur;
	}
	
}
