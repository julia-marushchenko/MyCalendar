/**
 *  Java program to demonstrate abstract Calendar class.
 */

package com.mycalendar;

import java.util.Calendar;

/**
 *  Main class.
 */
public class Main {

    // Entry point for JVM.
    public static void main(String[] args) {

        // Creating instance of Calendar.
        Calendar c = Calendar.getInstance();

        // Printing current date.
        System.out.println("The current date is: " + c.getTime()); // Output: The current date is:
                                                                   // Thu Feb 26 21:45:53 CET 2026

        // Printing current week.
        System.out.println("Current week : " + c.getWeeksInWeekYear()); // Output: 52

    }
}