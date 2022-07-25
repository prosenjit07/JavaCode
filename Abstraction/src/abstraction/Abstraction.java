package abstraction;
import java.util.*;
public class Volvo extends Vehicle implements Drive{
    
    private double  price ;
    
    public Volvo(String model, double price){
        super(model);
        this.price=price;
    }
    
    public  void move(){
        System.out.println("Vovle moves faster.");
    }

    
    public void startEngin() {
        System.out.println("Volve start");
    }

    
    public void stopEngin() {
                System.out.println("Volve stops");

    }
    
    
    
    public static void main(String[] args) {
       
      // Scanner input = new Scanner(System.in);
      // double p = input.nextDouble();
      // System.out.println("Enter the price?");
       Volvo v1 = new Volvo("BMW" , 100000);
        System.out.println("MOdel name: "+v1.model);
        System.out.println("Price: "+v1.price);
       v1.move();
       v1.startEngin();
       v1.stopEngin();
     
    }
}