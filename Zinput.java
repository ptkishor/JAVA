import java.util.Scanner;

public class Zinput {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scan.nextLine();
            System.out.println("Good Morning, " + name + "!");

            System.out.print("Enter your age: ");
            float age = scan.nextFloat();
            System.out.println("You are " + age + " years old.");
            scan.close();

      
            float temp = 27;
            int avg =(int) 20.67;
            System.out.println(temp);
            System.out.println(avg);
            scan.close();
        }

    }
}
        