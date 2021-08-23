package com.techelevator;

import java.math.BigDecimal;

public class VendingMachineItem {
    //location|item name|price|category   category message
    private String location;
    private String itemName;
    private BigDecimal price;
    private String category;
    private String categoryMessage;

    //constructor
    public VendingMachineItem(String location, String itemName, BigDecimal price, String category, String categoryMessage) {
        this.location = location;
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.categoryMessage = categoryMessage;
    }

    //getters
    public String getLocation() {
        return location;
    }

    public String getItemName() {
        return itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getCategoryMessage() {
        return categoryMessage;
    }
}
