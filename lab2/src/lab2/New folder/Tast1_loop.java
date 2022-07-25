package lab2;
import java.util.Scanner;
public class Tast1_loop {
   Scanner input =new Scanner(System.in);
   int n,i;
   int x=0;
   n = input.nextInt();
   for( i=1; i<=10; i++){
             x=n*i;
            System.out.println(" "+n+" X "+i" =" +x);
}
