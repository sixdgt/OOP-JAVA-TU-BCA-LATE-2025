package examples.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileInputOutputExample {
	public static void main(String args[]) throws IOException {
		String input_path = "C:/Users/flaw-/Documents/NetBeansProjects/"
				+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
				+ "src/examples/Subject.txt";
		
        String output_path = "C:/Users/flaw-/Documents/NetBeansProjects/"
        		+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
        		+ "src/examples/CopySubject.txt";
        
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            File file_input = new File(input_path); // Subject.txt
            File file_output = new File(output_path); // CopySubject.txt
            // Reading file content
            input = new FileInputStream(file_input);
            // Writing file content
            output = new FileOutputStream(file_output);
            int c;
            while((c = input.read()) != -1){ // reading file content
            	System.out.print((char)c); // to display the read content from file
                output.write((char) c); // writing content to new file
            }
        } finally {
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
	}
}
