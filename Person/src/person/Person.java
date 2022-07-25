package person;
import java.util.Scanner;
public class Person {
    String name;
    int age;

    public void insertValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person's name : ");
        name = sc.nextLine();
        System.out.print("Enter person's age : ");
        age = sc.nextInt();
    }

    public void displayValue() {
        System.out.println("\n\nDetails about person : ");
        System.out.println("Name = " + name + "\nAge = " + age);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of person you enter?");
        int n=input.nextInt();
        ////////Object Create////////////
        Person[] people = new Person[n];
        /////////Input/////////////////
        for(int i=0;i<n;i++){
        people[i] = new Person();
        people[i].insertValue();
        }
        /////////Display///////////
        for(int j=0;j<n;j++){
        people[j].displayValue();
    }
  }
}