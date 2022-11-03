import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        System.out.print("Enter your salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary += 1000;
        }
        System.out.println("This month salary is: " + salary);
    }
}