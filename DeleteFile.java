// Deleting file

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("output.txt");

        // Check if file exists and delete it
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
