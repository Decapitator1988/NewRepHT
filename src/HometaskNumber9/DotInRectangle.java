package HometaskNumber9;

import java.util.Scanner;

/**
 * Created by 1 on 10.08.2017.
 */
public class DotInRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height of the  rectangle");
        int height = sc.nextInt();
        System.out.println("Input width of the rectangle");
        int width = sc.nextInt();

        int[][] array = new int[height][width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 8;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Please, input X coordinate of dot");
        int coordX = sc.nextInt();
        System.out.println("Please, input Y coordinate of dot");
        int coordY = sc.nextInt();
        if (isInRectangle(coordY, coordX, array)) {
            System.out.println("GOOD! The dot with these coordinates is im rectangle");
        } else {
            System.out.println("WRONG! The dot with these coordinates is not im rectangle");

        }
    }

    private static boolean isInRectangle(int y, int x, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((y >= 0 && y < arr.length) && (x >= 0 && x < arr[i].length)) {

                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}


