import java.util.*;
public class Loop_task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int x = 0;
        int n = input.nextInt();
        for (i = 1; i <= 10; i++) {
            x = n * i;
            System.out.println(+n+" X "+i+" = "+x);
      }
    }
}
