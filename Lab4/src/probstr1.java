import java.util.Scanner;
public class probstr1 {
    public static void main(String[] args) {
         Scanner objet = new Scanner(System.in);
         String s1,s2,s3;
         System.out.println("Enter String-1: ");
         s1 = objet.nextLine();
         System.out.println("Enter String-2: ");
         s2 = objet.nextLine();
         System.out.println("Enter String-3: ");
         s3 = objet.nextLine();
         
         String contact1 = s1.concat(" "+s2);
         String contact2 = contact1.concat(" "+s3);
         System.out.println(contact2);
         
    }
}