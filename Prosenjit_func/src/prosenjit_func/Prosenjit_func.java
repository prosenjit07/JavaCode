package prosenjit_func;
import java.util.*;
public class Prosenjit_func{
    
    public int prosenjit_ODD_num(int prosenjit_arr[], int a) {
        int count2=0, j;
        for (j = 0; j < a; j++) {
            if (prosenjit_arr[j] % 2 != 0) {
                count2++;
            }
        }
        return count2;
    }

    public static int prosenjit_EVEN_num(int prosenjit_arr[], int a) {
        int count1=0, j;
        for (j = 0; j < a; j++) {
            if (prosenjit_arr[j] % 2 == 0) {
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        int a, i, EVEN_num=0, ODD_num=0;
        Scanner prosenjit_obj = new Scanner(System.in);
        Prosenjit_func prosenjit_obj2 = new Prosenjit_func();
        System.out.println("Enter the number of array size?  ");
        a = prosenjit_obj.nextInt();
        int[] prosenjit_arr = new int[a];
        System.out.println("Enter array elements:");
        for (i = 0; i < a; i++) {
            prosenjit_arr[i] = prosenjit_obj.nextInt();
        }
        EVEN_num = prosenjit_EVEN_num(prosenjit_arr, a);
        //Print even
        System.out.println("Count of EVEN_num Numbers is :" + EVEN_num);
         //print odd
        ODD_num = prosenjit_obj2.prosenjit_ODD_num(prosenjit_arr, a);
        System.out.println(" Count of ODD_num Numbers is : " +ODD_num);
    }
}
