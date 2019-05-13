package com.epam.Marina_Tsytsoeva.java.lesson1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * @author  Marina Tsytsoeva
 * Lesson1.task2.version4
 */
public class AppLine {
    public static void main(String[] args) throws IOException {
        AppLine app = new AppLine();
        app.findMinSize();

    }

    public void findMinSize() throws IOException {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number of words:");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number <= 0);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String resultWord = "";
        int resultSize = 2147483647;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter " + (i + 1) + " word:");
            String word = reader.readLine();
            int wordSize = (int) word.chars().distinct().count();
            if (wordSize < resultSize) {
                resultWord = word;
                resultSize = wordSize;
            }
        }
        System.out.println("Answer: " + resultWord + "(different characters=" + resultSize + ")");

    }

}
