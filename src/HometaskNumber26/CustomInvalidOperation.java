package HometaskNumber26;

public class CustomInvalidOperation extends RuntimeException {
     String messageEx= "OOps! Invalid operation";

    public CustomInvalidOperation() {
        System.out.println(messageEx);
    }
}
