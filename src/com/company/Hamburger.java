package com.company;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String bread;

    private String addon1;
    private double addon1Price;

    private String addon2;
    private double addon2Price;

    private String addon3;
    private double addon3Price;

    private String addon4;
    private double addon4Price;

    public Hamburger(String name, String meat, double price, String bread) {

        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addAddon1(String name, double price) {
        this.addon1 = name;
        this.addon1Price = price;
    }

    public void addAddon2(String name, double price) {
        this.addon2 = name;
        this.addon2Price = price;
    }

    public void addAddon3(String name, double price) {
        this.addon3 = name;
        this.addon3Price = price;
    }

    public void addAddon4(String name, double price) {
        this.addon4 = name;
        this.addon4Price = price;
    }

    public double itemize() {

        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a "  + this.bread + " roll, with " + this.meat + ", is " + this.price);

        if (this.addon1 != null) {
            hamburgerPrice += this.addon1Price;
            System.out.println("Added " + this.addon1 + " for an extra " + this.addon1Price);
        }

        if (this.addon2 != null) {
            hamburgerPrice += this.addon2Price;
            System.out.println("Added " + this.addon2 + " for an extra " + this.addon2Price);
        }

        if (this.addon3 != null) {
            hamburgerPrice += this.addon3Price;
            System.out.println("Added " + this.addon3 + " for an extra " + this.addon3Price);
        }

        if (this.addon4 != null) {
            hamburgerPrice += this.addon4Price;
            System.out.println("Added " + this.addon4 + " for an extra " + this.addon4Price);
        }

        return hamburgerPrice;
    }
}
