import java.util.Scanner;
public class Prime_number {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i,n, m = 0, flag = 0; 
        System.out.print("Test Case= ");
        int x=scan.nextInt();
        for(int j=0;j<x;j++){
        n=scan.nextInt();
        m = n / 2;  
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
           }
        }
      }
    }
}
