import java.util.Scanner;
public class Person1 {
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
        Person1 p1 = new Person1(); // create person1 class
        //input from user
        String name1 = input.nextLine();
        int id1 = input.nextInt();
        double cgpa1 = input.nextDouble();
        //call by reference
        p1.insertRecord(name1, id1, cgpa1);
        p1.displayRecord();
        /*Person1 p2 = new Person1();// create person2 class
        input.nextLine();
        String name2 = input.nextLine();
        int id2 = input.nextInt();
        double cgpa2 = input.nextDouble();
        p2.insertRecord(name2, id2, cgpa2);
        p2.displayRecord();
         */
    }
}
