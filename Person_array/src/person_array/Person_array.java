package person_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Person_array {

    private String name;
    private int age;

    public Person_array(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person_array> per = new ArrayList<>();

        System.out.println("How many person do you want to insert?");
        int n = input.nextInt();
        for (int j = 0; j < n; j++) {
            input.nextLine();
            System.out.println("Enter Name");
            String a = input.nextLine();
            System.out.println("Enter Age");
            int b = input.nextInt();
            per.add(new Person_array(a, b));
        }
        //Person p1 = new Person("jit", 22);
        //Person p2 = new Person("prosenjit", 23);
        //per.add(p1);
        //per.add(p2);
        //per.add(new Person("roy", 22));

        System.out.println("\n***Display:\n");
        for (int i = 0; i < per.size(); i++) {
            System.out.println("Name: " + per.get(i).name);
            System.out.println("Age: " + per.get(i).age);
        }
        // search
        //s1.compareTo(s2)
       // System.out.println("Enter the name you want to search?");
        // Scanner input2 = new Scanner(System.in);
//        String find = input.nextLine();
//        for (int j = 0; j < per.size(); j++) {
//            if (per.get(j).name.compareToIgnoreCase(find) == 0) {
//                System.out.println(" " + find + " is found in " + (j + 1) + " no index");
//                break;
//            } else {
//                System.out.println("Not found!");
//            }
//        }
        //Modify

        Scanner input3 = new Scanner(System.in);
   //     System.out.println("Enter the name you want to modify?");
//        String str = input3.nextLine();
//        for (int j = 0; j < per.size(); j++) {
//            if (per.get(j).name.compareToIgnoreCase(str) == 0) {
//                System.out.println("Enter Modify Name?");
//                String str2 = input.nextLine();
//                    //per.set(1, 100);
//                //per.set.name(j,"str2")
//                per.set(j, new Person_array("str2", 10));
//                break;
//            } 
//            
//            else {
//                System.out.println("Can't Modify! Invalid data!");
//            }
            
             per.set(1, new Person_array("mam", 10));
        System.out.println("\n***Display after update:\n");
        for (int i = 0; i < per.size(); i++) {
            System.out.println("Name: " + per.get(i).name);
            System.out.println("Age: " + per.get(i).age);
        }
            //Delete
//            System.out.println("Enter the index number you want to delete?");
//            int idx = input.nextInt();
//            per.remove(idx);
//            System.out.println("After Delete Person List");
//            for (int i = 0; i < per.size(); i++) {
//                System.out.println("Name: " + per.get(i).name);
//                System.out.println("Age: " + per.get(i).age);
//            }
        }
    private int compareToIgnoreCase(String find) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}