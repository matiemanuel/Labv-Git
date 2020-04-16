package com.UTN.classes;

public class BeerProducter extends Thread{

    private BeerHouse beerhouse;
    private String name;

    public BeerProducter(String name, BeerHouse beerhouse){
        this.name = name;
        this.beerhouse = beerhouse;
    }

    public void producir(){
        beerhouse.incrementarStock();
        System.out.println(name + " produjo una cerveza. Stock total: " + beerhouse.getStock());
        try {
            sleep((int)(Math.random() * 1000));
        } catch (InterruptedException e) { }
    }

    @Override
    public void run() {
        while(beerhouse.getStock()!=0){
            producir();
        }
    }
}
