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


/** 
 * WriteSymptomDataToFile is a class that implements methods in the ISymptomWriter interface.
 * @author BEN OUIRANE  Hajeur
 * @version 1.0
 */

public class WriteSymptomDataToFile implements ISymptomWriter{
	
	 final static String outputFilePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\result.out"; 

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms){
		  try {
	             BufferedWriter f_writer
	                 = new BufferedWriter(new FileWriter(
	                		 outputFilePath));
	             for (Entry<String, Integer> entry : 
	            	 symptoms.entrySet()) { 
	            	 f_writer.write(entry.getKey() + ":"
	                         + entry.getValue()); 
	            	 f_writer.newLine(); 
	            }  
	             f_writer.close();
	         }
	         catch (IOException e) {
	             System.out.print(e.getMessage());
	         }
     }		
}
