package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.text.html.parser.Parser;

public class AnalyticsCounter {
	// private static int headacheCount = 0;	// initialize to 0
	// private static int rashCount = 0;		// initialize to 0
	// private static int pupilCount = 0;		// initialize to 0
	
	 final static String outputFilePath 
     = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\result.out"; 
	
	public static void main(String args[]) throws Exception {
    	Hashtable<String, Integer> symptome = new Hashtable<String, Integer>();

		WriteSymptomDataToFile test = new WriteSymptomDataToFile();
		
		test.writeSymptoms(symptome);
		
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
    //    while ((st = br.readLine()) != null)
 
            // Print the string
     //       System.out.println(st);
        
        
      //  String[] words = br.split("\\s+|\\.|\\,|\\?|\\:|\\;");
    	Hashtable<String, Integer> wordCountTable = new Hashtable<String, Integer>();

    	int minWordLength = 2;
    	 while ((st = br.readLine()) != null)
    	{
    		String uniqueWord = st.toLowerCase();
    		if (uniqueWord.length() > minWordLength) 
    		{
    			if (wordCountTable.containsKey(uniqueWord))	{
    				wordCountTable.replace(uniqueWord, wordCountTable.get(uniqueWord),
    						wordCountTable.get(uniqueWord).intValue() + 1);
    			} else {
    				wordCountTable.put(uniqueWord, 1);
    			}

    		}
    	}
    
    	wordCountTable.entrySet().forEach(entry -> {
    	//	System.out.println(entry.getKey() + ": " + entry.getValue());
    	});
    	
    	          
    
    	
    	   String text = "Computer Science Portal GeeksforGeeks";
         
    	   
    	 try {
    		 
             // Step 1: Create an object of BufferedWriter
             BufferedWriter f_writer
                 = new BufferedWriter(new FileWriter(
                		 outputFilePath));
             
             for (Entry<String, Integer> entry : 
            	 wordCountTable.entrySet()) { 
  
                // put key and value separated by a colon 
            	 f_writer.write(entry.getKey() + ":"
                         + entry.getValue()); 
  
                // new line 
            	 f_writer.newLine(); 
            }  

             // Step 2: Write text(content) to file
        //     f_writer.write(text);


             // Step 3: Printing the content inside the file
             // on the terminal/CMD
           //  System.out.print(wordCountTable);

             // Step 4: Display message showcasing
             // successful execution of the program
        //     System.out.print( "File is created successfully with the content.");

             // Step 5: Close the BufferedWriter object
             f_writer.close();
         }

         // Catch block to handle if exceptions occurs
         catch (IOException e) {

             // Print the exception on console
             // using getMessage() method
             System.out.print(e.getMessage());
         }
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

