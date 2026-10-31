// public class NOverloadedMethod {
//     static int add(int a, int b){
//         return a + b;
//     }
    
//     static int add(int a, int b, int c){
//         return a + b + c;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(5, 5));
//         System.out.println(add(5, 6, 4));
//     }
    
// }


public class NOverloadedMethod {

    static int multiplication(int a, int b){
        return a * b;
    }
    static int multiplication(int a, int b, int c){
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println(multiplication(5, 4));
        System.out.println(multiplication(2, 3, 4));
    }
}