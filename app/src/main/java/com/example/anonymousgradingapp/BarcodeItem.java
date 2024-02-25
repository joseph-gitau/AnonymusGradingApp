package com.example.anonymousgradingapp;

public class BarcodeItem {
    private String barcode;
    private String name;

    // Constructor
    public BarcodeItem(String barcode, String name) {
        this.barcode = barcode;
        this.name = name;
    }

    // Getters
    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }
}

