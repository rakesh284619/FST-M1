package activities;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Activity14 {
	    public static void main(String[] args) {
	        try {
	       
	            File file = new File("sample.txt");

	            
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }

	            FileWriter writer = new FileWriter(file);
	            writer.write("Hello, this is Activity 14!\nLearning File I/O in Java.");
	            writer.close();

	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	}


