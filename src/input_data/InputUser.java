package input_data;

import java.util.Scanner;

public class InputUser {
    public String stringInput() {
        String raw_data = "";
        Scanner in = new Scanner(System.in);

        // Input is accepted and immediately converted to uppercase letters. 
        raw_data = in.nextLine().toUpperCase();

        in.close();

        return raw_data;
    }

    public int integerInput() {
        Scanner in = new Scanner(System.in);
        int raw_data = in.nextInt();

        return raw_data;
    }
}