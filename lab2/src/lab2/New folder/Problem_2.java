package lab2;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = myObj.nextLine();
        System.out.println("Enter Age: ");
        int age = myObj.nextInt();
        myObj.nextLine();  
        System.out.println("Enter Department: ");
        String department = myObj.nextLine();
        System.out.println("Enter Section: ");
        String sec = myObj.nextLine();
        System.out.println("Enter CGPA: ");
        double CGPA = myObj.nextDouble();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: "+department);
        System.out.println("Section: "+sec);
        System.out.println("CGPA: " + CGPA);
    }
}
