package com.indrasish.tutorial.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleCommandRun {

	public static void main(String[] args) {
		String src_file = "c:\\indrasish\\Source\\test.txt";
		String dest_folder = "c:\\indrasish\\Destination";
	    String[] args1 = { "CMD", "/C", "COPY", "/Y", src_file, dest_folder };
	    Process p;
		try {
			p = Runtime.getRuntime().exec(args1);
			p.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	                  
	   }

}
