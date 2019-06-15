package com.indrasish.tutorial.polymorphism;

import java.util.Iterator;
import java.util.List;

public class ChooseFilesToUpload {

	private final String destinationFolder = "c:\\Indrasish\\Destination";
	UploadFile uploadFile = new UploadFile();
	
	public String uploadFile(String sourceFile) {
		uploadFile.uploadFile(sourceFile, destinationFolder);
		return "File Uploaded!!!";
	}
		
	public String uploadFile(String[] sourceFile) {
		for(int i=0; i<=sourceFile.length-1; i++) {
			uploadFile(sourceFile[i]);
		}
		return "";
	}
	
	public String uploadFile(List<String> sourceFile) {
		Iterator<String> iteratorFile = sourceFile.iterator();
		while(iteratorFile.hasNext()) {
			uploadFile(iteratorFile.next());
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		
		ChooseFilesToUpload obj1 = new ChooseFilesToUpload();
		//System.out.println(obj1.uploadFile("c:\\Indrasish\\Source\\test.txt"));
		
		String[] files = new String[]{"c:\\Indrasish\\Source\\test.txt",
		 "c:\\Indrasish\\Source\\test1.txt", "c:\\Indrasish\\Source\\test2.txt" };
		 obj1.uploadFile(files);
		
		
		
	}

}
