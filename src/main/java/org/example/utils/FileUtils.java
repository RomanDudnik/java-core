package org.example.utils;
import java.util.Date;

import java.io.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileUtils {
    public static void writeToFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(content);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static String getCurrentTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
