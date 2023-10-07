package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomDataToFile implements ISymptomWriter{
	
	 final static String outputFilePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\result.out"; 
     File file = new File("..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt");

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms){
        // Creating an object of BufferedReader class
        BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 
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
    	 try {
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
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    
    	wordCountTable.entrySet().forEach(entry -> {
    		System.out.println(entry.getKey() + ": " + entry.getValue());
    		System.out.println("help me god");

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
	

}
