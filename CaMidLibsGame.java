import java.util.Scanner;

public class CaMidLibsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print(name + " saw a " + adjective + " " + noun + "!");
        sc.close();
    }
}



