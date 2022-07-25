package lp_jit;
import java.util.Scanner;
public class MylpClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("How many students do you want to insert? ");
        n = input.nextInt();
        MylpClass[] arr = new MylpClass[n];//obj create
        for (int i = 0; i < n; i++){
            arr[i] = new MylpClass();
            input.nextLine();
            System.out.println("Enter your name: ");
            String  sName = input.nextLine();
            arr[i].setName(sName);
            System.out.println("Enter your id:   ");
            int  sId = input.nextInt();
            arr[i].setId(sId);
            System.out.println("Enter your result: ");
             int  sCgpa = input.nextInt();
            arr[i].setId(sCgpa);
        }
        for (int i = 0; i < n; i++) {
                System.out.println("name: "+arr[i].getName());
                System.out.println("Id : "+arr[i].getId());
                System.out.println("Cgpa :"+arr[i].getCgpa());
        }
    }
}
