/************************************************************************************
*                                 Employee.java                                      *
*                                                                                   *
*  PROGRAMMER:         Matthew Knop                                                 *
*  CLASS:              CS200                                                        *
*  ASSIGNMENT:         Assignment 3 - Tortoise & Hare, Inheritance Edition          *
*  INSTRUCTOR:         Dean Zeller                                                  *
*  SUBMISSION DATE:    October 25th, 2019                                           *
*                                                                                   *
*  DESCRIPTION:                                                                     *
*                                                                                   *
*  COPYRIGHT:                                                                       *
*  This program is copyright (c) 2019 Matthew Knop and Dean Zeller. This is         *
*  original work, without use of outside sources.                                   *
************************************************************************************/
public class Employee {
    protected String firstName;
    protected String lastName;
    protected String empId;
    protected double pto;
    protected double hoursWorked;

    // Contructor
    public Employee(String firstName, String lastName, String empId, double pto, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.pto = pto;
        this.hoursWorked = hoursWorked;
    }

    /*********************************************************************************
    *   toString                                                                     *
    *                                                                                *
    *   Purpose:        Converts a different datatype to a string                    *
    *   Parameters:     N/A                                                          *
    *   Return Value:   String - Returns a string                                    *
    *********************************************************************************/
    public String toString() {
        return "";
    }
}