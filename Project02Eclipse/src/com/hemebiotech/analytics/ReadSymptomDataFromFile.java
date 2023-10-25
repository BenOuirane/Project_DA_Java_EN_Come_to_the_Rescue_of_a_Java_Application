package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

      String filePath = "..\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\symptoms.txt";

	/**
	 * 
	 * @param filePathO a full or partial path to file with symptom strings in it, one per line
	 */

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		if (filePath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);

					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
