package student3;
import java.util.Scanner;

public class MaxValueFromAray {
    public static int maxValue(int array2[]) {
        int maximum = array2[0];
        for (int i = 1; i < 5; i++) {
            if (array2[i] > maximum) {
                maximum = array2[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        System.out.println("Enter array element:");

        for (int i = 0; i < 5; i++) {
            array1[i] = input.nextInt();
        }
        int max = maxValue(array1);
        System.out.println("Maximum value of the array = " + max);
    }
}
