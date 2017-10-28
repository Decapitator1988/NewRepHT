package HometaskNumber15;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 1 on 10.08.2017.
 */
public class FindMaxColimn {
    private static int rows = 7;
    private static int columns = 7;

    public static void main(String[] args) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.round(Math.random() * 10));
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("The sum of each coulmn are :" + Arrays.toString(sumOfEachColumn(array)));
        int numberOfBiggestColumn = 0;
        int maxColumn = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayOfSums[] = sumOfEachColumn(array);

            if (maxColumn < arrayOfSums[i]) {
                maxColumn = arrayOfSums[i];
                numberOfBiggestColumn = i + 1;
            }
        }
        System.out.println("Number of biggest column is " + numberOfBiggestColumn);
        System.out.println("The sum of it is: " + maxColumn);
    }

    private static int[] sumOfEachColumn(int[][] arr) {
        int counter = 0;
        int[] sumOfColumn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter += arr[j][i];
            }
            sumOfColumn[i] = counter;
            counter = 0;
        }
        return sumOfColumn;
    }

}
