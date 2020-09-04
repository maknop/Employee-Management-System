package input_data;

import java.util.Random;
import java.util.Scanner;

public class RandomInput {
    public String randString() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int numChar = in.nextInt();

        String raw_data = "";

        
        return raw_data;
    }


    public int randInteger() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int numChar = in.nextInt();

        int raw_data = 0;

        
        return raw_data;
    }


    public double randDouble() {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int numChar = in.nextInt();

        double raw_data = 0.0;

        
        return raw_data;
    }
}