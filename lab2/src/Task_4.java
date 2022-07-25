import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b,c,d;
        int p=0,q=0,r=0,s=0;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        p=a*b -c*d;
        q=(2*a-b+3*d);
        r=a*a+b*b-c*c+d*d;
        s=a*a*a+b-c*c;
        System.out.println("Solution of the Equation -1: "+ p);
        System.out.println("Solution of the Equation -2: "+ q);
        System.out.println("Solution of the Equation -3: "+ r);
        System.out.println("Solution of the Equation -4: "+ s);
    }
}
