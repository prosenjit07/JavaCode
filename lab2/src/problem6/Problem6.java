package problem6;
import java.util.Scanner;
public class Problem6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mark marks");
        double mark = scan.nextDouble();
         if (mark >100 || mark <0) {
            System.out.println("Incorrect Mark!-Try Again! Grade :None");
        } 
         else if (mark >= 80 && mark<=100) {
            System.out.println("Outstanding: Grade A+");
        } else if (mark < 80 && mark >= 75) {
            System.out.println("Excellent: Grade A");
        } else if (mark < 75 && mark >= 70) {
            System.out.println("Very Good: Grade A-");
        } else if (mark < 70 && mark >= 65) {
            System.out.println("Good: Grade B+");
        } else if (mark < 65 && mark >= 60) {
            System.out.println("Satisfactory: Grade B");
        } else if (mark < 60 && mark >= 55) {
            System.out.println("Above: Grade B-");
        } else if (mark < 55 && mark >= 50) {
            System.out.println("Average: Grade C+");
        } else if (mark < 50 && mark >= 45) {
            System.out.println("Bellow Average: Grade C");
        } else if (mark < 45 && mark >= 40) {
            System.out.println("Pass: Grade D");
        } else {
            System.out.println("Failed! : Grade F");
        }
    }
}
