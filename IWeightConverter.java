// import java.util.Scanner;

// public class IWeightConverter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter weight in kg: ");
//         double kg = sc.nextDouble();

//         double pounds = kg * 2.20462;

//         System.out.printf("Weight in pounds: %.2f%n", pounds);

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class IWeightConverter{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Weight in pounds: ");
//         double pound = sc.nextDouble();

//         double KiloGram = pound/2.20462;

//         System.out.printf("%.2f kilograms", KiloGram);
//     }
// }


import java.util.Scanner;

public class IWeightConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight in pounds: ");
        double pound = sc.nextDouble();

        double KiloGram = pound/2.20462;

        System.out.printf("%.2f pounds = %.2f kilogram",pound, KiloGram);
        sc.close();
    }
}