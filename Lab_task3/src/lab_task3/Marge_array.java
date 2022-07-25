package lab_task3;
import java.util.Scanner;
public class Marge_array {
    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            int i,j,n,x;
            System.out.print("N1 =");
            n=input.nextInt();
            int[]arr1=new int[n];
            System.out.println("Enter "+n+" array elements");
            for(i=0;i<n;i++){
                arr1[i] =input.nextInt();
            }
            System.out.print("N2 =");
            x=input.nextInt();
            int[]arr2=new int[x];
            System.out.println("Enter "+x+" array elements");
             for(i=0;i<x;i++){
                arr2[i] =input.nextInt();
            }
            //marge array
            int []arr3=new int[(n+x)];
            for(j=0;j<n;j++){
                arr3[j]=arr1[j];
            }
            for(j=n;j<(n+x);j++){
                arr3[j]=arr2[(j-n)];
            }
            for(j=0;j<(n+x);j++){
            System.out.print(+arr3[j]+" ");
            }   
    }
}
