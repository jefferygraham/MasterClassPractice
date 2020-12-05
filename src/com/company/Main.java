package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemize();

        hamburger.addAddon1("tomato", 0.27);
        hamburger.addAddon2("lettuce", 0.75);
        hamburger.addAddon3("cheese", 1.13);
        System.out.println("Total price: " + hamburger.itemize());
    }
}
