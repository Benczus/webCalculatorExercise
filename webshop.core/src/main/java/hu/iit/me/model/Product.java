package hu.iit.me.model;

import java.util.Map;

public class Product {

    private String itemID;
    private String itemName;
    private int price;
    private String manufacturer;
    private String description;
    private Map<Integer, Integer> warranty;

    public Product(String itemID, String itemName, int price, String manufacturer, String description, Map<Integer, Integer> warranty) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
        this.warranty = warranty;
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public Map<Integer, Integer> getWarranty() {
        return warranty;
    }
}
