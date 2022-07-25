import java.util.Scanner;
public class longstr {  
public static void main(String args[]){  
        Scanner objet = new Scanner(System.in);
         String s1,s2,s3;
         System.out.println("Enter String-1: ");
         s1 = objet.nextLine();
         System.out.println("Enter String-2: ");
         s2 = objet.nextLine();
         System.out.println("Enter String-3: ");
         s3 = objet.nextLine();

if(s1.length()>s2.length() && s1.length()>s3.length()) {
    System.out.println("String 1 is greatest ");
    } 
else if(s2.length()>s1.length() && s2.length()>s3.length()) {
    System.out.println("String 2 is greatest ");
    } 
else{
    System.out.println("String 3 is greatest ");
}
}
}  
