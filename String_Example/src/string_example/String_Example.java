package string_Example;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class String_Example{

    public static void main(String args[]) {

        /*       String s1 = "java";

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};

        String s2 = new String(ch);

        String s3 = new String("example");

        System.out.println("String - 1: "+s1);
        System.out.println(s2);
        System.out.println(s3);
         */
   ///////////////////////////////////////////////////////////////////////////////
        /*
         * *********** Concatenate two strings ********************
         */
///////////////////////////////////////////////////////////////////////////////
        /*      System.out.println("\nConcate two Strings\n");

        String s4 = "Tasneem";
        String s5 = "Tasneem";

        System.out.println(s4.concat(s5));
        System.out.println("\n\n");

         */
///////////////////////////////////////////////////////////////////////////////
        /*
         * *********** Comparing two strings ********************
         */
///////////////////////////////////////////////////////////////////////////////
        /*System.out.println("\nCompare two Strings\n");
        if (s4.compareTo(s5) > 0) {
            System.out.println("String 4: " + s4 + " is greater");
        } else if (s4.compareTo(s5) < 0) {
            System.out.println("String 5: " + s5 + " is greater");
        } else {
            System.out.println("They are equal");
        }

     System.out.println("\n\n\n");   
        
        
         */
///////////////////////////////////////////////////////////////////////////////
        /*
         * *********** Compare strings to find out if they are equal  ********************
         */
///////////////////////////////////////////////////////////////////////////////
        /*System.out.println("\nCompare strings to find out if they are equal");
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";

        System.out.println(myStr1.equals(myStr2));
        
        System.out.println(myStr1.equals(myStr3));

        if (myStr1.equals(myStr2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are no equal");
        }
System.out.println("\n\n\n");  */
///////////////////////////////////////////////////////////////////////////////
        /*
         * *********** Sorting the Strings ********************
         */
///////////////////////////////////////////////////////////////////////////////
//defining an array of type String  
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};

        int size = countries.length;

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);

        System.out.println(Arrays.toString(countries));

        //sorts array in descending order  
        Arrays.sort(countries, Collections.reverseOrder());

        System.out.println(Arrays.toString(countries));

//prints the sorted array in ascending order  
        //////////// Another option for soring array and displaying////////////////////
//sorts string array in alphabetical order or ascending order  
        //     Arrays.sort(countries);
//prints the sorted string array in ascending order  
        //    System.out.println(Arrays.toString(countries));
//prints the sorted string array in descending order  
        //   System.out.println(Arrays.toString(countries));
        //////////// Another option for input String array and displaying//////////////////// 
        Scanner input = new Scanner(System.in);

        String[] name = new String[5];

        for (int i = 0; i < 5; i++) {
            name[i] = input.nextLine();
        }

        Arrays.sort(name);

        System.out.println(Arrays.toString(name));

        ///////////////////////////////////////////////////////////////////////////////
        /*
         * * *********** UpperCase and LowerCase ********************
         */
        ///////////////////////////////////////////////////////////////////////////////
        //  String txt = "Hello World";
        //    System.out.println(txt.toUpperCase());
        //  System.out.println(txt.toLowerCase());
    }
}
