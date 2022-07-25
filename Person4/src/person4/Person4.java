package person4;
import java.util.Scanner;

public class Person4 {

    String name;
    int code;
    double price;
    String band;
    
    public void insertValue(String sName, int sCode, double sPrice, String sBand) {

        this.name = sName;
        this.code=  sCode;
        this.price= sPrice;
        this.band=  sBand;
        
    }

    public void displayValue() {
        System.out.println("Name: " + name);
        System.out.println("CODE: " + code);
        System.out.println("PRICE: " + price);
        System.out.println("BAND: " + band);
    }

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        int i, n;

        System.out.println("Enter how many Person Do you want to insert?: ");

        n = input.nextInt();
        Person4[] person = new Person4[n];

        System.out.println("\nEnter Information of Persons.");

        for (i = 0; i < n; i++) {
            person[i] = new Person4();

            input.nextLine();
            System.out.println("Enter NAME: ");
            String sName = input.nextLine();

            System.out.println("Enter CODE No:");
            int sCode = input.nextInt();

            System.out.println("Enter PRICE:");
            int sPrice = input.nextInt();
            
            input.nextLine();
            System.out.println("Enter BAND Name: ");
            String sBand = input.nextLine();
            
            person[i].insertValue(sName, sCode, sPrice, sBand );
        }
        System.out.println("\nEnter your searching Name??");
        Scanner input2 = new Scanner(System.in);
        String name2;
        name2= input.nextLine();
        //System.out.println("\ninput="+name2);
        // System.out.println(s1.equalsIgnoreCase(s2));//true
        for(i=0;i<n;i++){
        if(name2.equalsIgnoreCase(person[i].name)){
          System.out.println("\nName is found");
          break;
        }
        else{
          System.out.println("\nName is not found");  
        }
        }
        
        String name3;
        System.out.println("\nEnter the delete Name??");
        name3= input.nextLine();
        for(i=0;i<n;i++){
        //Object name3 = new Object();
        name3 = null;
        }
        
        /*
         ////Delete Person ///////        
        System.out.println("\nEnter index number  you want to delete: ");
        int delIndex = input.nextInt();
        person[delIndex] = null;
        /*
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
        */  
        
        
        System.out.println("\nInformation of Persons.");
        for (i = 0; i < n; i++) {
            person[i].displayValue();
        }
    }
}