package jit_practice;
import java.util.*;
public class Jit_practice {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
         int x,i;
         //double y;
         System.out.println("enter the number of array:");
         x=obj.nextInt();
         int[] array= new int[x];
         /*
        y=obj.nextDouble();
        System.out.println(str);
        System.out.println("x");
        System.out.println("y");
        */
         for( i=0;i<x;i++){
             array[i]=obj.nextInt();
         }
        for(i=0;i<x;i++){
            System.out.println(array[i]);
        }
   }
}
