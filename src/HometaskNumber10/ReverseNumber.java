package HometaskNumber10;

public class ReverseNumber {
    public static void main(String[] args) {
        printValue(123456);
    }
    public static int reverse (int value){
        int result = 0;
        while (value>0){
            result = result*10+value%10;
            value/=10;
        }
        return result;

    }
    public static void printValue(int value){
        System.out.println("The value is: "+value);
        System.out.println(("Reversed value is: "+reverse(value)));
    }
}




