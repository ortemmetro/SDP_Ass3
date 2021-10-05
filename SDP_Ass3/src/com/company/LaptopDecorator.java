package com.company;

public class LaptopDecorator implements Laptop {

    Laptop laptop;

    public LaptopDecorator(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String work() {
        return laptop.work();
    }
}
