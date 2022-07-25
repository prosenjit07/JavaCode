package prosenjit_array;
import java.util.Scanner;
public class Prosenjit_array {    
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
        //int[] index=new int[n-1];
        System.out.println("After delete odd number, Print the array : ");
        for (k= 0; k< n; k++) {
           if(array[k]%2!=0){
               array[k]=1;
           }     
           for(k=1;k<n;k++){
               //for( j=index[0];j<index[n];j++){
               array[k]=array[k+1];
               //}
           }
           n-- ;
       }
          for (k= 0; k< n; k++) {
              System.out.println(+array[k]);
         }  
         
  }
}
////////////////////////////////////////////////////////////////////
/*
public int[] removeEven(int[] arr) {
        //Boundary condition
        if (arr.length == 0)
            return null;

        if (arr.length == 1 && arr[0] % 2 > 0)
            return arr;

        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                oddCount++;
            }
        }
        
        int result[] = new int[oddCount];
        oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                result[oddCount++] = arr[i];
            }
        }
        return result;
    }
*/



