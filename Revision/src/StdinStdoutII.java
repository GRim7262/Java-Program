import java.util.Scanner;

//HackerRank Question
public class StdinStdoutII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        double d = in.nextDouble();
        String s = in.nextLine();

        /*
        What's happening is that it reads the double, but it's still looking for more double
        still so when it reads next line it's actually going to read whitespace so to solve
        this we used if condition here.
         */
        if (s.isEmpty()) {
            s = in.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
