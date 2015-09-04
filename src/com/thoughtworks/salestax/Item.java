package com.thoughtworks.salestax;

/* Item has name, grossamount, ifexempted, ifimported and can calculate its net amount */
public class Item {
    private String name;
    private double grossAmount;
    private Boolean isExempted;
    private Boolean isImported;

    public Item(String name, double grossAmount, Boolean isExempted, Boolean isImported) {
        this.name = name;
        this.grossAmount = grossAmount;
        this.isExempted = isExempted;
        this.isImported = isImported;
    }

    public double netAmount() {
            return grossAmount;
    }
}