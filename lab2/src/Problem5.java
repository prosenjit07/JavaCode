 import java.util.Scanner;
 public class Problem5 {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.print("Input A=: ");
  int num1 = in.nextInt();
   
  System.out.print("Input B=: ");
  int num2 = in.nextInt();
   
  System.out.print("Input C=: ");
  int num3 = in.nextInt();
  
  if(num1>num2 && num1>num3)
  System.out.println("Maximum Value: " + num1);
  else if(num2>num1 && num2>num3)
  System.out.println("Maximum Value: " + num2);
  else
  System.out.println("Maximum Value: " + num3);    
 }
}