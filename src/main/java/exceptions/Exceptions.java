package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        File file = new File("files/data.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                System.out.println(fileReader.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            assert fileReader != null;
            fileReader.close();
        }
    }
}
