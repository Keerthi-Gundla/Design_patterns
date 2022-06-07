package org.example;

public class Tv extends ElectronicProduct{
    @Override
    public String getName() {
        return "TV";
    }

    @Override
    public double getPrice() {
        return 30000;
    }
}
