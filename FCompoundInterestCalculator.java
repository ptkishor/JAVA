public class FCompoundInterestCalculator {
    public static void main(String[] args) {
        double Principal = 1000; // Initial principal amount
        double Rate = 5;
        int Time = 3; // Time in years

        Double FinalAmount = Principal * Math.pow(1 + Rate/100, Time);
        double CompoundInterest = FinalAmount - Principal;

        System.out.printf("Principal: %.2f | Rate: %.2f%% | Time: %d years | Compound Interest: %.2f", Principal, Rate, Time, CompoundInterest);


        double Principal1 = 5000;
        double AnnualRate = 8;
        int Time1 = 3;

        double FinalAmount1 = Principal1 * Math.pow(1 + AnnualRate/100, Time1);
        double CompoundInterest1 = FinalAmount1 - Principal1;

        System.out.printf("\nPrincipal: %.2f | Rate: %.2f%% | Time: %d years | Compound Interest: %.2f", Principal1, AnnualRate, Time1, CompoundInterest1);

    }
}

