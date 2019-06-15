package com.indrasish.tutorial.polymorphism;

import java.io.IOException;

public class UploadFile {
   
	public String uploadFile(String sourceFile, String destinationFolder) {
	
		String[] args1 = { "CMD", "/C", "COPY", "/Y", sourceFile, destinationFolder };
	    Process p;
		try {
			p = Runtime.getRuntime().exec(args1);
			p.waitFor();
		} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
		}
		return "Successful";
	}

}
