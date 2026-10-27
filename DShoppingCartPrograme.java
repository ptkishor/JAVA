// public class DShoppingCartPrograme {
//     public static void main(String[] args) {
//        double price = 100;
//        int quantity = 5;
       
//        double total = price * quantity;

//        System.out.println("Total price: " + total);
//     }
// }


public class DShoppingCartPrograme {
    public static void main(String[] args) {
        double item1 = 99.50;
        int quantity1 = 2;

        double item2 = 25.75;
        int quantity2 = 4;

        double total1 = item1 * quantity1;
        double total2 = item2 * quantity2;

        double grandTotal = total1 + total2;

        System.out.println("Total price : " + grandTotal);
    }
}