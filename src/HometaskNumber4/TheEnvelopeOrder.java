package HometaskNumber4;

import java.util.Scanner;

/**
 * Created by 1 on 11.08.2017.
 */
public class TheEnvelopeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a length of the side");
        int length = scanner.nextInt();
        char[][] array = new char[length][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                if ((i > 0 && i < array.length - 1) && (j > 0 && j < array[i].length - 1)) {
                    array[i][j] = ' ';
                }
                if (i == j) {
                    array[i][j] = '*';
                }
                for (int k = array[i].length - 1; k > 0; k--) {
                    if ((i > 0 && i < array.length) && (k == array[i].length - i - 1)) {
                        array[i][k] = '*';
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();

        }
    }
}


