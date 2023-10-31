package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		  ISymptomReader symptomReader = null;
		  ISymptomWriter symptomWriter = null;
		  List<String> symptoms = null;	
		  List<String> symptomsList;
		  Map<String, Integer> wordOcurence ;
		  Map<String, Integer> sorted;
	      AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptomReader,symptomWriter );
	    	symptomsList =	AnalyticsCounter.getSymptoms();
	    	wordOcurence =  AnalyticsCounter.countSymptoms(symptomsList);
	    	sorted       =  analyticsCounter.sortSymptoms(wordOcurence);
	    	analyticsCounter.writeSymptoms(sorted);
		

	}

}
