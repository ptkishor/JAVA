public class Gifelse {
    public static void main(String[] args) {

        int marks = 90;

        if (marks >= 80) {
            System.out.println("You are a topper");
        } else {
            System.out.println("You are not a topper");
        }

        int age = 15;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        int number = 20;
        
        if(number >= 90) {
            System.out.println("A++");
        } else if (number >= 60) {
            System.out.println("A+");
        } else if ( number >= 40) {
            System.out.println("B");
        } else if (number >= 30) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }


        
    }
}