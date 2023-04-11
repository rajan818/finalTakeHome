package Exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    public static void main(String[] args) {
        String path = "dictionary.txt";
        if (doesFileExist(path)) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String line = reader.readLine();
                while (line != null) {
                    String[] parts = line.split(" - ");
                    String word = parts[0];
                    String[] meanings = parts[1].split(", ");
                    System.out.println(word);
                    for (String meaning : meanings) {
                        System.out.println("  " + meaning);
                    }
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist at path: " + path);
        }
    }
    
    public static boolean doesFileExist(String path) {
        File file = new File(path);
        return file.exists();
    }
}
