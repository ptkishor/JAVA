public class GNestedif {
    public static void main(String[] args) {
        int age = 18;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You cannot drive without a license.");
            }
        }



        int age1 = 18;
        boolean hasLicense1 = true;

        if (age1 >= 18) {
            if (hasLicense1) {
                System.out.println("You can Drive.");
            } else {
                System.out.println("Need a license to drive.");
            }
            } else {
                    System.out.println("Underage, cannot drive.");
            }



            int age2 = 21;
            int marks = 75;
            boolean hasId = true;

            if (age2 >= 18 && (marks >= 40 || hasId)) {
                    marks += 5;
                    if(marks >= 80) {
                        System.out.println("Excellent");
                    } else {
                        System.out.println("Pass");
                    }

                    } else {
                        System.out.println("Not Eligible");
                }


            int age3 = 40;
            boolean hasIDE = true;

            if (age3 >= 38){
            if(hasIDE) {
                System.out.println("Entry Allowed");
            } else {
                System.out.println("Entry Denied");
            }
        }


        int age4 = 20;
        boolean hasID = false;
        
        if (age4 >= 18) {
            if (hasID) {
                System.out.println("Entry Allowed");
            } else {
                System.out.println("ID Missing");
            } 
        }else {
                System.out.println("Too Young");
            
        }

        }
    }

