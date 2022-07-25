public class Final{
public static void main(String args[]) {
try {
        int d= 0;
       int n= 20;
       int fraction = n/ d;
      
}
catch (ArithmeticException e) {
   System.out.println("ArithmeticException ");
}
try{
       int g[] = {1};
       g[20] = 100;
      
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("out of bound");
        }
System.out.println("End Of Main");
}
}