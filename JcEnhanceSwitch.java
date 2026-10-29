public class JcEnhanceSwitch {
    public static void main (String[] args) {
        // This is normal Switch Scroll Down To See Enhance Switch
         int day1 = 9;

         switch (day1) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid Day");

            }


            int day2 = 1;

            switch(day2) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Invalid day");
            }

            int day3 = 3;

            String result1 = switch(day3) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                default -> "Invalid Day";
            };
            
            System.out.println(result1);



            int choice = 2;

            String result = switch(choice) {
                case 1 -> "Coffee";
                case 2 -> "Tea";
                case 3 -> "Juice";
                default -> "Invalid Choice";
            };
            System.out.print(result);

            int month = 4;

            String mon = switch(month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                default -> "Invalid month";

            };
            System.out.println(mon);
    }
}
