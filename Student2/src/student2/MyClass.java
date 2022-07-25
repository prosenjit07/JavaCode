package student2;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("How many Mobile do you want to insert? ");
        n = input.nextInt();
        Student2[] arr = new Student2[n];//obj create
        for (int i = 0; i < n; i++){
            arr[i] = new Student2();
            input.nextLine();
            System.out.println("Enter your Model: ");
            String  sModel = input.nextLine();
            arr[i].setModel(sModel);
            System.out.println("Enter  Code:   ");
            int  sCode = input.nextInt();
            arr[i].setCode(sCode);
            input.nextLine();
            System.out.println("Enter  Brand: ");
            String  sBrand = input.nextLine();
            arr[i].setBrand(sBrand);
            System.out.println("Enter Price: ");
            int  sPrice = input.nextInt();
            arr[i].setprice(sPrice);
        }
        //display
        for (int i = 0; i < n; i++) {
                System.out.println("Model: "+arr[i].getModel());
                System.out.println("Code : "+arr[i].getCode());
                System.out.println("Model: "+arr[i].getBrand());
                System.out.println("Price :"+arr[i].getprice());
        }
        //search
        //Scanner input = new Scanner(System.in);
        int i;
        String key;
        //int keyi;
        int found = 0;
        int index = 0;
        System.out.println("How you want to search?");
       
            {
                input.nextLine();
                System.out.println("Enter laptop model  name: ");
                key = input.nextLine();
                for (i = 0; i < n; i++) {
                    if (arr[i].getModel().equalsIgnoreCase(key)) {
                        found = 1;
                        index = (i + 1);
                    }
                }
                if (found == 1) {
                    System.out.println("laptop found at position " + index);
                } else {
                    System.out.println("Not found");
                }
          /*  
        public int deleteItem(MyClass[] arr, int n) {
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
        */
          /*
          //after delete data
                  for (int i = 0; i < n; i++) {
                System.out.println("Model: "+arr[i].getModel());
                System.out.println("Code : "+arr[i].getCode());
                System.out.println("Model: "+arr[i].getBrand());
                System.out.println("Price :"+arr[i].getprice());
        }
           */     
                
        System.out.println("DISPLAY LAPTOPS RANGE 50K TO 70K");
        for ( i = 0; i < n; i++){
            if(arr[i].getprice()<=70000 && arr[i].getprice()>50000 ){
                System.out.println("Model = " + arr[i].getModel());
                System.out.println("Code = " + arr[i].getCode());
                System.out.println("Brand = " + arr[i].getBrand());
                System.out.println("Price = " + arr[i].getprice());
            }
        }
     //highest price
         for (int i = 0; i < n; i++) {
         int max = arr[0].getprice(); 
         for (i = 1; i < arr.length; i++)
             if (arr[i].getprice() > max)
                 max = arr[i].getprice();
                 System.out.println("Expensive Mobile:"+max);
         }
    }
}
