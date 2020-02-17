package com.yarish;

public class Mango implements IFruit {
    @Override
    public void smellGood() {
        System.out.println("Smells like mango");
    }

    public void print() {
        System.out.println("printing mango receipts");
    }
}
