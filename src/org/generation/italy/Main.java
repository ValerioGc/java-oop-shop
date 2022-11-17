package org.generation.italy;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int rndPrice = rnd.nextInt(148) + 2;
		int rndPrice2 = rnd.nextInt(148) + 2;
		Product pr1 = new Product("Prodotto 1", "Descrizione prodotto 1", rndPrice);
		Product pr2 = new Product("Prodotto 2", "Descrizione prodotto 2", rndPrice2);
		Product pr3 = new Product("Prodotto 3", "Descrizione prodotto 3", (rndPrice2 + rndPrice));
		System.out.println(pr1 + "\n------------");
		System.out.println(pr2 + "\n------------");
		System.out.println(pr3);
	}
}
