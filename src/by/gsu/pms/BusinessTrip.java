package by.gsu.pms;

public class BusinessTrip {
    public static final int DAILY_RATE = 250;
    private String account;
    private int transport;
    private int days;

    public BusinessTrip(){
        this.account = null;
        this.transport = 0;
        this.days = 0;
    }

    public BusinessTrip(String name, int transport, int days){
        this.account = name;
        this.transport = transport;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public int getTotal(){
        return days*DAILY_RATE+transport;
    }
    public void show(){
        System.out.println("rate = "+Converter.toBYN(DAILY_RATE)
                +"\naccount = "+account+"\ntransport = "+Converter.toBYN(transport)
                +"\ndays = "+days+"\ntotal = "+Converter.toBYN(getTotal()));
    }
    @Override
    public String toString(){
        return Converter.toBYN(DAILY_RATE)+";"+account+";"+Converter.toBYN(transport)+";"+days+";"+Converter.toBYN(getTotal());
    }
}