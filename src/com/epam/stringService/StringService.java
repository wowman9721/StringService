package com.epam.stringService;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringService {
    private static final int INDEX_OF_GROUP = 1;

    public void zipString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to zip: ");
        String message = scanner.nextLine();
        String resultMessage = "";
        Pattern pattern = Pattern.compile("(.)\\1{0,}");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            resultMessage += matcher.group(INDEX_OF_GROUP);
            int length = matcher.group().length();
            if (length > 1) {
                resultMessage += length;
            }

        }
        System.out.println(resultMessage);

    }

    public void replaceChar() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        System.out.println("Enter number of letter for replacing: ");
        int numberOfChar = scanner.nextInt();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        System.out.println("Enter new letter: ");
        char newChar = (char) bufferedInputStream.read();
        char wordChar[];
        String splittedText[] = text.split(" ");
        for (int i = 0; i < splittedText.length; i++) {
            if (numberOfChar < splittedText[i].length()) {
                wordChar = splittedText[i].toCharArray();
                wordChar[numberOfChar - 1] = newChar;
                splittedText[i] = String.copyValueOf(wordChar);
            }
        }
        for (String newText : splittedText) {
            System.out.print(newText + " ");
        }

    }
}








