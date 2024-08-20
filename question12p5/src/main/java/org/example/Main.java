package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            readfile("file.txt");
        } catch (IOException e){
            System.out.println("Exception occured: " + e);
        }
    }

    public static void readFile(String file) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine() != null)){
            System.out.println(line);
        }
        reader.close();
    }
}