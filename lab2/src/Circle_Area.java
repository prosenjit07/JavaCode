import java.util.*;
public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r ;
        float area;
        System.out.println("Enter the Radious");
        r=input.nextInt();
        area= (float) (3.1416*r*r);
        System.out.println("Area of the Circle: "+area);
      }
    }
