import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.print(ans);
        int ans = sum3(83, 27);
        System.out.println(ans);
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }
    /*

    return_type name (arguments) {
    //body
    return statement;
    }

     */
}