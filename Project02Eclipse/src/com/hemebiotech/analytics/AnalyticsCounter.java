package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.text.html.parser.Parser;

public class AnalyticsCounter {
	
	  public ISymptomReader symptomReader;
	  
	  public ISymptomWriter symptomWriter;
	  
	  public AnalyticsCounter(ISymptomReader reader,
			ISymptomWriter writer) {
		symptomReader = reader;
		symptomWriter = writer;
	   }
	  
	  ReadSymptomDataFromFile readSymtonFromFile;
	  
	  public List<String> getSymptoms() { 
		  
		  return  readSymtonFromFile.GetSymptoms();
	  }

	  public static Map<String, Integer> countSymptoms(List<String> symptoms) {
		  
	        BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader("..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt"));
			} catch (FileNotFoundException e1) {

				e1.printStackTrace();
			}
	        String st;
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
				e1.printStackTrace();
			}
	    	wordCountTable.entrySet().forEach(entry -> {
	    		//System.out.println(entry.getKey() + ": " + entry.getValue());
	    	});
			return wordCountTable;
	     }
	  public static Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		  
		  // TreeMap to store values of HashMap
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	          sorted.putAll(symptoms);
		  
	        // Display the TreeMap which is naturally sorted
	   /*    for (Map.Entry<String, Integer> entry : sorted.entrySet()) 
	            System.out.println( entry.getKey() + 
	                         ", Value = " + entry.getValue()); 
	                         */
	        return sorted ;
	  }

		 final static String outputFilePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\result.out"; 

	  public static void writeSymptoms(Map<String, Integer>
	  symptoms) { 
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

