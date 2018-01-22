package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author William Delarosa
 */
public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     *
     * @param fileName - paramater that holds the name of the file to be output
     * @throws FileNotFoundException - throws if fileName entered as parameter is invalid
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * reads the fileName input and outputs line-by-line
     * @throws Exception - if the line attempted to be read is null
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     *
     * @return - returns a String of the line that was read to be used for output
     * @return - returns null if there is no lines to read
     * @throws Exception - throws exception if there are no lines to read from the file input
     */
    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * closes the file reader / input
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}