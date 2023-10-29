package com.hemebiotech.analytics;

import java.util.Map;

/** 
 * ISymptomWriter is an interface that contains the signatures of methods that write into a file.
 * @author BEN OUIRANE  Hajeur
 * @version 1.0
 */

public interface ISymptomWriter {
	
	/**
	 * Writes the symptoms and their quantities to the result.out file in the form of Map<Key, Value>.
	 * @param Symptoms is a Map which contains the symptoms in the form <Key, Value>
	 * @return Map of symptoms saved into output file.
	 */
	public void writeSymptoms(Map<String, Integer> symptoms);


}
