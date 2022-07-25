import java.util.*;
 
public class Main
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
 int i,n,search,flag=0,max=0;
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt(); 
     }
     
     /*Perform search operation*/
     for(i=0;i<n;i++)
     {
         if(a[i]==)
         {
             System.out.println("Element "+search+" found at "+i+" position");
             flag=1;
             break;
         }
     }
     if(flag==0)
     {
         System.out.println("Element "+search+" not found");
     }
 }
}