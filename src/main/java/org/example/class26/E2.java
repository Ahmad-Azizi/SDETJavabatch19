package org.example.class26;

import org.example.utils.ConfigReader;

import java.io.IOException;

public class E2 {
    public static void main(String[] args) throws IOException {


     String value=   ConfigReader.read("url","C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Config.properties");
        System.out.println(value);

    }
}
