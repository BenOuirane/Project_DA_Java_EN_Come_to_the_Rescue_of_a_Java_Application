package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		  ISymptomReader symptomReader = null;
		  ISymptomWriter symptomWriter = null;
		  List<String> symptoms = null;		
	    	AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptomReader,symptomWriter );
	    	analyticsCounter.writeSymptoms(analyticsCounter.sortSymptoms(AnalyticsCounter.countSymptoms(symptoms)));
		

	}

}
