package PersonSerachDelete;
import java.util.Scanner;

public class PersonSerachDelete {

    String name;
    int age;

    public void insertValue(String name, int b) {
        this.name = name;
        this.age = b;
    }

    public void displayValue() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age +"\n");
    }

    public void searchValue(PersonSerachDelete[] person, String searchName, int n) {
        int i, indx = 0;
        int flag = 0;
        for (i = 0; i < n; i++) {
            if (person[i].name.equalsIgnoreCase(searchName)) {
                flag = 1;
                indx = i;
                //break;
            }
        }
        if (flag == 1) {
            System.out.println("Name found at Index " + indx);
        } else if (flag == 0) {
            System.out.println("Name not found");
        }
    }

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Person Number: ");
        int n = input.nextInt();
        input.nextLine();

        PersonSerachDelete[] person = new PersonSerachDelete[n];

        for (int i = 0; i < n; i++) {
            person[i] = new PersonSerachDelete();

            System.out.println("Enter Name: ");
            String pName = input.nextLine();

            System.out.println("Enter Age:");
            int pAge = input.nextInt();
            input.nextLine();

            person[i].insertValue(pName, pAge);
        }
        System.out.println("\nInformation of Persons.");
        for (int i = 0; i < n; i++) {
            person[i].displayValue();
        }

        ////Seaarch Person ///////
        System.out.println("\nEnter name you want to search: ");
        String searchName = input.nextLine();

        PersonSerachDelete obj = new PersonSerachDelete();
        obj.searchValue(person, searchName, n);

        ////Delete Person ///////        
        System.out.println("\nEnter index number  you want to delete: ");
        int delIndex = input.nextInt();
        person[delIndex] = null;

        System.out.println("\nInformation of Persons after deletion");
        for (int i = 0; i < n; i++) {
            if (person[i] != null) {
                person[i].displayValue();
            }
        }
    }
}