package HometaskNumber14;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 1 on 10.08.2017.
 */

public class Matrix {
    private static int rows = 5;
    private static int columns = 5;

    public static void main(String[] args) {
        int[][] array = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                swap(i, array);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void swap(int a, int[][] arr) {
        int tmp = arr[a][0];
        arr[a][0] = arr[a][1];
        arr[a][1] = tmp; //////////////// почему  arr[a][1] не инициализируется переменной tmp???
    }
}


