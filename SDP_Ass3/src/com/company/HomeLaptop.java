package com.company;

public class HomeLaptop extends LaptopDecorator{
    public HomeLaptop(Laptop laptop) {
        super(laptop);
    }

    public String MakeNotes(){
        return " I can save your notes";
    }

    @Override
    public String work() {
        return super.work() + MakeNotes();
    }
}
