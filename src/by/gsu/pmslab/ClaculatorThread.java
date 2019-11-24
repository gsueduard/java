package by.gsu.pmslab;

public class ClaculatorThread extends Thread {
    private int a;
    private double result = 1;
    public ClaculatorThread(int a){
        this.a=a;
    }
    public double getResult() {
        for(int i = 1; i <= 2 * a + 1; i += 2){
            result *= i;
        }
        return result;
    }
}


