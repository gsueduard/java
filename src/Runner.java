import by.gsu.pms.Manager;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        final String FILE_NAME = "manager.dat";

        Manager[] managers = new Manager[ARRAY_SIZE];

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME)); Scanner in = new Scanner(System.in)){
            for (int i = 0; i < ARRAY_SIZE; i++){

                System.out.print("Input name: ");
                String name = in.next();
                System.out.print("Input age: ");
                int age = in.nextInt();
                System.out.print("DischargeOfDuties: ");
                boolean DischargeOfDuties = in.nextBoolean();
                oos.writeObject(new Manager(name, age, DischargeOfDuties));
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            for (int i = 0; i < ARRAY_SIZE; i++){
                managers[i] = (Manager) ois.readObject();
            }
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

        for (Manager i : managers) {
            System.out.println(i);
        }
        System.out.println("____________\n");

        Arrays.sort(managers,new Comparator<Manager>(){
            public int compare(Manager o1, Manager o2){
                return o1.getAge() - o2.getAge();
            }
        });
        for (Manager i : managers) {
            System.out.println(i);
        }
        System.out.println("______________\n");
        Arrays.sort(managers,new Comparator<Manager>(){
            public int compare(Manager o1, Manager o2){
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for (Manager i : managers) {

            System.out.println(i);
        }
        int sum = 0;
        int duties = 0;
        for (Manager i : managers){
            sum += i.getAge();
            if (i.isDischargeOfDuties()){
                duties += 1;
            }
        }
        System.out.println("average value: " + sum / managers.length);
        System.out.println("The number of employees who cope with the responsibilities: " + duties);
    }
}
