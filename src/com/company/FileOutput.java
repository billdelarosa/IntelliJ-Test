package com.company;

import java.io.*;

/**
 * @author William Delarosa
 */

public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     *
     * @param fileName - paramater that holds the name of the file to be output
     * @throws FileNotFoundException - if fileName parameter is invalid
     *
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     *
     * @param line - holds the String output of the file that is being output
     *
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * closes the file output
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}