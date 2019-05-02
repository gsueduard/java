import by.gsu.pms.Manager;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Manager[] Manager = {
                new Manager("Meepo", 21, false),
                new Manager("Baratrom", 28, true),
                new Manager("Alesha", 30, false),
                new Manager("Sokolov", 45, false),
                new Manager("Koruga", 24, true),
                new Manager("Mamonov", 24, true),
                new Manager("Pankov", 55, true),
                new Manager("Kolosov", 48, true),
                new Manager("Korach", 46, true),
                new Manager("Abakanovch", 38, true)
        };
        for (Manager i : Manager) {
            System.out.println(i);
        }
        System.out.println("____________\n");

        Arrays.sort(Manager,new Comparator<Manager>(){
            public int compare(Manager o1, Manager o2){
                return o1.getAge()-o2.getAge();
            }
        });
        for (Manager i : Manager) {
            System.out.println(i);
        }
        System.out.println("______________\n");
        Arrays.sort(Manager,new Comparator<Manager>(){
            public int compare(Manager o1, Manager o2){
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for (Manager i : Manager) {

            System.out.println(i);
        }
        int sum = 0;
        int duties = 0;
        for (Manager i : Manager){
            sum += i.getAge();
            if (i.isDischargeOfDuties()){
                duties += 1;
            }
        }
        System.out.println("Среднее значение: " + sum / 10);
        System.out.println("Количество работников, которые справляются с обязанностями: " + duties);
    }
}
