package org.example.Homework1;

import java.util.Scanner;

public class Decorator {
    public static String getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printResult(String result) {
        System.out.println(result);
    }
}
