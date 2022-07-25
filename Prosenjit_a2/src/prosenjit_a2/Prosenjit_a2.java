package prosenjit_a2;
import java.util.Scanner;

public class Prosenjit_a2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t, n, i, j;
        System.out.println("How many Element do you want to insert? ");
        n = input.nextInt();
        int[] Prosenjit_arr = new int[n];
        System.out.println("Enter " + n + " Prosenjit_array element");
        for (i = 0; i < n; i++) {
            Prosenjit_arr[i] = input.nextInt();
        }

        int find_id, flag = 0;
        // find = input.nextInt();//f=90
        find_id= 568;
        for (int k = 0; k < n; k++) {
            if (find_id > Prosenjit_arr[k]) {
                //System.out.println(+find + " found at index " + (k + 1));
                System.out.println("Person Smaller Elements compared to my ID: " + Prosenjit_arr[k]);
                flag = 1;
                //break;
            }
        }

        if (flag == 0) {
            System.out.println(" Not Found");
        }

        //case2
        int flag2=0;
        for (int k = 0; k < n; k++) {
            if (Prosenjit_arr[k] % 2 == 0 && Prosenjit_arr[k] % 68 == 0) {
                //System.out.println(+find + " found at index " + (k + 1));
                System.out.println("Element which are even and divisible by 68 :" + Prosenjit_arr[k]);
                flag2 = 1;
                //break;
            }
        }
        if (flag2 == 0) {
            System.out.println(" Not Found Element which are even and divisible by 68");
        }

        //case3
       int  count=0;
        for (i = 0; i < Prosenjit_arr.length; i++) {
            if (Prosenjit_arr[i] > 68) //If element found
            {
                count++;
                // shifting elements
                for (j = 1; j < Prosenjit_arr.length-count; j++) {
                    Prosenjit_arr[j] = Prosenjit_arr[j + 1];//5, 6
                }
                //break;
            }
        }
        System.out.println("Elements after deletion ");
        for (i = 0; i < Prosenjit_arr.length - 1; i++) {
            System.out.print(Prosenjit_arr[i] + " ");
        }
    }
}
