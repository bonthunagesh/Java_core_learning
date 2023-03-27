package file_operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_file {
    public static void main(String args[]) throws FileNotFoundException {
        File f = new File("C:/Users/nagesh.rao/Documents/File_operation_java/new.txt");

        Scanner s = new Scanner(f);

        //String FileData = null;
        while (s.hasNextLine()) {
            String FileData = s.nextLine();

            System.out.println(FileData);
        }

       s.close();

    }
}
