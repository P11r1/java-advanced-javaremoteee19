package org.sda.homeworks;

import java.io.*;

/**
 *  Lorem Ipsum homework
 *
 * @author Marko
 */

public class LoremIpsum {
    public static void main(String[] args) {
        String line;
        int count = 0;

        File absoluteFile = new File("C:\\Users\\Marko\\IdeaProjects\\java-advanced\\src\\main\\resources\\loremIpsum.txt");
        File relativeFile = new File("loremIpsum.txt");

        //FILE READING
        try {
            //Opens a file to read
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine; // To store the line of text from the file

            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //COUNT WORDS
        try{
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            //Gets each line till end of file is reached
            while((line = bufferedReader.readLine()) != null) {
                //Splits each line into words
                String[] words = line.split(" ");
                //Counts each word
                count = count + words.length;
            }
            //Prints the counted words
            System.out.println("Number of words in given file: " + count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}