package by.gsu.pms;

public class Byr {
    private int kopeck;
    public Byr(int value){
        this.kopeck = value;
    }
    public Byr(int rubs, int coins){
        this(rubs*100+coins);
    }
    public Byr(Byr ob){
        this(ob.kopeck);
    }
    public int getRubs(){
        return kopeck /100;
    }
    public int getCoins(){
        return  kopeck %100;
    }

    @Override
    public String toString(){
        return kopeck / 100 + "." + kopeck / 10 % 10 + kopeck % 10;
    }
    public Byr sub(Byr ob){
        kopeck -= ob.kopeck;
        return this;
    }
    public Byr sub(int k){
        kopeck -= k;
        return this;
    }
    public Byr mul(int k){
        kopeck *= k;
        return this;
    }
    public Byr mul(double k){
        kopeck *= k;
        return this;
    }
    public int compareTo(Byr byr){
        return kopeck - byr.kopeck;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Byr byr1 = (Byr) o;
        return kopeck == byr1.kopeck;
    }
}