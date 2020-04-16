package com.UTN.classes;

public class BeerConsumer extends Thread {

    private BeerHouse beerhouse;
    private String name;

    public BeerConsumer(String name,BeerHouse beerhouse){
        this.name = name;
        this.beerhouse = beerhouse;
    }

    public void consumir(){
        beerhouse.decrementarStock();
        System.out.println(name + " bebió una cerveza. Stock total: " + beerhouse.getStock());
        try {
            sleep((int)(Math.random() * 1000));
        } catch (InterruptedException e) { }
    }

    @Override
    public void run() {
        while(beerhouse.getStock()!=0){
            consumir();
        }
    }

}
