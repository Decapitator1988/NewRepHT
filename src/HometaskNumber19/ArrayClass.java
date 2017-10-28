package HometaskNumber19;

import java.util.Arrays;

public class ArrayClass {
    private int counter = 0;
    private int counterForSecond = 0;
    private int size = 0;

    public void setSize(int size) {
        this.size = size;
    }

    int[] array;

    {
        array = new int[size];
    }


    void add(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = value;
                counter++;
                break;
            }
        }
    }

    void addForSecond(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = value;
                counterForSecond++;
                break;
            }
        }
    }

    void showArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    void getByIndex(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                System.out.println("Value of the cell #" + index + " is " + arr[i]);
            }
        }
    }

    void contain(int[] arr, int value) {
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                contains = true;
                System.out.println("The value " + value + " is present");
            }
        }
        if (contains == false) {

            System.out.println("The value " + value + " is not present");
        }
    }

    void clear(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    void getSize(int[] arr) {
        System.out.println(arr.length);
    }

    void addAll(int[] arr, int[] secArr) {
        for (int i = 0; i < counterForSecond; ) {
            for (int j = 0; j < counterForSecond; j++) {
                arr[i + counter] = secArr[j];
                i++;
            }
        }
        counter += counterForSecond;
    }

    void findIndexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println("Number of the cell of value " + value + " is " + (i + 1));
            }
        }
    }

    void arraySort(int[] arr) {
        boolean swapped = true;
        int tmp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
    }
}



