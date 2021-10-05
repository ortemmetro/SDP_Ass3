package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop Laptop = new ServerLaptop(new GamingLaptop(new HomeLaptop(new OfficeLaptop())));

        System.out.println(Laptop.work());
    }
}
