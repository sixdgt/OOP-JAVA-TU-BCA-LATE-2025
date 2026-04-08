package examples.filerw;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	public static void main(String args[]) throws IOException{

		String input_path = "C:/Users/flaw-/Documents/NetBeansProjects/"
				+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
				+ "src/examples/Subject.txt";
		
        String output_path = "C:/Users/flaw-/Documents/NetBeansProjects/"
        		+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
        		+ "src/examples/FileRWCopySubject.txt";
        
        FileReader reader = null;
        FileWriter writer = null;
        try {
            File input_file = new File(input_path);
            File output_file = new File(output_path);
            reader = new FileReader(input_file);
            writer = new FileWriter(output_file);
            int c;
            while((c = reader.read()) != -1){
                System.out.print((char)c);
                writer.write((char)c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
	}
}
