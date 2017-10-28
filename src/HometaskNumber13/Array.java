package HometaskNumber13;

import java.util.Arrays;

public class Array {
    private static int width = 10;
    private static int height = 10;

    public static void main(String[] args) {

        int[][] array = new int[width][height];
        int maxVal = 20;
        int minVal = -20;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd(minVal, maxVal);
                System.out.print("[" + array[i][j] + "]");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The sum of array's elements equals: " + SumOfValues(array));
        System.out.println("The average of array's elements equals: " + averageOfValues(array));
        System.out.println("The minimum value of array equals: " + findMinElement(array));
        System.out.println("The maximum value of array equals: " + findMaxElement(array));
        System.out.println("The number of positive values  of array equals: " + numberOfPositive(array));
        System.out.println("Sums of  values  for each string in array equals: " + Arrays.toString(sumOdEachLine(array)));


    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    private static int SumOfValues(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter += array[i][j];
            }
        }
        return counter;
    }

    private static double averageOfValues(int[][] array) {
        int quantity = height * width;
        double average;
        average = SumOfValues(array) / quantity;


        return average;
    }

    private static int findMinElement(int[][] array) {
        int minElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minElement > array[i][j]) {
                    minElement = array[i][j];

                }
            }
        }
        return minElement;
    }

    private static int findMaxElement(int[][] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }

            }

        }
        return maxElement;
    }

    private static int numberOfPositive(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    counter += 1;
                }

            }

        }
        return counter;
    }

    private static int[] sumOdEachLine(int[][] array) {
        int[] sum = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < sum.length; k++) {
                    if (k == i) {
                        sum[k] += array[i][j];
                    }

                }

            }

        }
        return sum;
    }

}

