import java.util.Random;
import java.util.Scanner;
public class LENumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100)+1;

       

        Scanner scan = new Scanner(System.in);

        System.out.print("Guess a Number : ");
        int guess = scan.nextInt();


        while (guess != number) {
             if(guess > number){
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }

                System.out.print("Guess again: ");
                guess = scan.nextInt();  
        }

        System.out.println("Correct Number!");

    }   
}



// import java.util.Random;
// import java.util.Scanner;
// public class LENumberGuessingGame {
//     public static void main(String[] args) {
//         Random random = new Random();

//         int number = random.nextInt(100)+1;

       

//         Scanner scan = new Scanner(System.in);

//         System.out.print("Guess a Number : ");
//         int guess = scan.nextInt();

//         while (guess != number){

//         }

//     }   
// }
