package de.hfu;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Text eingeben:");
        String test = sc.next();
        System.out.println(test.toUpperCase());
    }
}
