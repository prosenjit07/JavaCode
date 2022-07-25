package person5;
import java.util.Scanner;

public class Person5 {
    String name;
    int age;
    public void insertValue(String sName, int sAge) {
        this.name = sName;
        this.age = sAge;
    }
    public void displayValue() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        int i, n;
        System.out.println("Enter how many Person you want to insert: ");
        n = input.nextInt();
        Person5[] person = new Person5[n];
        System.out.println("\nEnter Information of Persons.");
        for (i = 0; i < n; i++) {
            person[i] = new Person5();
            input.nextLine();
            System.out.println("Enter name: ");
            String sName = input.nextLine();
            System.out.println("Enter age:");
            int sAge = input.nextInt();
            person[i].insertValue(sName, sAge);
        }
        System.out.println("\nInformation of Persons.");
        for (i = 0; i < n; i++) {
            person[i].displayValue();
        }
    }
}