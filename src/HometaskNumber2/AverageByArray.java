package HometaskNumber2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AverageByArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double counter = 0;
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(Double.parseDouble(s));
        }
        for (int i=0; i<list.size(); i++){
            counter+=list.get(i);
        }
        double average = counter/list.size();
        System.out.println(average);

    }
}



