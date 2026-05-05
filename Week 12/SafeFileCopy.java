import java.io.*;

public class SafeFileCopy {
    public static void main(String[] args) {
        File source = new File("source.jpg");
        File destination = new File("copy_of_source.jpg");

        
        try (FileInputStream fin = new FileInputStream(source);
             FileOutputStream fout = new FileOutputStream(destination)) {
            
            int byteData;
            
            while ((byteData = fin.read()) != -1) {
                fout.write(byteData);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O Error during copy: " + e.getMessage());
        }
    }
}