package pl.maniaq.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FileManager {
    Random random = new Random();

    public void displayColorTextFromFile(String fileName) throws FileOperationException {
        List<String> lines = loadFileLines(fileName);
        for (String line : lines) {
            line.chars()
                    .mapToObj(word -> (char) word)
                    .forEach(word -> displayColorWord(word));
            System.out.println();
        }
    }

    private void displayColorWord(char word) {
        ConsoleColor color = randomColor();
        System.out.print(color + String.valueOf(word));
    }

    private ConsoleColor randomColor() {
        int colorIndex = random.nextInt(ConsoleColor.values().length);
        return ConsoleColor.values()[colorIndex];
    }

    private List<String> loadFileLines(String fileName) throws FileOperationException {
        List<String> lines = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            String line = bufferedReader.readLine();
            while(line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            return lines;
        } catch (IOException e) {
            throw new FileOperationException(e.getMessage());
        }
    }
}
