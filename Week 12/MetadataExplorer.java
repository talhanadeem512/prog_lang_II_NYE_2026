import java.io.File;
import java.io.IOException;
import java.util.Date;

public class MetadataExplorer {
    public static void main(String[] args) {
        
        File myFile = new File("metadata_test.txt");

        if (myFile.exists()) {
            
            System.out.println("File Name: " + myFile.getName());
            System.out.println("Absolute Path: " + myFile.getAbsolutePath());
            System.out.println("Size: " + myFile.length() + " bytes");
            
            System.out.println("Last Modified: " + new Date(myFile.lastModified()));
        } else {
            try {
                
                if (myFile.createNewFile()) {
                    System.out.println("File did not exist and has been created.");
                }
            } catch (IOException e) {
                System.err.println("Error creating file: " + e.getMessage());
            }
        }
    }
}