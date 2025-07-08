// File not Found Exception Handling
// Write a program to read a filename from the user and display its content.
// The Program should handle the situation where the file does not exist
// Key Points
// 1] Use Scanner to read the filename from the user
// 2] Use FileReader to read the file content
// 3] Implement a try-catch block to handle FileNotFoundException
// 4] Display a user-friendly message informing the user if the file is not found


package com.aashish.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file you wish to read");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)) {

            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);

            }
        }catch (FileNotFoundException exception) {
            System.out.printf("%s not found",fileName);

        } catch (IOException exception){
            System.out.printf("Exception occured: %s",
                    exception.getMessage());

        }

    }
}
