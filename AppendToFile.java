// Appending to a File

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            // Create a FileWriter in append mode and BufferedWriter
            FileWriter writer = new FileWriter("output.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Appending text to the file
            bufferedWriter.newLine();
            bufferedWriter.write("This is an appended line.");

            // Closing the BufferedWriter
            bufferedWriter.close();

            System.out.println("Data appended to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
