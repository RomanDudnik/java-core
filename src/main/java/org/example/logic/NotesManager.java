package org.example.logic;

import org.example.utils.FileUtils;

import java.io.File;

public class NotesManager {
    public static void addNoteToFile(String note) {
        FileUtils.writeToFile("notes.txt", note);
    }
}
