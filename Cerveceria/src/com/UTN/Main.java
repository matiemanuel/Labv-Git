package com.UTN;

import com.UTN.classes.BeerConsumer;
import com.UTN.classes.BeerHouse;
import com.UTN.classes.BeerProducter;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BeerHouse beerHouse = new BeerHouse();
        BeerProducter productor1 = new BeerProducter("Matias", beerHouse);
        BeerProducter productor2 = new BeerProducter("Gonzalo", beerHouse);
        BeerConsumer consumer1 = new BeerConsumer("Cintia", beerHouse);
        BeerConsumer consumer2 = new BeerConsumer("Nicolas", beerHouse);
        productor1.start();
        productor2.start();
        consumer1.start();
        consumer2.start();

    }
}
