/************************************************************************************
*                                  Main.java                                        *
*                                                                                   *
*  PROGRAMMER:         Matthew Knop                                                 *
*  CLASS:              CS200                                                        *
*  ASSIGNMENT:         Final Project - Employee Management System                   *
*  INSTRUCTOR:         Dean Zeller                                                  *
*  SUBMISSION DATE:                                                                 *
*                                                                                   *
*  DESCRIPTION:                                                                     *
*                                                                                   *
*  COPYRIGHT:                                                                       *
*  This program is copyright (c) 2019 Matthew Knop and Dean Zeller. This is         *
*  original work, without use of outside sources.                                   *
************************************************************************************/
import input_data.*;
import output_data.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInterface();
        mainScreen();
    }


    /*********************************************************************************
    *   userInterface                                                                *
    *                                                                                *
    *   Purpose:        Allows the user to navigate the employee management system.  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public static void userInterface() {
        // 70 dashes in length
        System.out.print("|                                                                    |\n"
                       + "|--------------------------------------------------------------------|\n"
                       + "|                                                                    |\n"
                       + "|                                                                    |\n"
                       + "|                     Employee Management System                     |\n"
                       + "|                                                                    |\n");

    }


    /*********************************************************************************
    *   mainScreen                                                                   *
    *                                                                                *
    *   Purpose:        If user selects option one.                                  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public static void mainScreen() {
        int userChoice = -1;
        while (userChoice != '0') {
            System.out.print("|                                                                    |\n"
                           + "|--------------------------------------------------------------------|\n"
                           + "|                                                                    |\n"
                           + "|       Select from the following options, '0' to exit:              |\n"
                           + "|           1. View Complete list of employees                       |\n"
                           + "|           2. View Employees by department                          |\n"
                           + "|           3. Calculate Meat metrics                                |\n"
                           + "|           4. Calculate Bakery metrics                              |\n"
                           + "|           5. Calculate Deli metrics                                |\n"
                           + "|           6. Calculate Produce metrics                             |\n"
                           + "|           7. Calculate Checkout metrics                            |\n"
                           + "|                                                                    |\n");

           InputFromFile fileInput = new InputFromFile();
           InputUser userInput = new InputUser(); 
            System.out.print("| => ");
            userChoice = userInput.integerInput();

            // User's choice is ran against various cases
            if (userChoice == 1) optionOne();
            else if (userChoice == 2) optionTwo();
            else if (userChoice == 3) fileInput.readFromFile("EmployeeRecords/meat_department.txt", 3);
            else if (userChoice == 4) fileInput.readFromFile("EmployeeRecords/meat_department.txt", 4);
            else if (userChoice == 5) fileInput.readFromFile("EmployeeRecords/meat_department.txt", 5);
            else if (userChoice == 6) fileInput.readFromFile("EmployeeRecords/meat_department.txt", 6);
            else if (userChoice == 7) fileInput.readFromFile("EmployeeRecords/meat_department.txt", 7);

        }
    }


    /*********************************************************************************
    *   optionOne                                                                    *
    *                                                                                *
    *   Purpose:        If user selects option one.                                  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public static void optionOne() {
        
        System.out.print("|                                                                    |\n"
            +            "|       Here is the complete list of Associates:                     |\n");
        
        InputFromFile fileInput = new InputFromFile();
        String[] meat = fileInput.readFromFile("EmployeeRecords/meat_department.txt", 1);
        String[] bakery = fileInput.readFromFile("EmployeeRecords/bakery_department.txt", 1);
        String[] deli = fileInput.readFromFile("EmployeeRecords/deli_department.txt", 1);
        String[] produce = fileInput.readFromFile("EmployeeRecords/produce_department.txt", 1);
        String[] checkout = fileInput.readFromFile("EmployeeRecords/checkout.txt", 1);
    }


    /*********************************************************************************
    *   optionTwo                                                                    *
    *                                                                                *
    *   Purpose:        If user selects option two.                                  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public static void optionTwo() {
        System.out.print("|                                                                    |\n"
                       + "|--------------------------------------------------------------------|\n"
                       + "|                                                                    |\n"
                       + "|       Which department would you like to view?                     |\n"
                       + "|           1. Meat Department                                       |\n"
                       + "|           2. Bakery Department                                     |\n"
                       + "|           3. Deli Department                                       |\n"
                       + "|           4. Produce Department                                    |\n"
                       + "|           5. Checkout                                              |\n"
                       + "|           6. EXIT TO HOME SCREEN                                   |\n"
                       + "|                                                                    |\n");


        InputUser userInput = new InputUser(); 
        System.out.print("| => ");
        int userChoice = userInput.integerInput();

        // User's choice is ran against various cases
        if (userChoice == 1) optionTwoHeader("Meat");
        else if (userChoice == 2) optionTwoHeader("Bakery");
        else if (userChoice == 3) optionTwoHeader("Deli");
        else if (userChoice == 4) optionTwoHeader("Produce");
        else if (userChoice == 5) optionTwoHeader("Checkout");
        else if (userChoice == 6) mainScreen();

    }


    /*********************************************************************************
    *   optionTwoHeader                                                              *
    *                                                                                *
    *   Purpose:        If user selects option two.                                  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public static void optionTwoHeader(String department) {
        System.out.printf("|                                                                    |\n"
                        + "|                                                                    |\n"
                        + "|--------------------------------------------------------------------|\n"
                        + "|                                                                    |\n"
                        + "|                                                                    |\n"
                        + "|   Here is the list from the requested department:  %-16s|\n", department);
        

        InputFromFile fileInput = new InputFromFile();

        if (department == "Meat") {
            String[] meat = fileInput.readFromFile("EmployeeRecords/meat_department.txt", 2);
        } else if (department == "Bakery") {
            String[] bakery = fileInput.readFromFile("EmployeeRecords/bakery_department.txt", 2);
        } else if (department == "Deli") {
            String[] deli = fileInput.readFromFile("EmployeeRecords/deli_department.txt", 2);
        } else if (department == "Produce") {
            String[] produce = fileInput.readFromFile("EmployeeRecords/produce_department.txt", 2);
        } else if (department == "Checkout") {
            String[] checkout = fileInput.readFromFile("EmployeeRecords/checkout.txt", 2);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("|                                                                    |");
        System.out.print("|\tHit enter to continue...");
        String enter = in.nextLine();
    }





    /*********************************************************************************
    *   viewDepartment                                                               *
    *                                                                                *
    *   Purpose:        View data based on department.                               *
    *   Parameters:     userOption - int corresponding to the option the user        *
                        chose for viewing department metrics                         *
    *   Return Value:   void                                                         *
    *********************************************************************************/
    public static void viewDepartment(int userOption, String[] strArr) {
        InputFromFile fileInput = new InputFromFile();

        if (userOption == 1) {          // Meat Department
            optionTwoHeader("Meat");
            //fileInput.readFromFile("EmployeeRecords/meat_department.txt");
        } else if (userOption == 2) {   // Bakery Department
            optionTwoHeader("Bakery");
            //fileInput.readFromFile("EmployeeRecords/bakery_department.txt");
        } else if (userOption == 3) {   // Deli Department
            optionTwoHeader("Deli");
            //fileInput.readFromFile("EmployeeRecords/deli_department.txt");
        } else if (userOption == 4) {   // Produce Department
            optionTwoHeader("Produce");
            //fileInput.readFromFile("EmployeeRecords/produce_department.txt");
        } else if (userOption == 5) {   // Checkout
            optionTwoHeader("Checkout");
            //fileInput.readFromFile("EmployeeRecords/checkout.txt");
        }
        

    }
}