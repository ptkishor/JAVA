import java.util.Scanner;

public class JdCalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 + operator + num2);
    }
}
