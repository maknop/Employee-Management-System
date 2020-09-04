/************************************************************************************
*                                Produce.java                                       *
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

public class Produce {
        private int fruitVegTrays;

        // Constructor
        public Produce(String firstName, String lastName, String empId, double pto, double hoursWorked, int fruitVegTrays) {
            super(firstName, lastName, empId, pto, hoursWorked);
            this.fruitVegTrays = fruitVegTrays;
        }
    
        
        /*********************************************************************************
        *   getFruitVegTrays                                                             *
        *                                                                                *
        *   Purpose:        Getter method for itemsPackaged attribute.                   *
        *   Parameters:     N/A                                                          *
        *   Return Value:   int                                                          *
        *********************************************************************************/
        public int getFruitVegTrays() {
            return this.fruitVegTrays;
        }
    
    
        /*********************************************************************************
        *   setFruitVegTrays                                                             *
        *                                                                                *
        *   Purpose:        Setter method for itemsPackaged attribute                    *
        *   Parameters:     itemsPackaged - The amount of items packaged for             *
        *                   this associate.                                              *
        *   Return Value:   void                                                         *
        *********************************************************************************/
        public void setFruitVegTrays(int fruitVegTrays) {
            this.fruitVegTrays = fruitVegTrays;
        }
}