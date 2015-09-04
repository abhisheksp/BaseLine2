package com.thoughtworks.salestax;

import java.util.Scanner;

/* Reads input from the user which it passes to a parser */
public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String read(){
        return scanner.nextLine();
    }
}
