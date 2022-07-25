import java.util.Scanner;

class MyClass {

    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        x = myObj.nextInt();

        System.out.println("Enter second number:");
        y = myObj.nextInt();

        sum = x + y;
        System.out.println("Sum is: " + sum);
    }
}
