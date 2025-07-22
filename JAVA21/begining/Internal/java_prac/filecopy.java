import java.io.IOException;
import java.nio.file.*;

public class FileCopyExample {

    public static void main(String[] args) {
        String source = "path/to/source/folder";
        String destination = "path/to/destination/folder";
        String fileName = "example.txt";

        copyFile(source, destination, fileName);
    }

    private static void copyFile(String source, String destination, String fileName) {
        try {
            Path sourcePath = Path.of(source, fileName);
            Path destinationPath = Path.of(destination, fileName);

            if (Files.exists(sourcePath)) {

                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File copied successfully!");
                
            } else {
                System.out.println("Source file does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
