package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import javax.swing.text.html.parser.Parser;

public class AnalyticsCounter {
	// private static int headacheCount = 0;	// initialize to 0
	// private static int rashCount = 0;		// initialize to 0
	// private static int pupilCount = 0;		// initialize to 0
	

	
	public static void main(String args[]) throws Exception {
		
		   // File path is passed as parameter
        File file = new File(
        		"..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");
 
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br
            = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
	
	//	 BufferedReader reader = new BufferedReader (new FileReader("..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt"));
	//		String line = reader.readLine();
		
	//	while (line != null) {
	//		System.out.print(line);
	//		}
	//	
		// first get input

		/*
		 BufferedReader reader = new BufferedReader (new FileReader("..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt"));
		String line = reader.readLine();
		
		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i

			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		
		//System.out.println(line);
		
		
	}
	
	*/
		

//	}	
		 
	
}
