package HometaskNumber5;

import java.util.Scanner;

/**
 * Created by 1 on 08.08.2017.
 */
public class IsEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        if (i%2==0){
            System.out.println("Число "+i+" четное");
        }else{
            System.out.println("Число "+i+" нечетное");
        }
    }

}


