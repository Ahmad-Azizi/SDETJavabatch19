package org.example.class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // Location of the file
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Config.properties";
        // Navigate to the file or bring the file into the RAM
        FileInputStream fis=new FileInputStream(path);
        // A class which knows how the file works
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("password"));
        //Break till 11:41

    }
}
