// import java.util.Scanner;

// public class JdCalculatorProgram {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = scan.nextDouble();

//         System.out.print("Enter Operator: ");
//         char operator = scan.next();

//         System.out.print("Enter Second Number: ");
//         double num2 = scan.nextDouble();

//         System.out.println(num1 + operator + num2);
//     }
// }



import java.util.Scanner;

public class JdCalculatorProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your Second Number");
        double num2 = scan.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        String operator = scan.next();


        switch (operator){

        case "+" -> System.out.print(num1 + num2);
        case "-" -> System.out.print(num1 - num2);
        case "*" -> System.out.print(num1 * num2);
        case "/" -> {
            if (num2 != 0){
                System.out.print(num1 / num2);
            } else {
            System.out.print("Cannot Divide by zero");
            }
        }
        default -> System.out.print("Invalid Operator");
        }

        scan.close();
    }
}