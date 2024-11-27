//  File Existence Check

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckFileExistence {
    public static void main(String[] args) {
        File file = new File("output.txt");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists, ready to read.");
            try {
                FileReader reader = new FileReader(file);
                int i;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
