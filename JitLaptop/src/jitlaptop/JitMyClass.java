package jitlaptop;
import java.util.*;

public class JitMyClass {

    public void serch(JitMyClass[] arr, int n) {
        Scanner input = new Scanner(System.in);
        int i;
        String keyn;
        int keyi;
        String keycg;
        int found = 0;
        int index = 0;
        System.out.println("How you want to search?");
        System.out.println("1. By Name. \n2. By code. \n3. By Brand.");
        int choice;
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1 :
            {
                input.nextLine();
                System.out.println("Enter laptop model  name: ");
                keyn = input.nextLine();
                for (i = 0; i < n; i++) {
                    if (arr[i].getModel().equalsIgnoreCase(keyn)) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("laptop found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }
            case 2 : {

                System.out.println("Enter your laptop code: ");
                keyi = input.nextInt();
                for (i = 0; i < n; i++) {
                    if (arr[i].getCode()== keyi) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("Laptop found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }

            case 3 : {
                input.nextLine();
                System.out.println("Enter your Laptop Brand: ");
                keycg = input.nextLine();
                for (i = 0; i < n; i++) {
                    if (arr[i].getBrand().equalsIgnoreCase(keycg)) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("Laptop found at position " + index);
                } else {
                    System.out.println("Not found");
                }
                break;
            }
            default :
                System.out.println("You selected wrong option Please try again (1 to 3)");
        }
    }
    public void getLargest(JitMyClass[] arr, int n){
        JitMyClass temp;
        
        for(int i=0;i<n;i++){
            for(int j = i+1; j<n; j++){
                if(arr[i].getPrice() > arr[j].getPrice())
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                   
                }
            }
        }
        n--;
    }

    public int deleteItem(JitMyClass[] arr, int n) {
        Scanner input = new Scanner(System.in);
        int pos;
        int i;
        System.out.println("Enter which position laptop you want to delete: ");
        pos = input.nextInt();
        int po = (pos - 1);
        for (i = 0; i < n; i++) {
            if (i == po) {
                arr[i] = null;
            }
        }
        return n--;

    }

    public static void main(String[] args) {
        Scanner noyonInput = new Scanner(System.in);
        int n, i;
        System.out.println("How many laptop you want to insert: ");
        n = noyonInput.nextInt();
        noyonInput.nextLine();
       JitMyClass[] arr = new jit_Laptop[n];
        for (i = 0; i < n; i++) {
            arr[i] = new JitMyClass("Default", 1, "None", 0.00);
            System.out.println("Enter laptop model: ");
            String sm = noyonInput.nextLine();
            arr[i].setModel(sm);
            System.out.println("Enter laptop Code: ");
            int sc = noyonInput.nextInt();
            arr[i].setCode(sc);
            noyonInput.nextLine();
            System.out.println("Enter  laptop brand: ");
            String sb = noyonInput.nextLine();
            arr[i].setBrand(sb);
            System.out.println("Enter laptop price: ");
            double sp = noyonInput.nextDouble();
            arr[i].setPrice(sp);
            noyonInput.nextLine();

        }
        for (i = 0; i < n; i++) {
            System.out.println("Model = " + arr[i].getModel());
            System.out.println("Code = " + arr[i].getCode());
            System.out.println("Brand = " + arr[i].getBrand());
            System.out.println("Price = " + arr[i].getPrice());

        }
        NoyonMyClass ob1 = new JitMyClass();
        //ob1.serch(arr, n);
        System.out.println("DISPLAY LAPTOPS BETWEEN RANGE 50K TO 70K");
        for (i = 0; i < n; i++){
            if(arr[i].getPrice()<=70000 && arr[i].getPrice()>50000 ){
                System.out.println("Model = " + arr[i].getModel());
                System.out.println("Code = " + arr[i].getCode());
                System.out.println("Brand = " + arr[i].getBrand());
                System.out.println("Price = " + arr[i].getPrice());
            }
        }
        System.out.println("DISPLAY Most expensive LAPTOPS ");
        ob1.getLargest(arr, n);
        /*ob1.deleteItem(arr, n);
        for (i = 0; i < n; i++) {
            if (arr[i] != null) {
                System.out.println("Model = " + arr[i].getModel());
                System.out.println("Code = " + arr[i].getCode());
                System.out.println("Brand = " + arr[i].getBrand());
                System.out.println("Price = " + arr[i].getPrice());
            }

        }*/
        

    }
}
/