import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int Hcf = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                Hcf = i;
        }
        System.out.println("Hcf is: " + Hcf);
        int Lcm = 0;
        Lcm = (n1 * n2) / Hcf;
        System.out.println("Lcm is: " + Lcm);
    }
}
