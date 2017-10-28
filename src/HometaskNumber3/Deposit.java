package HometaskNumber3;

import java.util.Scanner;

/**
 * Created by 1 on 11.08.2017.
 */
public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a size of deposit in UAH :");
        double sumOfDeposit = sc.nextDouble();
        System.out.println("Please input a number of percent per year in percent:");
        double percentOfDeposit = sc.nextDouble();
        System.out.println("Please input a term in years :");
        double termOfDeposit = sc.nextDouble();

        profitForEachYear(sumOfDeposit, percentOfDeposit, termOfDeposit);
    }

    private static void profitForEachYear(double sum, double percent, double term) {
        double profit = 0;
        double prof = sum / 100 * percent;
        ;
        for (int i = 1; i <= term; i++) {
            profit = prof * i;
            System.out.println("After " + i + " year(s) you will have " + profit + " UAH profit. Final sum will be " + (sum + profit));
        }
    }
}
