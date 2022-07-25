package lab_task3;
import java.util.Scanner;
public class Sorted_array {    
    public static void main(String[] args) {          
        Scanner input =new Scanner(System.in);
        int temp = 0;    
         int i,j,n,x;
            System.out.println("How many number you insert?");
            n=input.nextInt();
            int[]array=new int[n];
            System.out.println("Enter "+n+" array elements");
            for(i=0;i<n;i++){
                array[i] =input.nextInt();
            } 
        //Sort the array in ascending order    
        for (i = 0; i <n; i++) {   
          for ( j = i+1; j <n; j++) {     
              if(array[i] >array[j]) {  
                 //swap elements if it is not in order
                 temp = array[i];    
                 array[i] = array[j];   
                 array[j] = temp;  
               }     
            }     
        }       
        for ( i = 0; i <n; i++) {     
            System.out.print(array[i] + " ");    
        }    
    }    
}