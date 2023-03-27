package file_operation;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        File directory = new File("C:/Users/nagesh.rao/Documents/File_operation_java");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File file = new File(directory, "new.txt");
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File creation failed!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
