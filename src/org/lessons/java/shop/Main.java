package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Laptop", "Laptop da gaming", 1500.0, 22.0);
        
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
        System.out.println("Prezzo base: " + prodotto.getPrezzoBase() + " €");
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva() + " €");
    }
}
