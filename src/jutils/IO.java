package jutils;

import java.util.Scanner;

public class IO {

    private static Scanner scanner;

    public static String readNextLine(){
        return scanner.nextLine();
    }

    public static Double readNextDouble(){
        return Double.parseDouble(scanner.nextLine());
    }

    public static void initScanner(){
        scanner = new Scanner(System.in);
    }

    public static void closeScanner(){
        scanner.close();
    }
}
