package file_operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_file {
    public static void main(String[] args) throws IOException {
        //File directory = new File("C:/Users/nagesh.rao/Documents/File_operation_java");

        FileWriter f = new FileWriter("C:/Users/nagesh.rao/Documents/File_operation_java/new.txt");

        f.write(" This is added from the Editor \n code Testing");
        // close is necessaru while writing code
        f.close();


    }



}
