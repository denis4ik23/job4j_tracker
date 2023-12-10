package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        boolean start = true;
    }

    @Override
    public void passengers(int amount) {
        int passengers = amount;
    }

    @Override
    public double refuel(double amountFuel) {
        return amountFuel * 50.00;
    }
}
