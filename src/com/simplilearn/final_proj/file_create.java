package com.simplilearn.final_proj;

import java.io.*;

public class file_create {

	public static void main(String[] args) {
		

		        File  f1 = new File("/home/soundariya27gma/eclipse-workspace/files/file2.txt/");
		        
		        
		        try {
					FileWriter fwriter = new FileWriter("/home/soundariya27gma/eclipse-workspace/files/file2.txt/");
					fwriter.write("My first file created successfully");
					fwriter.close();
					System.out.println("The content is successfully written inside the file.");
				} catch (IOException e) {
					System.out.println("Unexpected error occurred...");
					e.printStackTrace();
				}
		        
File  f2 = new File("/home/soundariya27gma/eclipse-workspace/files/file3.txt/");
		        
		        
		        try {
					FileWriter fwriter = new FileWriter("/home/soundariya27gma/eclipse-workspace/files/file3.txt/");
					fwriter.write("My second file created successfully");
					fwriter.close();
					System.out.println("The content is successfully written inside the file.");
				} catch (IOException e) {
					System.out.println("Unexpected error occurred...");
					e.printStackTrace();
				}
		        
File  f3 = new File("/home/soundariya27gma/eclipse-workspace/files/file4.txt/");
		        
		        
		        try {
					FileWriter fwriter = new FileWriter("/home/soundariya27gma/eclipse-workspace/files/file4.txt/");
					fwriter.write("My  file created successfully");
					fwriter.close();
					System.out.println("The content is successfully written inside the file.");
				} catch (IOException e) {
					System.out.println("Unexpected error occurred...");
					e.printStackTrace();
				}
File  f4 = new File("/home/soundariya27gma/eclipse-workspace/files/file5.txt/");
		        
		        
		        try {
					FileWriter fwriter = new FileWriter("/home/soundariya27gma/eclipse-workspace/files/file5.txt/");
					fwriter.write("My file created successfully");
					fwriter.close();
					System.out.println("The content is successfully written inside the file.");
				} catch (IOException e) {
					System.out.println("Unexpected error occurred...");
					e.printStackTrace();
				}    
File  f5 = new File("/home/soundariya27gma/eclipse-workspace/files/file6.txt/");
		        
		        
		        try {
					FileWriter fwriter = new FileWriter("/home/soundariya27gma/eclipse-workspace/files/file6.txt/");
					fwriter.write("My file created successfully");
					fwriter.close();
					System.out.println("The content is successfully written inside the file.");
				} catch (IOException e) {
					System.out.println("Unexpected error occurred...");
					e.printStackTrace();
				}
		        
			}

		}

	


