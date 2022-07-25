package abstraction;

import java.util.*;

public abstract class Vehicle {

    protected String model;

    public Vehicle(String model) {
        this.model = model;
        //return model;
    }

    public abstract void move();

    public void controlSpeed(int x) {
        System.out.println("The highest speed is: " + x);
    }
}

//   public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the model name?");
//        String s=input.nextLine();
//        Vehicle car =new Vehicle(s) {};
//        //Vehicle(s);
//         // System.out.println("Model: " + get.model);
//        
//        System.out.println("Enter highest speed?");
//        int p = input.nextInt();
//        controlSpeed(p);
//        
//    }