package by.gsu.pms;

import java.io.Serializable;

public class Manager implements Serializable {
    private String LastName;
    private int age;
    private boolean DischargeOfDuties;
    public Manager (String LastName, int age, boolean DischargeOfDuties){
        this.LastName = LastName;
        this.age = age;
        this.DischargeOfDuties = DischargeOfDuties;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDischargeOfDuties() {
        return DischargeOfDuties;
    }

    public void setDischargeOfDuties(boolean DischargeOfDuties) {
        this.DischargeOfDuties = DischargeOfDuties;
    }

    @Override
    public String toString() {
        return LastName + ": " + age + "; " + DischargeOfDuties;
    }
}
