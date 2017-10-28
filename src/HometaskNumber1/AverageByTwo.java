package HometaskNumber1;

import java.util.Scanner;


public class AverageByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input operand #1: ");
        double operandOne = scanner.nextInt();
        System.out.println("Please, input operand #2: ");
        double operandTwo = scanner.nextInt();
        double result = (operandOne + operandTwo) / 2;
        System.out.println("Average is: " + result);
    }
}

