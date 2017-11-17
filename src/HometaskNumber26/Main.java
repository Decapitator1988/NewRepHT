package HometaskNumber26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CustomValifationArguments {
        int[] array = new int[8];

        for (int i = 0; i < array.length - 1; i++) {
            int tmp = ((int) (Math.random() * 10));
            array[i] = tmp;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) throw new CustomInvalidOperation();

        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 5) {
                throw new CustomValifationArguments();
            }

            System.out.println(Arrays.toString(array));
        }
    }
}

