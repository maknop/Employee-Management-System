/************************************************************************************
*                                 Deli.java                                         *
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

public class Deli {
        private int prepFoodQuan;

        // Constructor
        public Deli(String firstName, String lastName, String empId, double pto, double hoursWorked, int prepFoodQuan) {
            super(firstName, lastName, empId, pto, hoursWorked);
            this.prepFoodQuan = prepFoodQuan;
        }
    
        
        /*********************************************************************************
        *   getPrepFoodQuan                                                              *
        *                                                                                *
        *   Purpose:        Getter method for prepFoodQuan attribute.                    *
        *   Parameters:     N/A                                                          *
        *   Return Value:   int                                                          *
        *********************************************************************************/
        public int getItemsPackaged() {
            return this.prepFoodQuan;
        }
    
    
        /*********************************************************************************
        *   setPrepFoodQuan                                                              *
        *                                                                                *
        *   Purpose:        Setter method for prepFoodQuan attribute                     *
        *   Parameters:     prepFoodQuan - Quantity of prepared sandwiches by this       *
                            associate.                                                   *
        *   Return Value:   void                                                         *
        *********************************************************************************/
        public void setItemsPackaged(int itemsPackaged) {
            this.prepFoodQuan = prepFoodQuan;
        }
}