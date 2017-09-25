package com.aviation.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
	
	private static BufferedReader getReader() {
		return new BufferedReader(
			new InputStreamReader(System.in));
	}
	
	public static String text01(String aircraftM) {
		String input = null;
		try {
			System.out.print(aircraftM);
			input = getReader().readLine();
		} catch (Exception exp) {
			System.err.println(exp.getMessage());
		}
		return input;
	}
	
	public static String text02(String aircraftT) {
		String input = null;
		try {
			System.out.print("Select " + aircraftT + " aircraft type: ");
			input = getReader().readLine();
		} catch (Exception exp) {
			System.err.println(exp.getMessage());
		}
		return input;
	}

}
