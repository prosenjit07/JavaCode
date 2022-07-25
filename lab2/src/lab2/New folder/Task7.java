package lab2;
import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i, alph, digi, spl, n;
        alph = digi = spl = 0;
        char ch;
        System.out.print("Test Case=  ");
        n = sc.nextInt();
        for (int j = 0; j <= n; j++) {
           str = sc.nextLine();
            for (i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    digi++;
                    System.out.println(""+str+" is Digit");
                }
                    else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                    alph++;
                    if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'  || ch=='O' || ch=='U'){
                    System.out.println(""+ch+" is an Alphabet: It is an Vowel");
                    }
                    else
                    System.out.println(""+ch+" is an Alphabet: It is an Consonant");   
                }
                else {
                    spl++;
                    System.out.println(""+ch+" is a Special Character");
                }
            }
        }
        /*
            System.out.println("Number of Digit Characters     =  " + digi);
            System.out.println("\nNumber of Alphabet Characters  =  " + alph);
            System.out.println("Number of Special Characters   =  " + spl);
       */
    }
}
