package prosenjitcar;
import java.util.Scanner;
public class Myclass {
// search fuction
    public void search(ProsenjitCar[] arr, int n) {
        Scanner input = new Scanner(System.in);
        int i,keyi;
        int found = 0, index = 0;
        String keyn;
        String keycg;
        System.out.println("How you want to search?");
        System.out.println("1. By Name. \n2. By code. \n3. By Brand.");
        int choice;
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1 :
            {
                input.nextLine();
                System.out.println("Enter car model  name: ");
                keyn = input.nextLine();
                for (i = 0; i < n; i++) {
                    if (arr[i].getModel().equalsIgnoreCase(keyn)) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("car found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }

            case 2 :{
                System.out.println("Enter your car code: ");
                keyi = input.nextInt();
                for (i = 0; i < n; i++) {
                    if (arr[i].getCode() == keyi) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("Car found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }

            case 3 : {
                input.nextLine();
                System.out.println("Enter your Car Brand: ");
                keycg = input.nextLine();
                for (i = 0; i < n; i++) {
                    if (arr[i].getBrand().equalsIgnoreCase(keycg)) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("Car found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }
            default :
                System.out.println("You selected wrong option Please try again (1 to 3)");
        }
    }
// Find maximum car price
    public void getLargest(ProsenjitCar[] arr, int n) {
        double maxi =arr[0].getPrice();
        for (int i = 0; i < n; i++) {
                if (maxi< arr[i].getPrice()) {
                    maxi = arr[i].getPrice();
                }
            }
        System.out.println("Expensive Car is= "+maxi);
        }

//Main fuction
    public static void main(String[] args) {
        Scanner ProsenjitInput = new Scanner(System.in);
        int n, i;
        System.out.println("How many car do  you want to insert: ");
        n = ProsenjitInput.nextInt();
        ProsenjitInput.nextLine();
        ProsenjitCar[] arr = new ProsenjitCar[n];
        for (i = 0; i < n; i++) {
            arr[i] = new ProsenjitCar("Default", 1, "None", 0.0);
            System.out.println("Enter car model: "+(i+1));
            String sm = ProsenjitInput.nextLine();
            arr[i].setModel(sm);
            System.out.println("Enter car Code: ");
            int sc = ProsenjitInput.nextInt();
            arr[i].setCode(sc);
            ProsenjitInput.nextLine();
            System.out.println("Enter  car brand: ");
            String sb = ProsenjitInput.nextLine();
            arr[i].setBrand(sb);
            System.out.println("Enter car price: ");
            double sp = ProsenjitInput.nextDouble();
            arr[i].setPrice(sp);
            ProsenjitInput.nextLine();
        }
        //Display car details
        for (i = 0; i < n; i++) {
            System.out.println("Model = " + arr[i].getModel());
            System.out.println("Code = " + arr[i].getCode());
            System.out.println("Brand = " + arr[i].getBrand());
            System.out.println("Price = " + arr[i].getPrice());
        }
        Myclass ob1 = new Myclass();
        ob1.search(arr, n);
        //Display range
        //Call most expensive car
        System.out.println("DISPLAY Most Expensive Car ");
        ob1.getLargest(arr, n);
        for (i = 0; i < n; i++) {
            if (arr[i] != null) {
                System.out.println("Model = " + arr[i].getModel());
                System.out.println("Code = " + arr[i].getCode());
                System.out.println("Brand = " + arr[i].getBrand());
                System.out.println("Price = " + arr[i].getPrice());
            }
        }
    }
}
   