package by.gsu.pms;

import java.util.Scanner;

public class PurchaseFactory{
    private static enum TypeOfPurchase{
        GENERAL_PURCHASE{
            Purchase getPurchase(Scanner sc){
                return new Purchase(sc);
            }
        },
        DISCOUNT_PURCHASE{
            PricePurchase getPurchase(Scanner sc){
                return new PricePurchase(sc);
            }
        },
        PERCENT_PURCHASE{
            PercentPurchase getPurchase(Scanner sc){
                return new PercentPurchase(sc);
            }
        };
        abstract Purchase getPurchase(Scanner sc);
    }
    public static Purchase getPurchaseFromFactory(Scanner sc){
        return TypeOfPurchase.valueOf(sc.next()).getPurchase(sc);
    }
}