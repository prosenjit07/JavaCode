// Find Minimum and maximum value from an array
package lab_task3;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("How many Studetns’ CGPA you want to insert?");
        n = obj.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter" + (i + 1) + " person cgpa: ");
            arr[i] = obj.nextDouble();
        }
        /*
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
      */
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];    
            }
        }
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        {
            System.out.println("\nLargest CGPA = " + max);
            System.out.println("Smallest CGPA = " + min);
        }
    }
}
