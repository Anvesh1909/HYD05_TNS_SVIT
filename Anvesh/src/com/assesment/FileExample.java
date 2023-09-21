package com.assesment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;  

public class FileExample {
	
	void create(){
		try {
				File myObj = new File("File_Example.txt");
				if (myObj.createNewFile()) {
					System.out.println("File created: " + myObj.getName());
				}
				else {
					System.out.println("File already exists.");
				}
		} 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}
	
	void write(){
		try {
				FileWriter myWriter = new FileWriter("File_Example.txt");
				myWriter.write("This is the content written by Anvesh using java file concepts!");
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
		    }
			catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		    }
	}
	
	void read() {
		try {
		      	File myObj = new File("File_Example.txt");
		      	Scanner myReader = new Scanner(myObj);
		      	while (myReader.hasNextLine()) {
		      		String data = myReader.nextLine();
		      		System.out.println(data);
		      	}
		      	myReader.close();
		    }
			catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		    }
	}
	
	void delete() {
		File myObj = new File("File_Example.txt");
		if (myObj.delete()) { 
			System.out.println("Deleted the file: " + myObj.getName());
		}
		else {
			System.out.println("Failed to delete the file.");
		} 
	}
	
	public static void main(String[] args) {
		 FileExample f1= new  FileExample();
		 f1.create();
		 f1.write();
		 f1.read();
		 f1.delete();
	}

}
