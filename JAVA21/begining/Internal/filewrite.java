import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

    public static void main(String[] args) {
        // Replace "YourValue" with the actual value you want to check
        String input = "KARTHIK";

        if (containsSmallLetter(input)) {
            System.out.println("The value contains a small letter.");
        } else {
            System.out.println("The value does not contain a small letter. Writing to file...");

            try {
                writeToFile("output.txt", input);
                System.out.println("File 'output.txt' created with the message.");
            } catch (IOException e) {
                System.err.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
    }

    private static boolean containsSmallLetter(String value) {
        for (char c : value.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static void writeToFile(String fileName, String message) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("The Added text:" + message);
        }
    }
}

