package practice_code;
import java.util.*; 
class Practice_code {  
static void sort(String []s, int n) 
{ 
    for (int i=1 ;i<n; i++) 
    { 
        String temp = s[i]; 
        // Insert s[j] at its correct position 
        int j = i - 1; 
        while (j >= 0 && temp.length() < s[j].length()) 
        { 
            s[j+1] = s[j]; 
            j--; 
        } 
        s[j+1] = temp; 
    } 
} 

// Function to print the sorted array of string 
static void printArraystring(String str[], int n) 
{ 
    for (int i=0; i<n; i++) 
        System.out.print(str[i]+" "); 
} 
  
// Driver function 
public static void main(String args[]) 
{ 
    //String []arr = {"prosenjit", "jit", "tahajib", "sayed"}; 
    Scanner input =new Scanner(System.in);
    int t,i;
    String [] arr = new String [];
    t= input.nextInt();
    for(i=0; i<t; i++)
    {
        arr[i]=input.nextLine();
        input.close();
    }
    int n = arr.length; 
    sort(arr,n); 
    // Calling the function to print result 
    printArraystring(arr, n); 
} 
} 