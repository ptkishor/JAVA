public class JaTernaryOperator {
    public static void main(String[] args){
        int age = 20;

        String checking =  (age >= 18) ? "Adult" : "Minor";

        System.out.println(checking);


        int marks = 35;

        String check = (marks >= 33) ? "Pass" : "Fail";

        System.out.println(check);


        int number = 14;

        String check1 = (number%2 == 0) ? "Even" : "Odd";

        System.out.println(check1);
    }
}
