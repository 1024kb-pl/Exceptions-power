package pl.maniaq;

import pl.maniaq.checked.FileManager;
import pl.maniaq.checked.FileOperationException;
import pl.maniaq.unchecked.UserService;

public class Main {
    private static void testFileManagerWithTryCatch() {
        FileManager fileManager = new FileManager();

        try {
            fileManager.displayColorTextFromFile("fileManagerTest2.in");
        } catch (FileOperationException e) {
            e.printStackTrace();
        }
    }

    private static void testFileManagerWithThrows() throws FileOperationException {
        FileManager fileManager = new FileManager();

        fileManager.displayColorTextFromFile("fileManagerTest.in");
    }

    private static void testUserServiceWithoutTryCatch() {
        UserService userService = new UserService();

        userService.addUser("Kamil", "admin2");
        System.out.println("Utworzono Usera 'Kamil'");
    }


    private static void testUserServiceWithTryCatch() {
        UserService userService = new UserService();

        try {
            userService.addUser("adm", "qw");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private static void testUserServiceWithoutTryCatchWithPassedIncorrectData() {
        UserService userService = new UserService();

        userService.addUser("Pablo", "admin");
        System.out.println("Utworzono Usera 'Pablo'");
    }


    public static void main(String[] args) throws FileOperationException {
        System.out.println("Początek działania programu...");
        testFileManagerWithTryCatch();
        testFileManagerWithThrows();
        testUserServiceWithoutTryCatch();
        testUserServiceWithTryCatch();
        testUserServiceWithoutTryCatchWithPassedIncorrectData();
        System.out.println("Koniec działania programu...");

    }
}
