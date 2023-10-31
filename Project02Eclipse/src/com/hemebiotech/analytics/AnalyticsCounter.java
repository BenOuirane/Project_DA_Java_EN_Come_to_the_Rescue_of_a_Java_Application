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
/** 
 * Analytics Counter is a class that calculates the number of occurrences of words in a file.
 * @author BEN OUIRANE  Hajeur
 * @version 1.0
 */

public class AnalyticsCounter {
	
	  public ISymptomReader symptomReader;
	  public ISymptomWriter symptomWriter;
	  static ReadSymptomDataFromFile readSymptomFromFile;
	  static WriteSymptomDataToFile  writeSymptomDataToFile;
	  public static ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
	  final static String outputFilePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\result.out"; 
	  String filePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt";

	  /** 
	  * Class constructor.
	  */
	  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		symptomReader = reader;
		symptomWriter = writer;
	   }
	   /**
	   * This is a call to the getSymptoms method of object readSymptomFromFile of type ReadSymptomDataFromFile.
	   * @return List of symptoms.
	   */
	  public static   List<String> getSymptoms() { 
		  return  readSymptomDataFromFile.getSymptoms();
	  }

	  /**
	   * Calculates the number of occurrences of words in a file.
	   * @param symptoms  is a Map which contains the symptoms of the files.
	   * @return  a Map which contains the number of occurrences of symptoms <symptom, occurrence>
	   */
	  public static Map<String, Integer> countSymptoms(List<String> symptoms) {
	         HashMap<String, Integer> wordOcurence = new HashMap<String, Integer>();
		    for (String c : symptoms){
		         if (wordOcurence.containsKey(c)){
		        	 wordOcurence.put(c, wordOcurence.get(c) + 1);}
		         else{
		        	 wordOcurence.put(c, 1);}
		      }
			return wordOcurence; 
	     }
	  
	  /**
	   * Sorts the Map of symptoms  in alphabetical order.
	   * @param symptoms  is a Map which contains the symptoms of the files.
	   * @return  a Map of symptoms and occurrences in alphabetical order.
	   */
	  public static Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
	        TreeMap<String, Integer> sorted = new TreeMap<>();
	          sorted.putAll(symptoms);
	        return sorted ;
	  }
	  
	  /**
	   * Writes the result to the output file using ISymptomWriter instance already created.
	   * @param symptoms  is a Map which contains the symptoms of the files.
	   */
	  public  void writeSymptoms(Map<String, Integer> symptoms) { 
		  writeSymptomDataToFile = new WriteSymptomDataToFile();
		  writeSymptomDataToFile.writeSymptoms(symptoms);	 
	  }		  
}

