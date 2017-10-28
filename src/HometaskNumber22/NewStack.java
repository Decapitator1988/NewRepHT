package HometaskNumber22;



public class NewStack {
    private char[] array;
    private int size;
    private int sp;
    private String str;

    public NewStack(int size, String s) {
        this.size = size;
        this.str = s;
        array = new char[size];
    }

    private void push(char value) {
        if (sp < size) {
            array[sp++] = value;
        }
    }

    private char pop() {
        if (sp > 0) {
            return array[--sp];
        }
        return 0;
    }
//
//    public char peek() {
//        if (sp > 0) {
//            return array[sp - 1];
//        }
//        return 0;
//    }
////
//    private boolean isEmpty() {
//        return sp == 0;
//    }
//
//    private boolean isFull() {
//        return sp == size;
//    }
//
//    public void showStack() {
//        System.out.println(Arrays.toString(array));
//    }

    public void checkStack(NewStack newStack) {
        int counter = 0;
        for (int i = 0; i < newStack.str.length(); i++) {
            if (newStack.str.charAt(i) == '(') {
                newStack.push(newStack.str.charAt(i));
                counter++;
            } else if (newStack.str.charAt(i) == ')') {
                counter--;
                if (counter > 0) {
                    newStack.pop();
                }
            }
        }
        if (counter == 0) {
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
    }
}


