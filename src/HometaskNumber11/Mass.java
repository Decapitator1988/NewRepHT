package HometaskNumber11;

import java.util.Scanner;

//Не работает с микрограммами

public class Mass {
    public static void main(String[] args) {
       Scanner  scanner = new Scanner(System.in);
        double userMass = scanner.nextDouble();
        if(userMass>0&&userMass<=1000){
            System.out.println(gramms(userMass)+" gramms");
        }else if(userMass>1000&&userMass<=1000000){
            System.out.println(kilogramms(userMass)+" kilograms, "+gramms(userMass)+" gramms");
        }else if(userMass>1000000){
            System.out.println(tons(userMass)+" tons, "+kilogramms(userMass)+" kilograms, "+gramms(userMass)+" gramms");
        }else if(userMass<1){
            System.out.println("kilograms, "+gramms(userMass)+" gramms"+micrograms(userMass)+" microgramms");
        }
//        System.out.println(tons(123456789));
//        System.out.println(kilogramms(123456789));
//        System.out.println(gramms(123456789));
    }
    public static int tons (double  massInGramms){
        int tons = (int) (massInGramms/1000000);
        return tons;
    }
    public static int kilogramms (double massInGramms){
        int kilogramms = (int) (massInGramms/1000)%1000;
        return kilogramms;
    }
    public static int gramms (double massInGramms){
        int gramms = (int) (massInGramms%1000);
        return gramms;
    }
    public static int micrograms(double massInGramms){
        int micrigrams = (int) (massInGramms%1000*1000);
        return micrigrams;
    }
}
