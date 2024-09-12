import java.util.Scanner;

public class ValerieGrocery{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the coupon amount
        System.out.print("Enter the coupon amount as a decimal (e.g., .10 for 10%): ");
        double coupon = scanner.nextDouble();

        // Validate coupon amount
        if (coupon > 1.0) {
            coupon = 0.10;
        } else if (coupon <= 0) {
            coupon = 0.10;
        }

        // Array to store weekly grocery bills
        double[] weeklyBills = new double[4];
        double totalMonthlyBill = 0.0;

        //  grocery bills for weeks 1-4
        for (int i = 0; i < weeklyBills.length; i++) {
            System.out.print("Enter the grocery bill for week " + (i + 1) + ": $");
            weeklyBills[i] = scanner.nextDouble();
            totalMonthlyBill += weeklyBills[i];
        }

        // Calculate weekly average
        double weeklyAverage = totalMonthlyBill / 4;

        // Calculate monthly total and weekly average without coupon
        double monthlyTotalWithoutCoupon = totalMonthlyBill;
        double weeklyAverageWithoutCoupon = weeklyAverage;

        // Calculate monthly total and weekly average with coupon
        double monthlyTotalWithCoupon = totalMonthlyBill * (1 - coupon);
        double weeklyAverageWithCoupon = monthlyTotalWithCoupon / 4;

        // Results!!
        System.out.printf("\nMonthly Total without Coupon: $%.2f\n", monthlyTotalWithoutCoupon);
        System.out.printf("Weekly Average without Coupon: $%.2f\n", weeklyAverageWithoutCoupon);
        System.out.printf("Monthly Total with Coupon: $%.2f\n", monthlyTotalWithCoupon);
        System.out.printf("Weekly Average with Coupon: $%.2f\n", weeklyAverageWithCoupon);

        scanner.close();
    }
}
