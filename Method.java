// public class Method {
//     static void greet(){
//         System.out.println("Hello Prashant");
// }
//     public static void main(String[] args) {
//         greet();
//         greet();
//         greet();
//         greet();
//     }
// }

// public class Method {
//     static void greet(String name){
//         System.out.println("Hello, " + name);
//     }
//     public static void main(String[] args) {
//         greet("Prashant");
//         greet("Ankit");
//         greet("Yadav");
//     }
// }


// public class Method{
//     static void add(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         add(30,40);
//     }
// }

// public class Method {
//     static int square(int number){
//         return number * number;
//     }
//     public static void main(String[] args) {
//         int result = square(5);
//         System.out.println(result);
//     }
// }


// public class Method {
//     static boolean isEven(int number){
//         return number % 2 == 0;
//     }
//     public static void main(String[] args) {
//         System.out.println(isEven(5));
//     }
// }


// public class Method {

//     static boolean isOdd(int number){
//         return number % 2 != 0;
//     }
//     public static void main(String[] args) {
//         System.out.println(isOdd(2));
//     }
// }

// public class Method {

//     static int findMax(int a, int b){
//         if(a > b){
//             System.out.println(a +" large number");
//             return a;
//         } else {
//             System.out.println(b + " large number");
//             return b;
//         }  
//     }
//     public static void main(String[] args) {
//         System.out.println(findMax(5, 6));
        
//     }
// }



// public class Method {

//     static int square(int number){
//         return number * number;
//     }
//     public static void main(String[] args) {
//         int result = square(7);
//         System.out.println(result);
//     }
// }


public class Method {

    static boolean isPossitive(int number){
        return number > 0;
    }
    public static void main(String[] args) {
        System.out.println(isPossitive(-5));
    }
}