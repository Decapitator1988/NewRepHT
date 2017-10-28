package HTs.HometaskNumber0;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        System.out.println("Input operand 1");
        int operand1 = checkInt();
        System.out.println("Input operand 2");
        int operand2 = checkInt();

        int result = 0;
        boolean done;
        do {
            done = true;
            System.out.println("Input the type of operation");
            char operation = new Scanner(System.in).nextLine().charAt(0);
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '?':
                    result = operand1 / operand2;
                    break;
                case '%':
                    result = operand1 % operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Cannot divide to zero");
                        done = false;
                    } else {
                        result = operand1 / operand2;
                        break;
                    }
                default:
                    System.out.println("Wrong operation. Try again");
                    done = false;
                    break;
            }
        }
        while (!done);
        System.out.println("Result is " + result);
    }


    public static int checkInt() {
        boolean correct = false;
        int num = 0;
        while (!correct)
            try {
                num = new Scanner(System.in).nextInt();
                correct = true;

            } catch (InputMismatchException e) {
                System.out.println("Incorrect number. Try again");
            }
        return num;
    }


}




