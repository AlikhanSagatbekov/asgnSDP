package net.proselyte.basepatterns.creational.strategy;

public class sleeping implements activity{
    @Override
    public void justDoIt(){
        System.out.printf("sleeping...");
    }
}
