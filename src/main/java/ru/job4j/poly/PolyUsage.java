package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plain = new Plane();
        Vehicle bus = new Bus2();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{plain, bus, train};
        for (Vehicle a: vehicles
             ) {
            a.move();
        }
    }
}
