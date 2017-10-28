package HometaskNumber8;

/**
 * Created by 1 on 08.08.2017.
 */
public class TheSumOfNumbers {
    public static void main(String[] args) {
        reverse(123);
        reverse(202);
    }
    public static void reverse(int i){
        int order1 = i%10;
        int order2 = (i/10)%10;
        int order3 = i/100;
        System.out.println(order1+order2+order3);

    }
}


