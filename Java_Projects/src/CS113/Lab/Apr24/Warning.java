//Justin Ho, Khanh Dang

package CS113.Lab.Apr24;// ************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ************************************************************************

import java.util.Scanner;
import java.io.*;
public class Warning
{
    // -------------------------------------------------------------------
// Reads student data (name, semester hours, quality points) from a
// text file, computes the GPA, then writes data to another file
// if the student is placed on academic warning.
// -------------------------------------------------------------------
    public static void main (String[] args)
    {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name, inputName = "students.dat";
        String outputName = "warning.dat";
        try
        {
// Set up scanner to input file
            Scanner scan = new Scanner(new File(inputName));

// Set up the output file stream
            PrintWriter outFile = new PrintWriter(outputName);

// Print a header to the output file
            outFile.println ();
            outFile.println ("Students on Academic Warning");
            outFile.println ();
// Process the input file, one token at a time
            // Filter for gpa less than 1.5
            while (scan.hasNext())
            {
                line = scan.nextLine();

                // Name, hours, points
                String[] parsedString = line.split(" ");
                name = parsedString[0];
                creditHrs = Integer.parseInt(parsedString[1]);
                qualityPts = Double.parseDouble(parsedString[2]);

// Get the credit hours and quality points and
// determine if the student is on warning. If so,
// write the student data to the output file.

                gpa = qualityPts / creditHrs;

                // Academic warning
                if( (gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) || (gpa < 2)) {
                    // Write name, credit hrs, gpa to output file
                    outFile.println();
                    outFile.println(name);
                    outFile.println(creditHrs);
                    outFile.println(gpa);
                    outFile.println();
                }
            }
// Close output file
            outFile.close();
        }
        catch (FileNotFoundException exception)
        {
            System.out.println ("The file " + inputName + " was not found.");
        }
        catch (IOException exception)
        {
            System.out.println (exception);
        }
        catch (NumberFormatException e)
        {
            System.out.println ("Format error in input file: " + e);
        }
    }
}