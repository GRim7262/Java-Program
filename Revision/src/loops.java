import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n > 0) {
            System.out.print("Enter x to get answer: ");
            char ch = in.next().trim().charAt(0);
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
            if (ch =='x') {
                System.out.println("Sum is: " + sum);
                break;
            }
        }

    }
}
