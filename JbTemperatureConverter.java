import java.util.Scanner;






public class JbTemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double Fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("Temperature in Fahrenheit: %.2f\n" , Fahrenheit);


        System.out.print("Enter Temperaure in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
       

        double Celsius = (fahrenheit - 32) * 5/9;

        System.out.printf("Temperatute in Celsius : %.2f ", Celsius);


        sc.close();
    }
}
