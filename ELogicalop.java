public class ELogicalop {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a > 10 && a < 15);   //one value is false so output is false
        System.out.println(a > 10 || a < 15);   //one value is true so output is true
        System.out.println(!(a > 10 && a < 15));   //one value is false so output is true and one value is true so output is false
    }
}