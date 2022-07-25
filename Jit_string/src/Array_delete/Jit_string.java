package Array_delete;
import java.util.Scanner;
public class Jit_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        Integer arr[]=new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = sc.nextInt();
    //1,2,3,4,5,6
    //4
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] == elem)   //If element found/    //4
      {
        // shifting elements
        for(int j = i; j < arr.length - 1; j++)
        {
            arr[j] = arr[j+1];//5, 6
        }
        break;
      }
    }
       System.out.println("Elements after deletion " );
       for(int i = 0; i < arr.length-1; i++)
       {
             System.out.print(arr[i]+ " ");
       }  
    }
}
/*
public class Jit_Arraylist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a;
        System.out.println("How many arrray you add?");
        n = input.nextInt();
        ArrayList<Integer> arrL = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            //  a=input.nextInt();
            arrL.add(input.nextInt());
        }
        for (int i = 0; i < arrL.size(); i++) {
            //System.out.println(arrL);
            System.out.println("Number:" + arrL.get(i));
        }
        System.out.println("After Modify");
        arrL.set(1, 100);
        System.out.println(arrL);
        System.out.println("After Delete Data");
        arrL.remove(1);
        System.out.println(arrL);
        System.out.println("After all operation ArrayList is ...");
        for (int i = 0; i < n; i++) {
            System.out.println("Number:" + arrL.get(i));
        }
        //arrL.clear();
    }
}
*/

