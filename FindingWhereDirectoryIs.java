package PracticePackage;
import java.io.IOException;
import java.io.File;

public class FindingWhereDirectoryIs {



        public static void main(String[] args) {
            // Create a test file
            File testFile = new File("test.txt");
            try {
                if (testFile.createNewFile()) {
                    System.out.println("Test file created in: " + testFile.getAbsolutePath());
                } else {
                    System.out.println("Test file already exists in: " + testFile.getAbsolutePath());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

