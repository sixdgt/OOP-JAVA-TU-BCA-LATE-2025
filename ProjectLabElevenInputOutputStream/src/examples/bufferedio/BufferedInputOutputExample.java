package examples.bufferedio;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputExample {
	public static void main(String args[]) throws IOException{
		String sourceFile = "C:/Users/flaw-/Documents/NetBeansProjects/"
				+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
				+ "src/examples/Subject.txt";
        String destFile = "C:/Users/flaw-/Documents/NetBeansProjects/"
        		+ "OOP in JAVA 2025 Topics/ProjectLabElevenInputOutputStream/"
        		+ "src/examples/BufferCopySubject.txt";

        // Try-with-resources ensures streams are closed automatically
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        
            byte[] buffer = new byte[1024]; // Temporary buffer
            int bytesRead;

            // Read from input and write to output
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Always flush output to ensure all data is written
            bos.flush();

            System.out.println("File copied successfully using buffered streams.");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
	}
}
