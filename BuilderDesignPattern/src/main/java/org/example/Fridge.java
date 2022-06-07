package org.example;

public class Fridge extends ElectronicProduct{
    @Override
    public String getName() {
        return "Fridge";
    }

    @Override
    public double getPrice() {
        return 20000;
    }
}