package com.UTN.classes;

public class BeerHouse {

    private int capacity;
    private int stock;

    public BeerHouse() {
        this.capacity = 100;
        this.stock = 10;
    }

    public synchronized void incrementarStock() {
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock += 1;
        notifyAll();
    }

    public synchronized void decrementarStock() {
        while (getStock() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock -= 1;
        notifyAll();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStock() {
        return stock;
    }

    public boolean isFull() {
        if (getStock() < getCapacity())
            return false;
        else
            return true;
    }
}
