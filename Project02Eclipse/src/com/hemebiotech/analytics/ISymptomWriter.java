package com.hemebiotech.analytics;

import java.util.Map;

/** 
 * ISymptomWriter is an interface that contains the signatures of methods that write into a file.
 * @author BEN OUIRANE  Hajeur
 * @version 1.0
 */

public interface ISymptomWriter {
	
	/**
	 * Method that writes into file.
	 * @return Map of symptoms saved into output file.
	 */
	public void writeSymptoms(Map<String, Integer> symptoms);


}
