package com.hemebiotech.analytics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(null, null);
		
		analyticsCounter.writeSymptoms(analyticsCounter.sortSymptoms(analyticsCounter.countSymptoms(null)));
		

	}

}
