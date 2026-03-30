package com.crio.xnews;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<UserPreference> readUserPreferences(String filePath)
            throws IOException {

        return objectMapper.readValue(
                new File(filePath),
                new TypeReference<List<UserPreference>>() {}
        );
    }

    // REQUIRED for Gradle run task
    public static void main(String[] args) {
        System.out.println("Hello World from XNews!");
    }
}
