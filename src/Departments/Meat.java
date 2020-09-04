/************************************************************************************
*                                  Meat.java                                        *
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
package Departments;

public class Meat {
        private double meatCut;

        // Constructor
        public Meat(String firstName, String lastName, String empId, double pto, double hoursWorked, double meatCut) {
            super(firstName, lastName, empId, pto, hoursWorked);
            this.meatCut = meatCut;
        }
    
        
        /*********************************************************************************
        *   getMeatCut                                                                   *
        *                                                                                *
        *   Purpose:        Getter method for meatCut attribute.                         *
        *   Parameters:     N/A                                                          *
        *   Return Value:   int                                                          *
        *********************************************************************************/
        public int getMeatCut() {
            return this.meatCut;
        }
    
    
        /*********************************************************************************
        *   setMeatCut                                                                   *
        *                                                                                *
        *   Purpose:        Setter method for itemsPackaged attribute                    *
        *   Parameters:     meatCut - Quantity of meat cut by associate in lbs.          *
        *   Return Value:   void                                                         *
        *********************************************************************************/
        public void setMeatCut(int meatCut) {
            this.meatCut = meatCut;
        }
}