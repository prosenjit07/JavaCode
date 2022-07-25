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
        for (i = 0; i <n; i++) {   
          for ( j = i+1; j <n; j++) {     
              if(array[i] < array[j]) { 
                 //swap elements if it is not in order
                 temp = array[i];   
                 array[i] = array[j];  
                 array[j] = temp;  
               }     
            }     
        }
        System.out.println("Sorted array in Decending order:");
        for ( i = 0; i <n; i++) {     
            System.out.print(+array[i] + " ");    
        }    
        System.out.println("\n5 and 10 divisible number are: ");
         for (j=0;j<n;j++){
            if(array[j]%5==0 && array[j]%10==0){
                System.out.println(array[j]);
        }
    }  

        int k;
        System.out.println("After delete odd number, Print : ");
        for (k= 0; k< n; k++) {
           if(array[k]%2!=0){
               array[k]='\0';
           }       
           else{
               System.out.println(" "+array[k]);
           }
        }
}
}