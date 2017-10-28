package HometaskNumber22;

public class MainClass {
    public static void main(String[] args) {
        String stringOne = "(()()(()())))";
        String stringTwo = "(()())";
        String stringThree = "(0((()))()";

        NewStack newStack = new NewStack(stringOne.length(), stringOne);
        NewStack newStack1 = new NewStack(stringTwo.length(), stringTwo);
        NewStack newStack2 = new NewStack(stringThree.length(), stringThree);


        newStack.checkStack(newStack);
        newStack1.checkStack(newStack1);
        newStack2.checkStack(newStack2);

    }
}


