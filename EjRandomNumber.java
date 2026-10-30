import java.util.Random;

// public class EjRandomNumber {
//     public static void main(String[] args) {
        
//         Random random = new Random();

//         int dice = random.nextInt(6) + 1; // Generates a random number between 1 and 6  

//         System.out.print("Dice: " + dice);
//     }
// }

public class EjRandomNumber {
    public static void main(String[] args) {
        
        Random number = new Random();

        int randomNum = number.nextInt(100) + 1;

        System.out.println(randomNum);

    }
}


// public class EjRandomNumber {
//     public static void main (String[] args) {
        
//         Random random = new Random();

//         int randomNum = random.nextInt(10); // Generates a random number between 0 and 9
        
//         System.out.println(randomNum);  
//     }
// }
