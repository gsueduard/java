package by.gsu.pms;

import java.util.Scanner;

public class PricePurchase extends Purchase{
    private Byr discount;
    public PricePurchase(String name, Byr price, int units, Byr discount){
        super(name, price, units);
        this.discount = discount;
    }
    public PricePurchase(Scanner sc){
        super(sc.next(), new Byr(sc.nextInt()), sc.nextInt());
        this.discount =new Byr(sc.nextInt());
    }
    public Byr getDiscount(){
        return discount;
    }

    @Override
    public Byr getCost(){
        return new Byr(getPrice()).sub(discount).mul(getUnits());
    }
    protected String fieldsToString(){
        return  super.fieldsToString() + "; " + discount;
    }

    @Override
    public String toString(){
        return fieldsToString() + "; " + getCost();
    }

}
