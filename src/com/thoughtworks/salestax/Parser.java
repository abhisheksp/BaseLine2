package com.thoughtworks.salestax;

import java.util.ArrayList;

/* Parser has a rawinput that it parses and returns tokens */
public class Parser {

    private String rawInput;

    public Parser(String rawInput) {
        this.rawInput = rawInput;
    }

    public ArrayList<String> parse() {
        String[] rawInputSplits = rawInput.split(" ");
        ArrayList<String> tokens = new ArrayList<String>();
        tokens.add(rawInputSplits[0]);
        String tokenTwo = "";
        for (int i = 1; i < rawInputSplits.length - 1; i++) {
            tokenTwo = tokenTwo + " " + rawInputSplits[i];
        }
        tokens.add(tokenTwo.substring(1));
        tokens.add(rawInputSplits[rawInputSplits.length - 1]);
        return tokens;
    }
}
