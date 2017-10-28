package HometaskNumber16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by 1 on 13.08.2017.
 */
public class SortArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num;
        int n = 20;
        int[] array = new int[n];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Unsorted array: \n" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted array: \n" + Arrays.toString(array));
        System.out.println("Please input the number which you want to search");
        num = scanner.nextInt();
        contains(array, num);
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int temp;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static boolean contains(int[] arr, int x) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] < x) {
                first = mid + 1;
            } else if (x == arr[mid]) {
                System.out.println("Success! Location of your number  is a cell #" + (mid+1));
                break;
            } else {
                last = mid - 1;
                mid = (first + last) / 2;
            }
            if (first > last) {
                System.out.println("Sorry, your number isn't present in array");
            }
        }

        return true;
    }
}
