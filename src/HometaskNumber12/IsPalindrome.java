package HometaskNumber12;

public class IsPalindrome {
    public static void main(String[] args) {
        int number1 = 123456;
        int number2 = 123321;
        int number3 = 9239329;

        isPalindrome(number1);
        isPalindrome(number2);
        isPalindrome(number3);
    }
    private static void isPalindrome (int i){
        int num = i;
        String s = String.valueOf(num);
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String s1 = buffer.toString();
        int num1 = Integer.parseInt(s1);
        if (num1==num){
            System.out.println("The number "+num+" is a palindrome");
        }else{
            System.out.println("The number "+num+" isn't a palindrome");
        }

    }
}
