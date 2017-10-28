package HometaskNumber6;

import java.util.Scanner;

/**
 * Created by 1 on 08.08.2017.
 */
public class IsSimpleNumber {
    public static void main(String[] args) {
        int num;
        int tmp;
        boolean simpleNumber = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        num = scanner.nextInt();
        for (int i = 2; i < num / 2; i++) {
            tmp = num % i;
            if (tmp == 0) {
                simpleNumber = false;
                break;
            }
        }
        if (simpleNumber) {
            System.out.println(num + " is a simple number");
        } else {
            System.out.println(num + " isnt a simple");
        }
    }
}





