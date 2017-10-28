package HometaskNumber4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 1 on 08.08.2017.
 */
public class ChessOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input height");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Please input width");
        int y = Integer.parseInt(reader.readLine());
        char[][] array = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if((i%2==0)&&(j%2!=0)){
                    array[i][j] = '*';
                }
                if((i%2!=0)&&(j%2==0)){
                    array[i][j] = '*';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

