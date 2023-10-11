package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(args[0]);
        final List<String> lines = Files.readAllLines(path);
        for(final String line: lines) {
            final String[] columns = line.split(",");
            System.out.println(line);
            System.out.println(columns[0]);
            System.out.println("----------------------------------------------------");
        }
    }
}