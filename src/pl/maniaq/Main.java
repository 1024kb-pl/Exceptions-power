package pl.maniaq;

import pl.maniaq.checked.FileManager;
import pl.maniaq.checked.FileOperationException;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        try {
            fileManager.displayColorTextFromFile("fileManagerTest.in");
        } catch (FileOperationException e) {
            e.printStackTrace();
        }
    }
}
