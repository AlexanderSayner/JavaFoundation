package org.sayner.sandbox.example.easy;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.getTempDirectory;

public class Application {
    public static void main(String[] args) {
        File tempDirectory = getTempDirectory();
        try {
            System.out.println(tempDirectory.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
