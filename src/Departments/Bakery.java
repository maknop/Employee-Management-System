/************************************************************************************
*                                Bakery.java                                        *
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

public class Bakery {
    private int itemsPackaged;
    
    // Constructor
    public Bakery(String firstName, String lastName, String empId, double pto, double hoursWorked, int itemsPackaged) {
        super(firstName, lastName, empId, pto, hoursWorked);
        this.itemsPackaged = itemsPackaged;
    }

    
    /*********************************************************************************
    *   getItemsPackaged                                                             *
    *                                                                                *
    *   Purpose:        Getter method for itemsPackaged attribute.                   *
    *   Parameters:     N/A                                                          *
    *   Return Value:   int                                                          *
    *********************************************************************************/
    public int getItemsPackaged() {
        return this.itemsPackaged;
    }


    /*********************************************************************************
    *   readFromFile                                                                 *
    *                                                                                *
    *   Purpose:        Setter method for itemsPackaged attribute                    *
    *   Parameters:     itemsPackaged - The amount of items packaged for             *
    *                   this associate.                                              *
    *   Return Value:   void                                                         *
    *********************************************************************************/
    public void setItemsPackaged(int itemsPackaged) {
        this.itemsPackaged = itemsPackaged;
    }
}