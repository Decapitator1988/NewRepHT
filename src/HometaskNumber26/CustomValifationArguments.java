package HometaskNumber26;

public class CustomValifationArguments extends Exception {
    private static int counter;
    private String messageEx = "Number more than 5";

    public CustomValifationArguments() {

        counter++;
        System.out.println(messageEx+" "+counter);
    }


}
