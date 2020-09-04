/************************************************************************************
*                          StatisticalAnalysis.java                                 *
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

import java.util.ArrayList;
import java.util.Collections;

public class StatisticalAnalysis {
    private ArrayList<Double> data = new ArrayList<Double>();

    // Constructor 1
    public StatisticalAnalysis(ArrayList<Double> data) {
        this.data = data;
        bubbleSort();
    }

    // Constructor 2
    public StatisticalAnalysis() {
   
    }


    /*********************************************************************************
    *   bubbleSort                                                                   *
    *                                                                                *
    *   Purpose:        Sorts the data in ascending order                            *
    *   Parameters:     N/A                                                          *
    *   Return Value:   Void                                                         *
    *********************************************************************************/
    public ArrayList<Double> bubbleSort() {
        double temp = 0;
        for (int i = 0; i < data.size()-1; i++) {
            for (int j = 0; j < data.size()-i-1; j++) {
                if (this.data.get(j) > this.data.get(j+1)) {
                    temp = data.get(j);
                    data.set(j, data.get(j+1));
                    data.set(j+1, temp);
                }
            }
        }

        return data;

    }


    /*********************************************************************************
    *   mean                                                                         *
    *                                                                                *
    *   Purpose:        Calculates the mean of the data                              *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcMean() {
        double mean = 0.0;
        for (int i = 0; i < data.size(); i++) {
            mean += data.get(i);
        }

        return mean / data.size();
    }


    /*********************************************************************************
    *   median                                                                       *
    *                                                                                *
    *   Purpose:        Calculates the median of the data                            *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcMedian() {
        double median = this.data.size() / 2;
        return median;
    }


    /*********************************************************************************
    *   max                                                                          *
    *                                                                                *
    *   Purpose:        Calculates the max of the data                               *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcMax() {
        return this.data.get(data.size()-1);
    }


    /*********************************************************************************
    *   min                                                                          *
    *                                                                                *
    *   Purpose:        Calculates the min of the data                               *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcMin() {
        return this.data.get(data.size()-1);
    }


    /*********************************************************************************
    *   stdDev                                                                       *
    *                                                                                *
    *   Purpose:        Calculates the standard deviation of the data                *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcStdDev() {
        double sumOfMean = 0.0;
        double mean = calcMean();
        for (int i = 0; i < data.size(); i++) {
            sumOfMean += Math.pow(data.get(i) - mean, 2);      // Numerator for equation
        }
        return sumOfMean;
    }


    /*********************************************************************************
    *   variation                                                                    *
    *                                                                                *
    *   Purpose:        Calculates the variation of the data.                        *
    *   Parameters:     N/A                                                          *
    *   Return Value:   double                                                       *
    *********************************************************************************/
    public double calcVariation(double sumOfMean) {
        return sumOfMean/(data.size()-1);
    }
}