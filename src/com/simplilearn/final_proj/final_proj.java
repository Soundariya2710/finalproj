package com.simplilearn.final_proj;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class final_proj {
	
	public static void main(String[] args) {
			
		String filename;

		char ch;

		File directory = new File("/home/soundariya27gma/eclipse-workspace/files/");

		String[] flist = directory.list();

			// Take user Option from the below mentioned Menu
			Scanner input = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("******* Company Lockers Pvt Ltd********");
			System.out.println("*****************************************");
			
			System.out.println();
			
			// to display the list of files sorted in alphabetical order
			listOfFiles();

			do {

				System.out.println("Select File Option to perform any operation:- \n");
				System.out.println("1.Create File");
			    System.out.println("2.Delete File");
				System.out.println("3.Search file");
				System.out.println("4.Exit");

				int choice = input.nextInt();

				switch (choice) {

				case 1:

					System.out.println("Enter the file name for crating new file");
					filename = input.next();

					try {
						File file = new File("/home/soundariya27gma/eclipse-workspace/files/" + filename + ".txt");

						if (file.createNewFile()) {

							System.out.println("File Created Successfully \n");
						} else {
							if (file.exists()) {
								System.out.println("File Already Exists");
							} else {
								System.out.println("File Doesen't exist");
							}

							// Delete the file code below

							boolean b = file.delete();
							if (b == true) {
								System.out.println("File  Deleted");
							} else {
								System.out.println("File  not Deleted");
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("After Creation");
					listOfFiles();
					break;

					case 2:

					System.out.println("Enter the file name which you want to delete");

					filename = input.next();

					File directory_delete = new File("/home/soundariya27gma/eclipse-workspace/files/");

					String[] flist_delete = directory_delete.list();

					// String[] flist = directory.list();
					int flag_d = 0;
					if (flist_delete == null) {
						System.out.println("There is no file preseent in the directory");
					} else {

						// Linear search in the array
						for (int i = 0; i < flist_delete.length; i++) {
							String delete_filename = flist_delete[i];
							if (delete_filename.equalsIgnoreCase(filename)) {

								File file = new File(
										"/home/soundariya27gma/eclipse-workspace/files/" + delete_filename);
								if (file.delete()) {
									System.out.println("File deleted successfully");
								} else {
									System.out.println("Failed to delete the file");
								}
								flag_d = 1;
							}
						}
					}

					if (flag_d == 0) {
						System.out.println("File Not Found");
					}
							break;

				case 3:
					// Create an object of the File class
					// Replace the file path with path of the directory
					System.out.println("Enter the file name for searching");

					filename = input.next();

					File directory_search = new File("/home/soundariya27gma/eclipse-workspace/files/");

					String[] flist_search = directory_search.list();
					int flag_s = 0;
					if (flist_search == null) {
						System.out.println("There is no file preseent in the directory");
					} else {

						// Linear search in the array
						for (int i = 0; i < flist_search.length; i++) {
							String search_filename = flist_search[i];
							if (search_filename.equalsIgnoreCase(filename)) {
								System.out.println(search_filename + " found");
								flag_s = 1;
							}
						}
					}

					if (flag_s == 0) {
						System.out.println("File Not Found");
					}
              
					break;

				case 4:

					System.out.println("Thank you User");
					break;

				default:

					System.out.println("Your input number is incorrect.Choose correct Number");
					break;

				}
				System.out.println("Do you want to continue Type (y or n) \n");
				ch = input.next().charAt(0);

			} while (ch == 'Y' || ch == 'y');

		}

             private static void listOfFiles() {
			System.out.println("List of files after being sorted");
			File folder = new File("/home/soundariya27gma/eclipse-workspace/files/");
			File[] listOfFiles = folder.listFiles();
			
			//sort files in folder
			Arrays.sort(listOfFiles, new Comparator()
		      {
		        @Override
		        public int compare(Object f1, Object f2) {
		          return ((File) f1).getName().compareTo(((File) f2).getName());
		        }
		      });
			
			//Prints the files in file name ascending order
		      for(File file:listOfFiles)
		      {
		        System.out.println(file.getName());
		      }
		     
		}

	}
