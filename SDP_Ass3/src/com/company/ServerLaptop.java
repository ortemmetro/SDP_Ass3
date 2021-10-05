package com.company;

public class ServerLaptop extends LaptopDecorator{
    public ServerLaptop(Laptop laptop) {
        super(laptop);
    }

    public String loadServer(){
        return ", and also I can launch a big server.";
    }

    @Override
    public String work() {
        return super.work() + loadServer();
    }
}
