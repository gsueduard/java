package by.gsu.pms;

import java.util.Objects;
import java.util.Scanner;

public  class Purchase{
    private String name;
    private Byr price;
    private final int units;
    public Purchase(){this(null,new Byr(0),0);}
    public Purchase(String name, Byr price, int units){
        this.name = name;
        this.price = price;
        this.units = units;
    }
    public Purchase(Scanner sc){
        this(sc.next(),new Byr(sc.nextInt()),sc.nextInt());
    }
    public String getName(){
        return name;
    }
    public Byr getPrice(){
        return price;
    }
    public int getUnits(){
        return units;
    }
    public Byr getCost(){
        return new Byr(price).mul(units);
    }

    @Override
    public String toString(){
        return fieldsToString() + "; " + getCost();
    }
    protected String fieldsToString(){
        return  name + ": " + price + "; " + units;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return units == purchase.units &&
                name.equals(purchase.name) &&
                price.equals(purchase.price);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, price, units);
    }
}