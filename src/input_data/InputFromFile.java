/************************************************************************************
*                                  InputFromFile.java                                        *
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
package input_data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Color.*;
import java.util.ArrayList;

public class InputFromFile {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    ArrayList<Double> departmentData = new ArrayList<Double>();

    /*********************************************************************************
    *   readFromFile                                                                 *
    *                                                                                *
    *   Purpose:        Read each line of the file.                                  *
    *   Parameters:     N/A                                                          *
    *   Return Value:   int                                                          *
    *********************************************************************************/
    public String[] readFromFile(String fileName, int userChoice) {
        
        String[] words = new String[30];
        try {
            File fileN = new File(fileName);
            Scanner in = new Scanner(fileN);
            
            while (in.hasNext()) {
                String line = in.nextLine();
                words = line.split(" ");
    
                if (userChoice == 1 || userChoice == 2) 
                    printNames(words);
                else
                    addData(words[5]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("|   File cannot be located.");
        }

        if (userChoice > 2) {
            StatisticalAnalysis sa = new StatisticalAnalysis(departmentData);
            sa.bubbleSort();

            String curDepart = "";

            if (userChoice == 3) curDepart = "Meat";
            else if (userChoice == 4) curDepart = "Bakery";
            else if (userChoice == 5) curDepart = "Deli";
            else if (userChoice == 6) curDepart = "Produce";
            else if (userChoice == 7) curDepart = "Checkout";
            System.out.println("|                                                                    |\n");
            System.out.printf("|" + ANSI_GREEN + "\tHere are the calculations for %-8s" + ANSI_RESET + "\t\t\t    |\n", curDepart);
            
            double mean = sa.calcMean();
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated Mean:\t   %7.2f\t\t\t " + ANSI_RESET + "|\n", mean);
            
            double median = sa.calcMedian();
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated Median\t   %7.2f\t\t\t " + ANSI_RESET + "|\n", median);
            
            double max = sa.calcMax();
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated Maximum:\t   %7.2f\t\t\t " + ANSI_RESET + "|\n", max);
            
            double min = sa.calcMin();
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated Minimum:\t   %7.2f\t\t\t " + ANSI_RESET + "|\n", min);

            double stdDev = sa.calcStdDev();
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated Std Dev\t%7.2f\t\t\t " + ANSI_RESET + "|\n", stdDev);

            double var = sa.calcVariation(stdDev);
            System.out.printf("|  " + ANSI_BLUE + " \tCalculated variation\t%7.2f\t\t\t " + ANSI_RESET + "|\n", var);

            Scanner in = new Scanner(System.in);
            System.out.println("|                                                                    |");
            System.out.print("|\tHit enter to continue...");
            String enter = in.nextLine();

        }

        return words;

    }


    /*********************************************************************************
    *   printNames                                                                  *
    *                                                                                *
    *   Purpose:                                          *
    *   Parameters:                              *
    *   Return Value:   void                                                         *
    *********************************************************************************/
    public void printNames(String[] words) {
        String fullName = words[0] + " " + words[1];
        System.out.printf("|  " + ANSI_RED + "\t\t   %-48s  " + ANSI_RESET + "    |", fullName);
        System.out.println();
    }


    /*********************************************************************************
    *   addData                                                                  *
    *                                                                                *
    *   Purpose:                                          *
    *   Parameters:                              *
    *   Return Value:   void                                                         *
    *********************************************************************************/
    public void addData(String str) {
        departmentData.add(Double.parseDouble(str));
    }
}