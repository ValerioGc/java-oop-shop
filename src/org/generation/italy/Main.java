package org.generation.italy;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Product pr1 = new Product("Prodotto 1", "Descrizione prodotto 1", 10);
		Product pr2 = new Product("Prodotto 2", "Descrizione prodotto 2", 34);
		System.out.println(pr1 + "\n------------");
		System.out.println(pr2);
	}
}
