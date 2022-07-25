package student3;
import java.util.Scanner;
public class Student3 {
    String name;
    int id;
    double cgpa; 

    public void insertRecord(String jit, int id, double cgpa) {
        this.name = jit;
        this.id = id;
        this.cgpa = cgpa;
    }

    public void displayRecord() {
        System.out.println("The name: " + name);
        System.out.println("id: " + id);
        System.out.println("cgpa: " + cgpa);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // create student1 obj
        Student3 p1 = new Student3(); 
        //input from user
        System.out.println("Enter name of student1:");
        String name1 = input.nextLine();
        System.out.println("Enter ID of studen1:");
        int id1 = input.nextInt();
        System.out.println("Enter CGPA of studen1:");
        double cgpa1 = input.nextDouble();
        //call by reference
        p1.insertRecord(name1, id1, cgpa1);
        p1.displayRecord();
        Student3 p2 = new Student3();
         // create Student2 obj
        System.out.println("Enter name of student2:");
        input.nextLine();
        String name2 = input.nextLine();
        System.out.println("Enter ID of studen2:");
        int id2 = input.nextInt();
        System.out.println("Enter CGPA of studen2:");
        double cgpa2 = input.nextDouble();
        p2.insertRecord(name2, id2, cgpa2);
        p2.displayRecord();
    }
}
