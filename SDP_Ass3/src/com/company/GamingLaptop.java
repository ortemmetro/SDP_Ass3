package com.company;

public class GamingLaptop extends LaptopDecorator{

    public GamingLaptop(Laptop laptop) {
        super(laptop);
    }

    public String playGames(){
        return " and you can play games on me";
    }

    @Override
    public String work() {
        return super.work() + playGames();
    }
}
