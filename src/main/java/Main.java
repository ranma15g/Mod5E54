/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
5.4 (Conversion from miles to kilometers) Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
Due: Oct 13 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

public class Main { // Open the class block
  
    public static void main(String[] args) { // Open the main method block

        // Here we creae the header for the table
        System.out.println("Miles\tKilometers");

        // Call the method to generate the table 
        genTab(1, 10);

    } // Close the main method block

    // Here we create a method to generate the table
    private static void genTab(int bMiles, int eMiles) { // open the method

        // Loop to generate the table rows
        for (int miles = bMiles; miles <= eMiles; miles++) {

            // For each loop we calculate that mile to kilometer conversion
            double kilometers = miles * 1.609;

            // And we produce the mile kilometer conversion
            System.out.printf("%-7d\t%.3f\n", miles, kilometers);
            /* printf() is a method used to format and print output
               using placeholders and arguments.
               We use the -7 format to line up the kilometers numbers
               alongside the kilometers for clarity */
        } 

    } // close the method
  
} // Close the class block