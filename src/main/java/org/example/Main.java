package org.example;
import java.util.Scanner;
import org.example.utils.FileUtils;
import org.example.logic.NotesManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите заметку: ");
        String note = scanner.nextLine();

        String timestamp = FileUtils.getCurrentTimestamp();
        String message = timestamp + " -> " + note;

        NotesManager.addNoteToFile(message);
        System.out.println("заметка дополнена: " + message);

    }
    
}
