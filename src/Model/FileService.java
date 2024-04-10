/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author choco
 */
public class FileService {

    private FileService() {
    }
    
    public static String readFile(String path) throws Exception {

        Scanner scanner = new Scanner(new File(path));
        String linea = null;

        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            System.out.println(linea);
        }
        scanner.close();
        return linea;
    }

    public static void writeFile(String path, String text) throws Exception {
        FileWriter writer = new FileWriter(new File(path), false);
        try ( BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(text);
            bufferedWriter.newLine();
        }
        writer.close();
    }
}
