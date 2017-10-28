package HometaskNumber4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input a height :");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("P;ease, input a width :");
        int y = Integer.parseInt(reader.readLine());

        for (int j = 0; j < y; j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i < x - 1; i++) {
            for (int k = 0; k < y; k++) {
                if ((k == 0) || (k == y - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = 0; j < y; j++) {
            System.out.print("*");
        }
        System.out.println();

    }
}


