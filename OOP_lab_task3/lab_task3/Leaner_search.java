package lab_task3;
import java.util.Scanner;
public class Leaner_search {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, n, i, j;
        System.out.print("Enter Test Case= ");
        t = input.nextInt();
        System.out.println("How many number you want to insert? ");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" array element");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (j = 0; j < t; j++) {
            System.out.println("Case: " + (j + 1));
            System.out.println("Enter Data You want to search ");
            int find,flag=0;
            find = input.nextInt();
            for (int k = 0; k < n; k++) {
                if (arr[k] == find) {
                    System.out.println(+find + " found at index " + (k + 1));
                    flag=1;
                    break;
                } 
            }  
           if(flag==0) {
                    System.out.println(" " + find + " is not found at the array");
                }
        }
    }
}
