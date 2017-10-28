package HometaskNumber19;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ArrayClass container  = new ArrayClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of container");
        int size = scanner.nextInt();
        container.setSize(size);
        int [] array = new int[size];
        int[] secondArray = new int[5];

            container.showArray(array);
            container.add(array, 45);
            container.add(array, 74);
            container.add(array, 22);
            container.add(array, 89);
            container.add(array, 500);
            container.showArray(array);
            container.getByIndex(array, 1);
            container.getByIndex(array, 2);
            container.getByIndex(array, 4);
       container.contain(array, 45);
       container.contain(array, 22);
       container.contain(array, 15);
       container.showArray(array);

        container.getSize(array);

        container.addForSecond(secondArray, 33);
        container.addForSecond(secondArray, 19);
        container.addForSecond(secondArray, 14);
        container.addForSecond(secondArray, 8);

        container.showArray(secondArray);
        container.showArray(array);

        container.addAll(array, secondArray);
        container.addAll(array, secondArray);


        container.showArray(array);

        container.findIndexOf(array, 89);
        container.findIndexOf(array, 8);

        container.arraySort(array);

        container.showArray(array);

        container.clear(array);

        container.showArray(array);
       }

    }

