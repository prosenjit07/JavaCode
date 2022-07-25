import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner objet = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter String-1: ");
        s1 = objet.nextLine();
        System.out.println("Enter String-2: ");
        s2 = objet.nextLine();
       
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
    }
}