package by.gsu.pms;

import java.util.Scanner;

public class PercentPurchase extends Purchase{
    private static final int DISCOUNT_LINE = 14;
    private final double percent;

    public PercentPurchase(String name, Byr price, int units, double percent){
        super(name, price, units);
        this.percent = percent;
    }
    public PercentPurchase(Scanner sc){
        super(sc.next(),new Byr(sc.nextInt()), sc.nextInt());
        this.percent = sc.nextDouble();
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public Byr getCost(){
        Byr cost = super.getCost();
        if (getUnits() > DISCOUNT_LINE){
            return cost.mul(1 - percent / 100);
        }else{
            return cost;
        }
    }
    protected String fieldsToString(){
        return  super.fieldsToString() + "; " + percent;
    }

    @Override
    public String toString(){
        return fieldsToString() + "; " + getCost();
    }
}
