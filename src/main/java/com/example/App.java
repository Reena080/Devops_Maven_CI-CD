package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {

        String message = "hello jenkins";

        System.out.println("Original: " + message);

        System.out.println("Capitalized: " +
                StringUtils.capitalize(message));
    }
}
