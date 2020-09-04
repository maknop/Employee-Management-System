/************************************************************************************
*                              Checkout.java                                        *
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

public class Checkout {
        private double checkoutSpeed;

        // Constructor
        public Checkout(String firstName, String lastName, String empId, double pto, double hoursWorked, double checkoutSpeed) {
            super(firstName, lastName, empId, pto, hoursWorked);
            this.checkoutSpeed = checkoutSpeed;
        }
    
        
        /*********************************************************************************
        *   getCheckoutSpeed                                                             *
        *                                                                                *
        *   Purpose:        Getter method for checkoutSpeed attribute.                   *
        *   Parameters:     N/A                                                          *
        *   Return Value:   double                                                       *
        *********************************************************************************/
        public double getCheckoutSpeed() {
            return this.checkoutSpeed;
        }
    
    
        /*********************************************************************************
        *   setCheckoutSpeed                                                             *
        *                                                                                *
        *   Purpose:        Setter method for checkoutSpeed attribute                    *
        *   Parameters:     checkoutSpeed - The speed of this employees product          *
        *                   scanning on the register.                                    *
        *   Return Value:   void                                                         *
        *********************************************************************************/
        public void setCheckoutSpeed(int checkoutSpeed) {
            this.checkoutSpeed = checkoutSpeed;
        }
}