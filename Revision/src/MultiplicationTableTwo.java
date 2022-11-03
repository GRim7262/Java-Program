import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        // using while loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter table number: ");
        int num = in.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + num * i);
            i++;
        }
    }
}
