package prosenjit_labarraylist;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*;
public class Prosenjit_Employee {

    private String name;
    private int id;
    private int salary;

    public Prosenjit_Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    //Display Method 
    public static void ProsenjitDisplay(ArrayList<Prosenjit_Employee> per) {
        System.out.println("\n***Display****:\n");
        //sorting
        Collections.sort(per);
        for (int i = 0; i < per.size(); i++) {
            System.out.println("Name: " + per.get(i).name);
            System.out.println("ID: " + per.get(i).id);
            System.out.println("Salary: " + per.get(i).salary);
        }
    }

    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Prosenjit_Employee> per = new ArrayList<>();
        System.out.println("How many person do you want to insert?");
        int n = input.nextInt();
        for (int j = 0; j < n; j++) {
            input.nextLine();
            System.out.println("Enter Name");
            String a = input.nextLine();
            System.out.println("Enter ID");
            int b = input.nextInt();
            System.out.println("Enter Salary");
            int c = input.nextInt();
            Prosenjit_Employee employee = new Prosenjit_Employee(a, b, c);
            per.add(employee);
        }
        //Person p1 = new Person("jit", 22);
        //Person p2 = new Person("prosenjit", 23);
        //per.add(p1);
        //per.add(p2);
        //per.add(new Person("roy", 22));
        ProsenjitDisplay(per);

        //search salary
        int find = 68000;  //id=68*1000
        for (int j = 0; j < per.size(); j++) {
            if (per.get(j).salary > find) {
                System.out.println("Name:" + per.get(j).name);
                System.out.println("ID:" + per.get(j).id);
                System.out.println("SALARY:" + per.get(j).salary);
            }
        }

        Scanner input3 = new Scanner(System.in);
        //Delete
        char ch = 't';
        for (int i = 0; i < per.size(); i++) {
            //char str=per.get(i).name[0];
            if (per.get(i).name[0].compareToIgnoreCase(ch) == 0) {
                per.remove(ch);
                System.out.println("After Delete Person List");
                for (i = 0; i < per.size(); i++) {
                    System.out.println("Name: " + per.get(i).name);
                    System.out.println("Id: " + per.get(i).id);
                    System.out.println("Salary: " + per.get(i).salary);
                }
            }
        }
    }
}
