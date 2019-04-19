package by.gsu.pms;

public class Converter {
    public static String toBYN(int coins){
        return coins/100 + "." + coins/10%10 + coins % 10+" BYN";
    }
}