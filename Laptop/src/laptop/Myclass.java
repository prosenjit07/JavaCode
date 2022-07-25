package laptop;
import java.util.Scanner;
public class Myclass {
// search fuction
    public void search(ProsenjitLaptop[] arr, int n) {
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

            case 2 :{
                System.out.println("Enter your laptop code: ");
                keyi = input.nextInt();
                for (i = 0; i < n; i++) {
                    if (arr[i].getCode() == keyi) {
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
// Find maximum laplop price
    public void getLargest(ProsenjitLaptop[] arr, int n) {
        double maxi =arr[0].getPrice();
        for (int i = 0; i < n; i++) {
                if (maxi< arr[i].getPrice()) {
                    maxi = arr[i].getPrice();
                }
            }
        System.out.println("Expensive Laptop is= "+maxi);
        }
        //n--;
   // }
//Delete laptop
    public int deleteItem(ProsenjitLaptop[] arr, int n) {
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
//Main fuction
    public static void main(String[] args) {
        Scanner ProsenjitInput = new Scanner(System.in);
        int n, i;
        System.out.println("How many laptop you want to insert: ");
        n = ProsenjitInput.nextInt();
        ProsenjitInput.nextLine();
        ProsenjitLaptop[] arr = new ProsenjitLaptop[n];
        for (i = 0; i < n; i++) {
            arr[i] = new ProsenjitLaptop("Default", 1, "None", 0.0);
            System.out.println("Enter laptop model: "+(i+1));
            String sm = ProsenjitInput.nextLine();
            arr[i].setModel(sm);
            System.out.println("Enter laptop Code: ");
            int sc = ProsenjitInput.nextInt();
            arr[i].setCode(sc);
            ProsenjitInput.nextLine();
            System.out.println("Enter  laptop brand: ");
            String sb = ProsenjitInput.nextLine();
            arr[i].setBrand(sb);
            System.out.println("Enter laptop price: ");
            double sp = ProsenjitInput.nextDouble();
            arr[i].setPrice(sp);
            ProsenjitInput.nextLine();

        }
        //Display laptop details
        for (i = 0; i < n; i++) {
            System.out.println("Model = " + arr[i].getModel());
            System.out.println("Code = " + arr[i].getCode());
            System.out.println("Brand = " + arr[i].getBrand());
            System.out.println("Price = " + arr[i].getPrice());
        }
        Myclass ob1 = new Myclass();
        ob1.search(arr, n);
        //Display range
        System.out.println("DISPLAY LAPTOPS BETWEEN RANGE 50K TO 70K");
        for (i = 0; i < n; i++) {
            if (arr[i].getPrice() <= 70000 && arr[i].getPrice() > 50000) {
                System.out.println("Model = " + arr[i].getModel());
                System.out.println("Code = " + arr[i].getCode());
                System.out.println("Brand = " + arr[i].getBrand());
                System.out.println("Price = " + arr[i].getPrice());
            }
        }
        //Call expensive fuction
        System.out.println("DISPLAY Most Expensive LAPTOPS ");
        ob1.getLargest(arr, n);
        ob1.deleteItem(arr, n);
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
    /*
    private static class ProsenjitMyClass {
        public ProsenjitMyClass() {
        }
        private void getLargest(ProsenjitLaptop[] arr, int n) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
*/