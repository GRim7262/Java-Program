import java.util.Scanner;

public class KeepTakingNumber {
    public static void main(String[] args) {
        int n, rem, sum = 0;
        System.out.print("Enter series of number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n > 0) {
//            char stp = in.next().trim().charAt(0);
            rem = n % 10;
            sum += rem;
            n = n / 10;
//            if (stp == 'x') {
//                break;
//            }
        }
        System.out.println("Sum of all digit is: " + sum);
    }
}
